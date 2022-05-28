package com.bookmyshow.payment;

public class Payment {

    private IPaymentGateway paymentGateway;

    public Payment(IPaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    void pay() {
        this.paymentGateway.pay();
    }
}
