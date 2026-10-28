package lld.designpattern.creational.factorymethod;


public class PaymentServiceMain {

    public static void main(String[] args) {
        PaymentProcessorFactory castlesProcessorFactory = new CastlesProcessorFactory();
        castlesProcessorFactory.createPaymentProcessor().pay();

        PaymentProcessorFactory adyenProcessorFactory = new AdyenProcessorFactory();
        adyenProcessorFactory.createPaymentProcessor().pay();
    }
}
