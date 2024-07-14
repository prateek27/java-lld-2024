package OOPS_04.PaymentService;

public class PaytmWallet implements PaymentMethod{

    String phoneNo;

    public PaytmWallet(String phoneNo){
        this.phoneNo = phoneNo;
    }

    @Override
    public void pay() {
        System.out.println("Making payment via PayTm Wallet");
    }
}
