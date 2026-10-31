package lld.designpattern.structural.proxy;

// Subject interface — shared contract for the proxy and real service
public interface ProductService {

    Product getProduct(String barcode);
}
