package lld.designpattern.creational.factory.withoutfactory;

// Concrete Product — provider-specific payment processor
public class AdyenProcessor implements PaymentProcessor {
    @Override
    public void pay() {
        System.out.println("Adyen payment....");
    }
}
