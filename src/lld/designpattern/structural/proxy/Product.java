package lld.designpattern.structural.proxy;

import java.math.BigDecimal;

public class Product {
    private String name;
    private String barcode;
    private BigDecimal amount;

    public Product(String name, String barcode, BigDecimal amount) {
        this.name = name;
        this.barcode = barcode;
        this.amount = amount;
    }
}
