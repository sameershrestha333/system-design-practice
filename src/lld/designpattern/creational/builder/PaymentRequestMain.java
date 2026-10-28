package lld.designpattern.creational.builder;

import java.math.BigDecimal;

public class PaymentRequestMain {
    public static void main(String[] args) {
        PaymentRequest paymentRequest = new PaymentRequest.Builder()
                .setAmount(new BigDecimal(10))
                .setCurrency("USD")
                .setTransId("3455").build();

        // modify something and if we want to update the currency
        PaymentRequest updatedPaymentRequest = paymentRequest.toBuilder().setCurrency("AUD").build();
        System.out.println(updatedPaymentRequest.toString());
    }
}
