package lld.designpattern.structural.facade;

public class TransactionServiceFacade {
    private final PaymentService paymentService;
    private final SalesService salesService;
    private final ReceiptService receiptService;

    public TransactionServiceFacade(PaymentService paymentService, SalesService salesService, ReceiptService receiptService) {
        this.paymentService = paymentService;
        this.salesService = salesService;
        this.receiptService = receiptService;
    }

    public void checkout(String tranId) {
        paymentService.pay(tranId);
        salesService.saveAndClose(tranId);
        receiptService.printReceipt(tranId);
    }
}
