package lld.designpattern.structural.adapter;

import java.math.BigDecimal;

public class CastlesPayment {
    void pay(BigDecimal amount, String transId) {
        System.out.println("Castles Pay for TransID : " + transId + " with amount : " + amount);
    }
}
