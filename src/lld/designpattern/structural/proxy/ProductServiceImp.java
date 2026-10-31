package lld.designpattern.structural.proxy;

import java.math.BigDecimal;

// Real Subject — retrieves products from the database
public class ProductServiceImp implements ProductService {

    @Override
    public Product getProduct(String barcode) {
        // database call
        System.out.println("Querying Database for barcode : " + barcode);
        return new Product("Coke", barcode, new BigDecimal(3));
    }
}
