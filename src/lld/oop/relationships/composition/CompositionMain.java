package lld.oop.relationships.composition;

public class CompositionMain {
    public static void main(String[] args) {
        Order order = new Order();

        order.addItem("Burger", 2);
        order.addItem("Coke", 1);

        order.showItems();
        // Burger x 2
        // Coke x 1
    }
}