package lld.designpattern.creational.factory.withoutfactory;

public class AdyenProcessor implements PaymentProcessor {
    @Override
    public void pay() {
        System.out.println("Adyen payment....");
    }
}
