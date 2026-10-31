package lld.designpattern.structural.adapter;

import java.math.BigDecimal;

// Adaptee — existing provider-specific payment API
public class AdyenPayment {
    void pay(BigDecimal amount, String transId, String currency) {
        System.out.println("Adyen Pay for TransID : " + transId + " with amount : " + amount + " and Currency : " + currency);
    }
}
