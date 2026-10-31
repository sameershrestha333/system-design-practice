package lld.designpattern.structural.decoractor;

import lld.designpattern.creational.factory.withoutfactory.AdyenProcessor;
import lld.designpattern.creational.factory.withoutfactory.PaymentProcessor;

// Client — assembles and uses the pattern
public class RetryPaymentProcessorMain {
    public static void main(String[] args) {

        PaymentProcessor paymentProcessor = new RetryDecoratorPaymentProcessor(new AdyenProcessor(), 3);
        //RetryDecoratorPaymentProcessor retryAdyenPaymentProcessor = new RetryDecoratorPaymentProcessor(new AdyenProcessor(), 3);

        paymentProcessor.pay();
    }
}
