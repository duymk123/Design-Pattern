package soulution;

public class Cash implements PayMethod{
    @Override
    public void payment() {
        System.out.println("Payment by Cash");
    }
}
