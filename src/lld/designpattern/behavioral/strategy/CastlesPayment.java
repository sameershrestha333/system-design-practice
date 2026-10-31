package lld.designpattern.behavioral.strategy;

// Concrete Strategy — implements provider-specific payment behavior
public class CastlesPayment implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("Castles payment ");
    }
}
