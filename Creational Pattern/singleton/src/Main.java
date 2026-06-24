public class Main {
    public static void main(String[] args) {

        Math m1 = Math.getInstance(2,3);
        System.out.println(m1.sum()); // 5

        Math m2 = Math.getInstance(3,4);
        System.out.println(m2.sum());  //5

        System.out.println(m1 == m2); //true

        Math m3 = Math.getInstance(4,5);
        System.out.println(m3.sum()); //5

//        Math m4 = new //false
    }
}