package lld.designpattern.structural.facade;

public class ReceiptService {
    public void printReceipt(String transId) {
        System.out.println("Receipt printed for transID : " + transId);
    }
}
