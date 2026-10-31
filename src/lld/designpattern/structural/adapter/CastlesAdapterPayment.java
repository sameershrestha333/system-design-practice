package lld.designpattern.structural.adapter;

// Adapter — translates the common request into the provider's call
public class CastlesAdapterPayment implements PaymentProcess {

    private final CastlesPayment castlesPayment;

    public CastlesAdapterPayment(CastlesPayment castlesPayment) {
        this.castlesPayment = castlesPayment;
    }

    @Override
    public void pay(PaymentRequest request) {
        castlesPayment.pay(request.getAmount(), request.getTransID());
    }
}
