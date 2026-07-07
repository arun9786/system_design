//package org.example.facade.with;
//
//import org.springframework.stereotype.Service;
//
//@Service
//public class FundTransferFacade {
//
//    private final CustomerValidationService validationService;
//    private final AccountService accountService;
//    private final BalanceService balanceService;
//    private final LimitService limitService;
//    private final TransactionService transactionService;
//    private final NotificationService notificationService;
//
//    public FundTransferFacade(
//            CustomerValidationService validationService,
//            AccountService accountService,
//            BalanceService balanceService,
//            LimitService limitService,
//            TransactionService transactionService,
//            NotificationService notificationService) {
//
//        this.validationService = validationService;
//        this.accountService = accountService;
//        this.balanceService = balanceService;
//        this.limitService = limitService;
//        this.transactionService = transactionService;
//        this.notificationService = notificationService;
//    }
//
//    public void transfer(TransferRequest request) {
//
//        validationService.validate(
//                request.getCustomerId()
//        );
//
//        accountService.checkStatus(
//                request.getFromAccount()
//        );
//
//        balanceService.checkBalance(
//                request.getFromAccount(),
//                request.getAmount()
//        );
//
//        limitService.checkLimit(
//                request.getCustomerId(),
//                request.getAmount()
//        );
//
//        transactionService.debit(
//                request.getFromAccount(),
//                request.getAmount()
//        );
//
//        transactionService.credit(
//                request.getToAccount(),
//                request.getAmount()
//        );
//
//        notificationService.sendNotification(
//                request.getCustomerId()
//        );
//    }
//}
