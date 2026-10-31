package lld.designpattern.creational.abstractfactory;

import lld.designpattern.creational.factory.withoutfactory.PaymentProcessor;

// Concrete Factory — creates a matching provider family
public class CastlesProviderFactory implements AbstractPaymentProviderFactory {
    @Override
    public PaymentProcessor createPaymentProcessor() {
        return new CastlesPayProcessor();
    }

    @Override
    public RefundProcessor createRefundProcessor() {
        return new CastlesRefundProcessor();
    }
}
