package soulution;

public class PaymentFactory {
    public PayMethod createPayMethod(String payType) {

        if (payType.equals("Cash")) {
            return new Cash();
        } else if (payType.equals("MoMo")) {
            return new MoMo();
        } else if (payType.equals("ZaloPay")) {
            return new ZaloPay();
        }

        return null;
    }
}
