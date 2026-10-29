package lld.designpattern.structural.adapter;

public class AdyenAdapterPayment implements PaymentProcess {

    private final AdyenPayment adyenPayment;

    public AdyenAdapterPayment(AdyenPayment adyenPayment) {
        this.adyenPayment = adyenPayment;
    }

    @Override
    public void pay(PaymentRequest request) {
        adyenPayment.pay(request.getAmount(), request.getTransID(), request.getCurrency());
    }
}
