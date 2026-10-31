package lld.designpattern.behavioral.observer;


import java.math.BigDecimal;

// Observer interface — receives cart-total updates
public interface CartObserver {
    void updateTotal(BigDecimal total);
}
