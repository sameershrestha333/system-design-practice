package lld.solid.lsp;

public class BirdServiceMain {
    public static void main(String[] args) {
        BirdService birdService = new BirdService();
        birdService.makeBirdFly(new Penguin());
    }
}
