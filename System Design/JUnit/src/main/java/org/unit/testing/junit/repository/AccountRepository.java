package org.unit.testing.junit.repository;

import org.unit.testing.junit.dto.Account;

public interface AccountRepository {

    Account findById(Long id);

    Account save(Account account);

    void deleteById(Long id);

}
