package lld.designpattern.creational.abstractfactory;


// Concrete Product — provider-specific implementation
public class AdyenRefundProcessor implements RefundProcessor {
    @Override
    public void refund() {
        System.out.println("Adyen refund....");
    }

}
