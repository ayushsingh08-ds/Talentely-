public class nthtermOf_AP {
    public static int nth(int a1, int a2, int n) {
        return (a1 + (n - 1) * (a2 - a1));
    }

    public static void main(String[] args) {
        int a1 = 1, a2 = 20, n = 4;
        System.out.println(nth(a1, a2, n));
    }
}