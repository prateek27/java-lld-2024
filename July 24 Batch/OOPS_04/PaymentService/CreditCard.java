package OOPS_04.PaymentService;

public class CreditCard extends Card implements PaymentMethod{
    private int maxLimit;
    CreditCard(String cardNo, String holderName,int maxLimit) {
        super(cardNo, holderName);
        this.maxLimit = maxLimit;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "maxLimit=" + maxLimit +
                ", cardNo='" + cardNo + '\'' +
                ", holderName='" + holderName + '\'' +
                '}';
    }

    @Override
    public void pay() {
        System.out.println("Making payment via Credit Card "  + cardNo);
    }
}
