package lld.designpattern.structural.adapter;

import java.math.BigDecimal;

public class SwepayPayment {
    void pay(BigDecimal amount) {
        System.out.println("Swepay Pay for amount: " + amount);
    }
}
