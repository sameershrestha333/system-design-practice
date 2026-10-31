package lld.designpattern.creational.abstractfactory;

import lld.designpattern.creational.factory.withoutfactory.PaymentProcessor;

// Abstract Factory — creates related payment and refund processors
public interface AbstractPaymentProviderFactory {
    PaymentProcessor createPaymentProcessor();

    RefundProcessor createRefundProcessor();
}
