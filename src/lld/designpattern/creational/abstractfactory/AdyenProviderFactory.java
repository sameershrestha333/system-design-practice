package lld.designpattern.creational.abstractfactory;

import lld.designpattern.creational.factory.withoutfactory.PaymentProcessor;

public class AdyenProviderFactory implements AbstractPaymentProviderFactory {
    @Override
    public PaymentProcessor createPaymentProcessor() {
        return new AdyenPayProcessor();
    }

    @Override
    public RefundProcessor createRefundProcessor() {
        return new AdyenRefundProcessor();
    }
}
