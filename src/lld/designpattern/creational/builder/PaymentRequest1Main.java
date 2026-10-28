package lld.designpattern.creational.builder;

import java.math.BigDecimal;

public class PaymentRequest1Main {
    public static void main(String[] args) {
        PaymentRequest1 paymentRequest = new PaymentRequest1("122", new BigDecimal(10), "USD", false, false);

        System.out.println(paymentRequest.toString());
    }
}
