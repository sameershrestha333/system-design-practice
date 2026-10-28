package lld.designpattern.creational.factorymethod;

import lld.designpattern.creational.factory.withoutfactory.CastlesProcessor;
import lld.designpattern.creational.factory.withoutfactory.PaymentProcessor;

public class CastlesProcessorFactory implements PaymentProcessorFactory {
    @Override
    public PaymentProcessor createPaymentProcessor() {
        return new CastlesProcessor();
    }
}
