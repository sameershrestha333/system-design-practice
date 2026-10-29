package lld.designpattern.structural.adapter;

import java.math.BigDecimal;

public class PaymentServiceMain {

    public static void main(String[] args) {
        PaymentRequest paymentRequest = new PaymentRequest.Builder().setTransID("dwe").setCurrency("AUD").setAmount(new BigDecimal(10)).build();

        PaymentProcess paymentProcessCastles = new CastlesAdapterPayment(new CastlesPayment());
        paymentProcessCastles.pay(paymentRequest);

        PaymentProcess paymentProcessSwepay = new SwepayAdapterPayment(new SwepayPayment());
        paymentProcessSwepay.pay(paymentRequest);

        PaymentProcess paymentProcessAdyen = new AdyenAdapterPayment(new AdyenPayment());
        paymentProcessAdyen.pay(paymentRequest);

    }
}
