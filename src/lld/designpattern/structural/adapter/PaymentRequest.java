package lld.designpattern.structural.adapter;


import java.math.BigDecimal;

public class PaymentRequest {
    private BigDecimal amount; // mandatory
    private String transID;
    private String currency;

    public BigDecimal getAmount() {
        return amount;
    }

    public String getTransID() {
        return transID;
    }

    public String getCurrency() {
        return currency;
    }

    private PaymentRequest(Builder builder) {
        this.transID = builder.transID;
        this.amount = builder.amount;
        this.currency = builder.currency;
    }

    public static class Builder {
        private String transID;
        private BigDecimal amount;
        private String currency;

        public Builder setTransID(String transID) {
            this.transID = transID;
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

        public PaymentRequest build() {
            if (amount == null || amount.compareTo(BigDecimal.ZERO) <= 0) {
                throw new IllegalArgumentException("Amount cannot be null or Negative/Zero");
            }

            return new PaymentRequest(this);
        }
    }

}
