package lld.solid.ocp;

public class AdyenPayment implements PaymentProvider {
    @Override
    public void pay(double amount) {
        System.out.println("Processing through Adyen");
    }
}