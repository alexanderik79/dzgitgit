public class Main {
    public static void main(String[] args) {
        System.out.println("основная");   // master branch

        System.out.println("ветка dev2");

        BWPrinter bwPrinter = new BWPrinter();
        bwPrinter.print();

        ColorPrinter colorPrinter = new ColorPrinter();
        colorPrinter.print();
    }
}