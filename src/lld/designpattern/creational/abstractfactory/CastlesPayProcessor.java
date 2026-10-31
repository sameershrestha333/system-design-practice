package lld.designpattern.creational.abstractfactory;

import lld.designpattern.creational.factory.withoutfactory.PaymentProcessor;

// Concrete Product — provider-specific implementation
public class CastlesPayProcessor implements PaymentProcessor {
    @Override
    public void pay() {
        System.out.println("Castles payment....");
    }
}
