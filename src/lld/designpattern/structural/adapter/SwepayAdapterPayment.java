package lld.designpattern.structural.adapter;

// Adapter — translates the common request into the provider's call
public class SwepayAdapterPayment implements PaymentProcess {

    private final SwepayPayment swepayPayment;

    public SwepayAdapterPayment(SwepayPayment swepayPayment) {
        this.swepayPayment = swepayPayment;
    }

    @Override
    public void pay(PaymentRequest request) {
        swepayPayment.pay(request.getAmount());
    }
}
