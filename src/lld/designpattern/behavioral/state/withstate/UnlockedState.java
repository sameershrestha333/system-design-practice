package lld.designpattern.behavioral.state.withstate;

// Concrete State — allows checkout actions
public class UnlockedState implements CheckoutState {
    @Override
    public void addProduct() {
        System.out.println("Product added");
    }

    @Override
    public void removeProduct() {
        System.out.println("Product removed");
    }

    @Override
    public void abort() {
        System.out.println("Txn aborted/cancelled");
    }

    @Override
    public void makePayment(CheckoutService checkoutService, PaymentProcessor paymentProcessor) {
        checkoutService.setCurrentState(new LockedState());
        System.out.println("Payment Started");
        try {
            paymentProcessor.pay();
        } finally {
            checkoutService.setCurrentState(new UnlockedState());
        }
    }
}
