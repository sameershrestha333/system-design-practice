package lld.designpattern.creational.factorymethod;

import lld.designpattern.creational.factory.withoutfactory.PaymentProcessor;

public interface PaymentProcessorFactory {
    PaymentProcessor createPaymentProcessor();
}
