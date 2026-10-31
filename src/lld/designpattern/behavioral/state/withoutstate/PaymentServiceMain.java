package lld.designpattern.behavioral.state.withoutstate;

public class PaymentServiceMain {
    public static void main(String[] args) {
        CheckoutService checkoutService = new CheckoutService(new CastlesPayment());
        checkoutService.addProduct();
        checkoutService.makePayment();


    }
}
