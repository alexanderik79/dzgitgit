import Flower.*;
import Plane.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("основная");   // master branch

        // my Fork.repo with Inheritance
        Chamomile chamomile = new Chamomile("Chamomile", "grass", 6, false,
                "peculiar, slightly reminiscent of the smell of apples", "white");

        chamomile.showInfo();
        chamomile.defineTheView();
        chamomile.growHerb();
      
        CombatAircraft f16 = new CombatAircraft("F-16",40,100,4);
        System.out.println();
        f16.showAge();
        f16.startEngine();
        f16.setBombCount(2);
        f16.setRocketLauncher(2);
        f16.dropBomb();
        f16.useRocketLauncher();
        f16.showMaxFlyDistance();
    }
}