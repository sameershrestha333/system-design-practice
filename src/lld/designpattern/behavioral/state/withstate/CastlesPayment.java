package lld.designpattern.behavioral.state.withstate;

public class CastlesPayment implements PaymentProcessor {
    @Override
    public void pay() {
        System.out.println("Castle Pay... ");
    }
}
