package lld.solid.lsp.correct;


public class Parrot implements Flyable {

    @Override
    public void eat() {
        System.out.println("Eat");
    }

    @Override
    public void fly() {
        System.out.println("Fly");
    }
}
