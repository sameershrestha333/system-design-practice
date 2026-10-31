package lld.designpattern.creational.factory.withoutfactory;

// Client — assembles and uses the pattern
public class PaymentServiceMain {

    public static void main(String[] args) {
        PurchasePaymentService paymentService = new PurchasePaymentService();
        paymentService.pay("CASTLES");

        FundingPaymentService fundingPaymentService = new FundingPaymentService();
        fundingPaymentService.pay("CASTLES");
    }
}
