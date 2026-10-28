package lld.designpattern.creational.factorymethod;


import lld.designpattern.creational.factory.withoutfactory.AdyenProcessor;
import lld.designpattern.creational.factory.withoutfactory.PaymentProcessor;

public class AdyenProcessorFactory implements PaymentProcessorFactory {
    @Override
    public PaymentProcessor createPaymentProcessor() {
        return new AdyenProcessor();
    }
}
