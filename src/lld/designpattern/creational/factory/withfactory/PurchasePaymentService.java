package lld.designpattern.creational.factory.withfactory;

import lld.designpattern.creational.factory.withoutfactory.PaymentProcessor;

public class PurchasePaymentService {


    void pay(String provider) {
        PaymentProcessor paymentProcessor = PaymentProcessorFactory.getInstance(provider);
        paymentProcessor.pay();
    }
}
