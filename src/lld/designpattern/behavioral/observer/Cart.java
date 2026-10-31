package lld.designpattern.behavioral.observer;

import lld.entity.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

// Subject / Publisher — maintains observers and publishes total changes
public class Cart {
    private final List<CartObserver> observers = new ArrayList<>();
    private BigDecimal total = BigDecimal.ZERO;

    public void subscribe(CartObserver observer) {
        observers.add(observer);
    }

    public void addProduct(Product product) {
        total = total.add(product.getAmount());

        notifyObservers();
    }

    private void notifyObservers() {
        for (CartObserver observer : observers) {
            observer.updateTotal(total);
        }
    }
}
