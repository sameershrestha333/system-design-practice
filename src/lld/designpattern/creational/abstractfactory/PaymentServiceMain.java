package lld.designpattern.creational.abstractfactory;


public class PaymentServiceMain {

    public static void main(String[] args) {
        AbstractPaymentProviderFactory processorFactory = new CastlesProviderFactory();
        processorFactory.createPaymentProcessor().pay();

        processorFactory.createRefundProcessor().refund();


        AbstractPaymentProviderFactory adyenProcessorFactory = new AdyenProviderFactory();
        adyenProcessorFactory.createPaymentProcessor().pay();
        adyenProcessorFactory.createRefundProcessor().refund();

    }
}
