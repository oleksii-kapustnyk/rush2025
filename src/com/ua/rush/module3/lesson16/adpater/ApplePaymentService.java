package com.ua.rush.module3.lesson16.adpater;

public class ApplePaymentService implements PaymentService {

    @Override
    public void pay(int amount) {
        //9.99
        //99900
        System.out.println("ApplePay payment of " + amount + " made");
    }

}
