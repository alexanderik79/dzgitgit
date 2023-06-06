import Flower.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("основная");   // master branch
        // my Fork.repo with Inheritance
        Chamomile chamomile = new Chamomile("Chamomile", "grass", 6, false,
                "peculiar, slightly reminiscent of the smell of apples", "white");

        chamomile.showInfo();
        chamomile.defineTheView();
        chamomile.growHerb();
    }
}