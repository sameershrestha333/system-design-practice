package lld.designpattern.creational.abstractfactory;

import lld.designpattern.creational.factory.withoutfactory.PaymentProcessor;

public class AdyenPayProcessor implements PaymentProcessor {
    @Override
    public void pay() {
        System.out.println("Adyen payment....");
    }
}
