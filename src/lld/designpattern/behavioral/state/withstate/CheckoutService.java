package lld.designpattern.behavioral.state.withstate;

// Context — delegates actions to the current state
public class CheckoutService {
    private final PaymentProcessor paymentProcessor;
    private CheckoutState currentState = new UnlockedState();

    public CheckoutService(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void setCurrentState(CheckoutState checkoutState) {
        this.currentState = checkoutState;
    }

    public void addProduct() {
        currentState.addProduct();
    }


    public void removeProduct() {
        currentState.removeProduct();
    }

    public void abort() {
        currentState.abort();
    }

    public void makePayment() {
        currentState.makePayment(this, paymentProcessor);
    }


}
