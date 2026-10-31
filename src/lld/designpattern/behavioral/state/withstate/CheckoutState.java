package lld.designpattern.behavioral.state.withstate;

// State interface — defines state-dependent actions
public interface CheckoutState {

    void addProduct();

    void removeProduct();

    void abort();

    void makePayment(CheckoutService checkoutService, PaymentProcessor paymentProcessor);
}
