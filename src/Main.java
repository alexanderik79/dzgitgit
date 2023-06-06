public class Main {
    public static void main(String[] args) {
        System.out.println("основная");   // master branch

        System.out.println("ветка dev2");

        BWPrinter bwPrinter = new BWPrinter();
        bwPrinter.print();

        ColorPrinter colorPrinter = new ColorPrinter();
        colorPrinter.print();
        System.out.println("ветка dev1");

        System.out.println("проверка 1");

        System.out.println("ресет сработал");

        System.out.println("проверка amend");

        // revert сделан

        //сквош сделан

        //сделал ребейс своих веток
    }
}