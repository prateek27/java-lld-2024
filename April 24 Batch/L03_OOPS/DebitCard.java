package L03_OOPS;

public class DebitCard extends PaymentMethod {
    void pay(int money){
        System.out.println("Paying via Debit Card "+money );
    }
}
