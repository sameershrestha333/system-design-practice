package lld.designpattern.creational.factory.withoutfactory;

public class CastlesProcessor implements PaymentProcessor {
    @Override
    public void pay() {
        System.out.println("Castles payment....");
    }
}
