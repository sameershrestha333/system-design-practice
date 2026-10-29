package lld.designpattern.structural.adapter;

import java.math.BigDecimal;

public class AdyenPayment {
    void pay(BigDecimal amount, String transId, String currency) {
        System.out.println("Adyen Pay for TransID : " + transId + " with amount : " + amount + " and Currency : " + currency);
    }
}
