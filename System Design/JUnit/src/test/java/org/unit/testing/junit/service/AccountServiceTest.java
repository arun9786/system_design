package org.unit.testing.junit.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.unit.testing.junit.dto.Account;
import org.unit.testing.junit.repository.AccountRepository;


import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class AccountServiceTest {

    @Mock
    private AccountRepository accountRepository;

    @InjectMocks
    private AccountService accountService;

    @Test
    void testNameAndBalance() {
        Account expected = new Account(1L, "Arun", 50000);

        when(accountRepository.findById(1L)).thenReturn(expected);

        Account actual = accountService.getAccount(1L);

        assertEquals("Arun", actual.getHolderName());
        assertEquals(50000, actual.getBalance());
    }

    @Test
    void testNulAccount() {

        when(accountRepository.findById(2L)).thenReturn(null);

        RuntimeException exception = assertThrows (RuntimeException.class, ()->accountService.getAccount(2L));

        assertEquals("Account not found", exception.getMessage());
    }

    @Test
    void testCreateAccount() {

        accountService.createAccount("Arun", 75000);

        ArgumentCaptor<Account> captor = ArgumentCaptor.forClass(Account.class);

        verify(accountRepository).save(captor.capture());

        Account account = captor.getValue();

        assertEquals("Arun", account.getHolderName());
        assertEquals(75000, account.getBalance());
    }

    @Test
    void testCreateAccountWithInvalidBalance() {

        IllegalArgumentException exception = assertThrows( IllegalArgumentException.class,
                ()-> accountService.createAccount("Arun", -100));

        verify(accountRepository, never()).save(any(Account.class));

        assertEquals("Balance cannot be negative", exception.getMessage());
    }

    @Test
    void testDeleteValidAccount() {
        accountService.deleteAccount(10L);

        verify(accountRepository).deleteById(10L);
    }

    @Test
    void testDeleteInvalidAccount() {
        accountService.deleteAccount(-1L);

        verify(accountRepository, never())
                .deleteById(anyLong());
    }

    @Test
    void testDatabaseDown() {
        when(accountRepository.findById(1L))
                .thenThrow(new RuntimeException("Database Down"));

        RuntimeException exception = assertThrows(RuntimeException.class,
                ()-> accountService.getAccount(1L));

        assertEquals("Database Down", exception.getMessage());
    }
}
