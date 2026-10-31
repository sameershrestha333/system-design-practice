package lld.designpattern.behavioral.strategy;

// Client — assembles and uses the pattern
public class PaymentServiceMain {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService(new CastlesPayment());

        paymentService.pay();


    }
}
