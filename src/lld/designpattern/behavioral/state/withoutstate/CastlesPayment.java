package lld.designpattern.behavioral.state.withoutstate;

public class CastlesPayment implements PaymentProcessor {
    @Override
    public void pay() {
        System.out.println("Castle Pay... ");
    }
}
