package soulution;

public class ZaloPay implements PayMethod {

    @Override
    public void payment() {
        System.out.println("Payment by ZaloPay");
    }
}
