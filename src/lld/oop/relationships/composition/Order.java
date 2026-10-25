package lld.oop.relationships.composition;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<OrderItem> items = new ArrayList<>();

    public void addItem(String productName, int quantity) {
        if (productName == null || productName.isBlank()) {
            throw new IllegalArgumentException("Product name is required");
        }
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be positive");
        }

        items.add(new OrderItem(productName, quantity));
    }

    public void showItems() {
        for (OrderItem item : items) {
            System.out.println(item.productName + " x " + item.quantity);
        }
    }

    private static class OrderItem {
        private final String productName;
        private final int quantity;

        private OrderItem(String productName, int quantity) {
            this.productName = productName;
            this.quantity = quantity;
        }
    }
}
