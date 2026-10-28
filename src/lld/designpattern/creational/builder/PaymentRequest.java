package lld.designpattern.creational.builder;

import java.math.BigDecimal;

public class PaymentRequest {
    private String transId;
    private BigDecimal amount;
    private String currency;
    private boolean allowOfflineTxn;
    private boolean isEbt;

    // this ensures callers create PaymentRequest object through the Builder (not directly):
    private PaymentRequest(Builder builder) {
        this.transId = builder.transId;
        this.amount = builder.amount;
        this.currency = builder.currency;
        this.allowOfflineTxn = builder.allowOfflineTxn;
        this.isEbt = builder.isEbt;

    }

    public Builder toBuilder() {
        return new Builder()
                .setTransId(transId)
                .setAmount(amount)
                .setCurrency(currency)
                .setAllowOfflineTxn(allowOfflineTxn)
                .setEbt(isEbt);
    }

    public static class Builder {
        private String transId;
        private BigDecimal amount;
        private String currency;
        private boolean allowOfflineTxn;
        private boolean isEbt;

        // setter-like methods that return the Builder, so calls can be chained. Getters aren’t required
        public Builder setTransId(String transId) {
            this.transId = transId;
            return this;
        }

        public Builder setAmount(BigDecimal amount) {
            this.amount = amount;
            return this;
        }

        public Builder setCurrency(String currency) {
            this.currency = currency;
            return this;
        }

        public Builder setAllowOfflineTxn(boolean allowOfflineTxn) {
            this.allowOfflineTxn = allowOfflineTxn;
            return this;
        }

        public Builder setEbt(boolean ebt) {
            isEbt = ebt;
            return this;
        }

        public PaymentRequest build() {
            if (transId == null || transId.isBlank()) {
                throw new IllegalArgumentException("TransId is required.");
            }

            if (amount == null || amount.compareTo(BigDecimal.ZERO) <= 0) {
                throw new IllegalArgumentException("Amount must be positive");
            }

            if (currency == null || currency.isBlank()) {
                throw new IllegalArgumentException("currency is required.");
            }
            return new PaymentRequest(this);
        }


    }

    @Override
    public String toString() {
        return "PaymentRequest{" + "transId='" + transId + '\'' + ", amount=" + amount + ", currency='" + currency + '\'' + ", allowOfflineTxn=" + allowOfflineTxn + ", isEbt=" + isEbt + '}';
    }
}
