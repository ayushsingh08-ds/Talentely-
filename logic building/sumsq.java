public class sumsq {
    public static int sum(int n) {
        return (n * (n + 1) * (2 * n + 1)) / 6;
    }

    public static void main(String[] agrs) {
        int n = 15;
        System.out.println(sum(n));
    }
}
