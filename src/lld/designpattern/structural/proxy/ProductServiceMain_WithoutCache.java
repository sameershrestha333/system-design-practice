package lld.designpattern.structural.proxy;

public class ProductServiceMain_WithoutCache {
    public static void main(String[] args) {
        ProductService productService = new ProductServiceImp();

        for (int i = 1; i < 10; i++) {
            productService.getProduct("255555");
        }
    }
}
