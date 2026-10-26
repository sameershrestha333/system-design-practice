package lld.solid.dip;

import lld.solid.ocp.PaymentProvider;

public class PaymentService {

    private final PaymentProvider paymentProvider;

    public PaymentService(PaymentProvider paymentProvider) {
        this.paymentProvider = paymentProvider;
    }

    public void checkout(double amount) {
        paymentProvider.pay(amount);
    }
}
