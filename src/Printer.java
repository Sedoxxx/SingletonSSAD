public class Printer {

    private static Printer instance;
    private int printingCount;

    private Printer() {
        printingCount = 0;
    }

    public synchronized static Printer getInstance() {
        if (instance == null) {
            instance = new Printer();
        }
        return instance;
    }

    public void print(String document) {
        printingCount++;
        System.out.println("Printing document #" + printingCount + ": " + document);
    }
}

