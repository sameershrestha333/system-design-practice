package lld.designpattern.structural.adapter;

import java.math.BigDecimal;

// Adaptee — existing provider-specific payment API
public class SwepayPayment {
    void pay(BigDecimal amount) {
        System.out.println("Swepay Pay for amount: " + amount);
    }
}
