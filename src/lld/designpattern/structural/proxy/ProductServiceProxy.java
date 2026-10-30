package lld.designpattern.structural.proxy;

import java.util.HashMap;
import java.util.Map;

public class ProductServiceProxy implements ProductService {
    private final Map<String, Product> cacheMap = new HashMap<>();
    private final ProductService productService;

    public ProductServiceProxy(ProductService productService) {
        this.productService = productService;
    }

    @Override
    public Product getProduct(String barcode) {
        if (cacheMap.containsKey(barcode)) {
            System.out.println("From Cache for barcode : " + barcode);
            return cacheMap.get(barcode);
        } else {
            Product product = productService.getProduct(barcode);
            cacheMap.put(barcode, product);
            return product;
        }
    }
}
