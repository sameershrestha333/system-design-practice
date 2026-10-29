package lld.designpattern.structural.decoractor;

import lld.designpattern.creational.factory.withoutfactory.PaymentProcessor;

public class RetryDecoratorPaymentProcessor implements PaymentProcessor {

    private final PaymentProcessor paymentProcessor;

    private final int maxTryCount;

    public RetryDecoratorPaymentProcessor(PaymentProcessor paymentProcessor, int maxTryCount) {
        this.paymentProcessor = paymentProcessor;
        this.maxTryCount = maxTryCount;
    }

    @Override
    public void pay() {
        for (int i = 1; i <= maxTryCount; i++) {
            try {
                System.out.println("try count : " + i);
                paymentProcessor.pay();
                return;
            } catch (RuntimeException exception) {
                if (i == maxTryCount) {
                    throw exception;
                }
                System.out.println("Payment failed. Retrying...");
            }

        }

    }
}
