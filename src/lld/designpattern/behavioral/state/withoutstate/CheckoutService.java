package lld.designpattern.behavioral.state.withoutstate;

import static lld.designpattern.behavioral.state.withoutstate.PaymentState.LOCKED;
import static lld.designpattern.behavioral.state.withoutstate.PaymentState.UNLOCKED;

public class CheckoutService {
    private final PaymentProcessor paymentProcessor;
    private PaymentState state = UNLOCKED;

    public CheckoutService(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void addProduct() {
        if (state == LOCKED) {
            System.out.println("Processing... product cannot be added. ");
            return;
        }
        System.out.println("Product added");
    }


    public void removeProduct() {
        if (state == LOCKED) {
            System.out.println("Processing... product cannot be removed. ");
            return;
        }
        System.out.println("Product removed");
    }

    public void abort() {
        if (state == LOCKED) {
            System.out.println("Processing... cannot be abort/cancel ");
            return;
        }
        System.out.println("Txn aborted/cancelled");
    }

    public void makePayment() {
        if (state == LOCKED) {
            System.out.println("Processing... Please wait. ");
            return;
        }
        try {
            state = LOCKED;
            System.out.println("payment state :" + state);
            paymentProcessor.pay();
        } finally {
            state = UNLOCKED;
            System.out.println("payment state :" + state);
        }
    }


}
