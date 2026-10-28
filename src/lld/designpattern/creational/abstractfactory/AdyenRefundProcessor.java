package lld.designpattern.creational.abstractfactory;


public class AdyenRefundProcessor implements RefundProcessor {
    @Override
    public void refund() {
        System.out.println("Adyen refund....");
    }

}
