package lld.solid.lsp.correct;


public class BirdService {
    void makeBirdFly(Flyable flyable) {
        flyable.fly();
    }

    void feedBird(Bird bird) {
        bird.eat();
    }
}
