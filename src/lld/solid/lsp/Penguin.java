package lld.solid.lsp;

public class Penguin implements Bird {

    @Override
    public void eat() {
        System.out.println("Eat");
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguin cannot fly");
    }
}
