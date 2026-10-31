package lld.designpattern.structural.proxy;

// Client — assembles and uses the pattern
public class ProductServiceMain_WithCacheProxy {
    public static void main(String[] args) {
        ProductService productService = new ProductServiceProxy(new ProductServiceImp());

        for (int i = 1; i < 10; i++) {
            productService.getProduct("255555");
        }
    }
}
