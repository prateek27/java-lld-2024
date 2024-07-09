package L07_Synchronisation.InventoryCounterUsingLock;

public class Counter {
    public int count;
    Counter(){
        this.count = 0;
    }
    public void increment(){
        //System.out.println("Adding a Tshirt");
        count++;
    }
    public void decrement(){
        //System.out.println("Buying a Tshirt");
        count--;
    }

    int getCount(){
        return count;
    }
}
