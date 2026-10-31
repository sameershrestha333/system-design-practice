package lld.designpattern.behavioral.state.withstate;

public class CheckoutServiceMain {
    public static void main(String[] args) {
        CheckoutService checkoutService = new CheckoutService(new CastlesPayment());

        checkoutService.addProduct();
        checkoutService.makePayment();
        checkoutService.setCurrentState(new LockedState());

        checkoutService.makePayment();
    }
}
