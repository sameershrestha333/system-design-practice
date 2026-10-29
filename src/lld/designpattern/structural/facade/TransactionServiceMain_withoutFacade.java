package lld.designpattern.structural.facade;

public class TransactionServiceMain_withoutFacade {
    public static void main(String[] args) {
        String transId = "txn122";

        new PaymentService().pay(transId);
        new SalesService().saveAndClose(transId);
        new ReceiptService().printReceipt(transId);
    }
}
