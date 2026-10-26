package lld.solid.dip;

import lld.solid.ocp.SwepayPayment;

public class SwepayPaymentMain {
    public static void main(String[] args) {
        SwepayPayment swepayPayment = new SwepayPayment();

        PaymentService paymentService = new PaymentService(swepayPayment);

        paymentService.checkout(100);
    }
}
