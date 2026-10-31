package lld.designpattern.structural.facade;

// Subsystem service — handles one part of checkout
public class ReceiptService {
    public void printReceipt(String transId) {
        System.out.println("Receipt printed for transID : " + transId);
    }
}
