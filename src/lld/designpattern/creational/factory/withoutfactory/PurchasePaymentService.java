package lld.designpattern.creational.factory.withoutfactory;

public class PurchasePaymentService {


    void pay(String provider) {
        PaymentProcessor paymentProcessor;
        if ("CASTLES".equals(provider)) {
            paymentProcessor = new CastlesProcessor();
        } else if ("ADYEN".equals(provider)) {
            paymentProcessor = new AdyenProcessor();
        } else {
            throw new IllegalArgumentException("Unknown Provider");
        }
        paymentProcessor.pay();
    }
}
