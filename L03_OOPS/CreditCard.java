package L03_OOPS;

public class CreditCard extends PaymentMethod{
    void pay(int money){
        System.out.println("Paying via Credit Card "+money );
    }
}
