package org.example.openorclosed.correctcode;

class WalletPayment implements PaymentMethod {

    @Override
    public void pay() {
        System.out.println("Processing wallet payment");
    }
}
