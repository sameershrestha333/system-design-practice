package lld.designpattern.behavioral.observer;

import java.math.BigDecimal;

// Concrete Observer / Subscriber — reacts to cart-total changes
public class KioskUI implements CartObserver {
    @Override
    public void updateTotal(BigDecimal total) {
        System.out.println("total : " + total);
    }
}
