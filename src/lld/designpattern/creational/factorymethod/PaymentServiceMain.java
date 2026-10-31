package lld.designpattern.creational.factorymethod;


// Client — assembles and uses the pattern
public class PaymentServiceMain {

    public static void main(String[] args) {
        PaymentProcessorFactory castlesProcessorFactory = new CastlesProcessorFactory();
        castlesProcessorFactory.createPaymentProcessor().pay();

        PaymentProcessorFactory adyenProcessorFactory = new AdyenProcessorFactory();
        adyenProcessorFactory.createPaymentProcessor().pay();
    }
}
