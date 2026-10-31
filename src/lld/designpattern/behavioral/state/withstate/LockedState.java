package lld.designpattern.behavioral.state.withstate;

// Concrete State — blocks actions during payment
public class LockedState implements CheckoutState {
    @Override
    public void addProduct() {
        System.out.println("Product Cannot be added, payment in progress");
    }

    @Override
    public void removeProduct() {
        System.out.println("Product cannot be removed, payment in progress");
    }

    @Override
    public void abort() {
        System.out.println("Txn cannot be aborted/cancelled, payment in progress");
    }

    @Override
    public void makePayment(CheckoutService checkoutService, PaymentProcessor paymentProcessor) {
        System.out.println("Please wait, payment in progress");
    }
}
