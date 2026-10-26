package lld.solid.lsp;

public class Parrot implements Bird {

    @Override
    public void eat() {
        System.out.println("Eat");
    }

    @Override
    public void fly() {
        System.out.println("Fly");
    }
}
