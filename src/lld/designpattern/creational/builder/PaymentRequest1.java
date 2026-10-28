package lld.designpattern.creational.builder;

import java.math.BigDecimal;

public class PaymentRequest1 {
    private String transId;
    private BigDecimal amount;
    private String currency;
    private boolean allowOfflineTxn;
    private boolean isEbt;

    public PaymentRequest1(String transId, BigDecimal amount, String currency, boolean allowOfflineTxn, boolean isEbt) {
        this.transId = transId;
        this.amount = amount;
        this.currency = currency;
        this.allowOfflineTxn = allowOfflineTxn;
        this.isEbt = isEbt;
    }

    @Override
    public String toString() {
        return "PaymentRequest1{" + "transId='" + transId + '\'' + ", amount=" + amount + ", currency='" + currency + '\'' + ", allowOfflineTxn=" + allowOfflineTxn + ", isEbt=" + isEbt + '}';
    }
}
