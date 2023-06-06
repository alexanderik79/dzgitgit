import interfaces.Printable;

public abstract class Printer implements Printable {
    @Override
    public void print() {
        System.out.println("i can print");
    }
}
