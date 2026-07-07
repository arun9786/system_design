//package org.example.facade.without;
//
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class TransferController {
//
//    private final CustomerValidationService validationService;
//    private final AccountService accountService;
//    private final BalanceService balanceService;
//    private final LimitService limitService;
//    private final TransactionService transactionService;
//    private final NotificationService notificationService;
//
//    @PostMapping("/transfer")
//    public void transfer(TransferRequest request) {
//
//        validationService.validate(request.getCustomerId());
//
//        accountService.checkStatus(request.getFromAccount());
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
