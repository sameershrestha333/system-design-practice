package lld.designpattern.creational.factory.withoutfactory;

// Concrete Product — provider-specific payment processor
public class CastlesProcessor implements PaymentProcessor {
    @Override
    public void pay() {
        System.out.println("Castles payment....");
    }
}
