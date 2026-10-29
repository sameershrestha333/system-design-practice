package lld.designpattern.structural.composite;

import java.math.BigDecimal;

public class MenuItemImp implements MenuItem {
    private String name;
    private BigDecimal amount;

    public MenuItemImp(String name, BigDecimal amount) {
        this.name = name;
        this.amount = amount;
    }

    @Override
    public void display() {
        System.out.println(name + " " + amount);
    }
}
