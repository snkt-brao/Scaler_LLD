package LLD1.Concurrency.Concurrency2;

public class NumberPrinter implements Runnable {
    int number;

    public NumberPrinter(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println(this.number + " number printer from " + Thread.currentThread().getName());
    }
}
