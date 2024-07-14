package OOPS_04.PaymentService;

public class DebitCard extends Card implements PaymentMethod{

    String bankAccountNumber;

    DebitCard(String cardNo, String holderName,String bankAccountNumber) {
        super(cardNo, holderName);
        this.bankAccountNumber = bankAccountNumber;
    }

    @Override
    public void pay() {
        //business logic
        System.out.println("Making payment via debit card from account no "+bankAccountNumber);
    }
}
