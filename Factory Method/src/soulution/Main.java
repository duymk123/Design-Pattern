package soulution;

public class Main {
    public static void main(String[] args) {
        PaymentFactory factory = new PaymentFactory();

        PayMethod cash = factory.createPayMethod("Cash");
        cash.payment();

        PayMethod momo = factory.createPayMethod("MoMo");
        momo.payment();

        PayMethod zaloPay = factory.createPayMethod("ZaloPay");
        zaloPay.payment();
    }
}
