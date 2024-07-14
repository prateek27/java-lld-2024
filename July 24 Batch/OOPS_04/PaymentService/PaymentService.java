package OOPS_04.PaymentService;

import java.util.HashMap;
import java.util.Map;

//Payment Gateway
public class PaymentService {

    Map<String,PaymentMethod> paymentMethods;

    PaymentService(){
        paymentMethods = new HashMap<>();
    }

    public void addPaymentMethod(String key,PaymentMethod pm){
        //Database Query Insert
        //Insert into HashMap (for now)
        paymentMethods.putIfAbsent(key,pm);
    }
    public PaymentMethod getPaymentMethod(String key){
        return paymentMethods.get(key);
    }
    public void makePayment(PaymentMethod pm){
        pm.pay();
    }
}
