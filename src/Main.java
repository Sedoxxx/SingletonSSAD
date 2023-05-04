public class Main {
    public static void main(String[] args) {
        Printer printer1 = Printer.getInstance();
        Printer printer2 = Printer.getInstance();

        printer1.print("First document");
        printer2.print("Second document");
    }
}
