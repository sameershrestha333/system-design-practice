package lld.solid.ocp;

class AdyenPayment implements PaymentProvider {
    @Override
    public void pay(double amount) {
        System.out.println("Processing through Adyen");
    }
}