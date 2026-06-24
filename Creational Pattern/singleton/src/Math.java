public class Math {

    private static Math instance;
    private int a;
    private int b;

    private Math() {
    }

    private Math(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static Math getInstance(int a, int b) {
        if (instance == null) {
            instance = new Math(a, b);
        }

        return instance;
    }

    public int sum(){
        return a + b;
    }

    public static void main(String[] args) {
        Math m1 = new Math(2,3);
        System.out.println(m1.sum()); //5
        Math m2 = new Math(3,4);
        System.out.println(m2.sum()); //7
    }
}
