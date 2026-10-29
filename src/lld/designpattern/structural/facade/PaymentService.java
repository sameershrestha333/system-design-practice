package lld.designpattern.structural.facade;

public class PaymentService {
    public void pay(String transId) {
        System.out.println("Payment success for transID : " + transId);
    }
}
