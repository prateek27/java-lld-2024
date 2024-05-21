package L07_Synchronisation.InventoryCounter.SynchronizedKeyword;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter2();
        System.out.println("Counter Initial: " + counter.getCount());

        Thread t1 = new Thread(new Adder(counter));
        Thread t2 = new Thread(new Subtracter(counter));

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Counter Final: " + counter.getCount());
    }
}
