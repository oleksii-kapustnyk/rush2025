package com.ua.rush.module3.lesson16.adpater;

public class StripeApadter implements PaymentService {

    private final StripeApi stripeApi;

    public StripeApadter(StripeApi stripeApi) {
        this.stripeApi = stripeApi;
    }

    @Override
    public void pay(int amount) {
        stripeApi.pay(amount / 100.0);
    }

}
