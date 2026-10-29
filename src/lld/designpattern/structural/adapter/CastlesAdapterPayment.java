package lld.designpattern.structural.adapter;

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
