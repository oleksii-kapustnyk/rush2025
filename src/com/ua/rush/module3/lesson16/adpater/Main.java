package com.ua.rush.module3.lesson16.adpater;

public class Main {


    public static void main(String[] args) {
        PaymentService paymentService = new StripeApadter(new StripeApi());

        paymentService.pay(10000);
    }

}
