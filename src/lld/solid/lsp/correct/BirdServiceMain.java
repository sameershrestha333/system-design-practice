package lld.solid.lsp.correct;


public class BirdServiceMain {
    public static void main(String[] args) {
        BirdService birdService = new BirdService();

        Penguin penguin = new Penguin();
        birdService.feedBird(penguin);
        // Won't compile: Penguin does not implement Flyable.
        // birdService.makeBirdFly(penguin);

        Parrot parrot = new Parrot();
        birdService.makeBirdFly(parrot);
        birdService.feedBird(parrot);


    }
}
