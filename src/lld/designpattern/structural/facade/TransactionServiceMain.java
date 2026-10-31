package lld.designpattern.structural.facade;

// Client — assembles and uses the pattern
public class TransactionServiceMain {
    public static void main(String[] args) {
        String transId = "txn122";

        TransactionServiceFacade transactionService = new TransactionServiceFacade(new PaymentService(), new
                SalesService(), new ReceiptService());

        transactionService.checkout(transId);
    }
}
