package lld.designpattern.creational.factorymethod;


import lld.designpattern.creational.factory.withoutfactory.AdyenProcessor;
import lld.designpattern.creational.factory.withoutfactory.PaymentProcessor;

// Concrete Creator — creates the provider-specific processor
public class AdyenProcessorFactory implements PaymentProcessorFactory {
    @Override
    public PaymentProcessor createPaymentProcessor() {
        return new AdyenProcessor();
    }
}
