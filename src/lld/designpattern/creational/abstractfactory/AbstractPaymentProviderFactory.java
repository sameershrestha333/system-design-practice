package lld.designpattern.creational.abstractfactory;

import lld.designpattern.creational.factory.withoutfactory.PaymentProcessor;

public interface AbstractPaymentProviderFactory {
    PaymentProcessor createPaymentProcessor();

    RefundProcessor createRefundProcessor();
}
