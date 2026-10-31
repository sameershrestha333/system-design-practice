package lld.designpattern.behavioral.observer;

import lld.entity.Product;

import java.math.BigDecimal;

// Client — assembles and uses the pattern
public class CartMain {
    public static void main(String[] args) {
        Cart cart = new Cart();

        cart.subscribe(new KioskUI());
        cart.subscribe(new CardReader());

        Product coke = new Product("Coke", new BigDecimal(4));
        cart.addProduct(coke);


        Product chip = new Product("chip", new BigDecimal(3));
        cart.addProduct(chip);


    }
}
