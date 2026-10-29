package lld.designpattern.structural.adapter;

import java.math.BigDecimal;

public class PaymentServiceMainWithoutAdapter {

    public static void main(String[] args) {
        PaymentRequest paymentRequest = new PaymentRequest.Builder().setTransID("dwe").setCurrency("AUD").setAmount(new BigDecimal(10)).build();

        // without Adapter client has to have seperate call
        CastlesPayment castlesPayment = new CastlesPayment();
        castlesPayment.pay(paymentRequest.getAmount(), paymentRequest.getTransID());

        SwepayPayment swepayPayment = new SwepayPayment();
        swepayPayment.pay(paymentRequest.getAmount());

        AdyenPayment adyenPayment = new AdyenPayment();
        adyenPayment.pay(paymentRequest.getAmount(), paymentRequest.getTransID(), paymentRequest.getCurrency());


    }
}
