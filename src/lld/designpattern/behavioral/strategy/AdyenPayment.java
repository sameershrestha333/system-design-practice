package lld.designpattern.behavioral.strategy;

// Concrete Strategy — implements provider-specific payment behavior
public class AdyenPayment implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("Adyen payment ");
    }
}
