package lld.designpattern.structural.facade;

// Subsystem service — handles one part of checkout
public class PaymentService {
    public void pay(String transId) {
        System.out.println("Payment success for transID : " + transId);
    }
}
