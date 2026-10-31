package lld.entity;

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

    public Product(String name, BigDecimal amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public String getBarcode() {
        return barcode;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
