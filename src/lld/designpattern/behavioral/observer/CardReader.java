package lld.designpattern.behavioral.observer;

import java.math.BigDecimal;

// Concrete Observer / Subscriber — reacts to cart-total changes
public class CardReader implements CartObserver {
    @Override
    public void updateTotal(BigDecimal total) {
        System.out.println("sales cmd with total :" + total);
    }
}
