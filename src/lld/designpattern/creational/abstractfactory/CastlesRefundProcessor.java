package lld.designpattern.creational.abstractfactory;


// Concrete Product — provider-specific implementation
public class CastlesRefundProcessor implements RefundProcessor {
    @Override
    public void refund() {
        System.out.println("Castles refund....");
    }

}
