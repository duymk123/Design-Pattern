//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        PaymentCash paymentCash = new PaymentCash();
        paymentCash.payment();

        PaymentMoMo paymentMoMo = new PaymentMoMo();
        paymentMoMo.payment();

        PaymentZaloPay paymentZaloPay = new PaymentZaloPay();
        paymentZaloPay.payment();

    }

}