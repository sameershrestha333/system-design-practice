package lld.designpattern.creational.factorymethod;

import lld.designpattern.creational.factory.withoutfactory.PaymentProcessor;

// Creator — declares the factory method
public interface PaymentProcessorFactory {
    PaymentProcessor createPaymentProcessor();
}
