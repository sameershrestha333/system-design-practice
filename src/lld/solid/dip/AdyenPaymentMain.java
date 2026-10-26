package lld.solid.dip;


import lld.solid.ocp.AdyenPayment;

public class AdyenPaymentMain {
    public static void main(String[] args) {
        AdyenPayment adyenPayment = new AdyenPayment();

        PaymentService paymentService = new PaymentService(adyenPayment);

        paymentService.checkout(100);
    }
}
