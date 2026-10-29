package lld.designpattern.structural.adapter;

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
