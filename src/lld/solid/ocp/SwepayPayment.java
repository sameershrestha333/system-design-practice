package lld.solid.ocp;

public class SwepayPayment implements PaymentProvider {
    @Override
    public void pay(double amount) {
        System.out.println("Processing through Swepay");
    }
}