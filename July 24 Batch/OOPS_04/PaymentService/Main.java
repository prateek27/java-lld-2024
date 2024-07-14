package OOPS_04.PaymentService;

public class Main {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();

        //Create Objects
        DebitCard dc = new DebitCard("1243","Raushan","11112222");
        UPI upi = new UPI("prateek11@icici");
        CreditCard cc = new CreditCard("4356","Sarthak",10);
        PaytmWallet wallet = new PaytmWallet("9718694333");
        PaymentMethod upi2 = new UPI("xyz@hdfc");

        //Store Objects
        paymentService.addPaymentMethod("RoshansICICICard",dc);
        paymentService.addPaymentMethod("RoshansHDFCCard",cc);


        //By passing any object that implements "PaymentMethod"
        paymentService.makePayment(dc);
        paymentService.makePayment(upi);
        paymentService.makePayment(cc);
        paymentService.makePayment(wallet);
        paymentService.makePayment(upi2);

        //Making payment from already saved cards
        paymentService.makePayment(paymentService.getPaymentMethod("RoshansICICICard"));
        paymentService.makePayment(paymentService.getPaymentMethod("RoshansHDFCCard"));

        //Card as abstract class so that we can't create objects directly out of card
        // Card c = new Card("123","Prateek");

    }
}
