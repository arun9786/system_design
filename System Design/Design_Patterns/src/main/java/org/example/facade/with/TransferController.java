//package org.example.facade.with;
//
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/api")
//public class TransferController {
//
//    private final FundTransferFacade transferFacade;
//
//    public TransferController(
//            FundTransferFacade transferFacade) {
//
//        this.transferFacade = transferFacade;
//    }
//
//    @PostMapping("/transfer")
//    public ResponseEntity<String> transfer(
//            @RequestBody TransferRequest request) {
//
//        transferFacade.transfer(request);
//
//        return ResponseEntity.ok(
//                "Transfer successful"
//        );
//    }
//}
