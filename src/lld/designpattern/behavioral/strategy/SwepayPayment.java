package lld.designpattern.behavioral.strategy;

// Concrete Strategy — implements provider-specific payment behavior
public class SwepayPayment implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("Swepay payment ");
    }
}
