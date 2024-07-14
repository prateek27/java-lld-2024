package OOPS_04.PaymentService;

public abstract class Card {
    protected String cardNo;
    protected String holderName;

    Card(String cardNo,String holderName){
        this.cardNo = cardNo;
        this.holderName = holderName;
    }
}
