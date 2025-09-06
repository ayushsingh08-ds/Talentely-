public class swap {
    public static void main(String[] args) {
        int a = 12, b = 30;
        System.out.println("a =" + a + " b =" + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("after the swap");
        System.out.println("a =" + a + " b =" + b);

    }
}
