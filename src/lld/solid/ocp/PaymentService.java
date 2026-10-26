package lld.solid.ocp;

class PaymentService {
    public void checkout(PaymentProvider provider, double amount) {
        provider.pay(amount);
    }
}