package lld.designpattern.creational.abstractfactory;


public class CastlesRefundProcessor implements RefundProcessor {
    @Override
    public void refund() {
        System.out.println("Castles refund....");
    }

}
