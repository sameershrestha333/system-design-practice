package lld.solid.ocp;

public class PaymentServiceMain {
    public static void main(String[] args) {
        PaymentService service = new PaymentService();
        service.checkout(new AdyenPayment(), 100);
        service.checkout(new SwepayPayment(), 100);
    }
}
