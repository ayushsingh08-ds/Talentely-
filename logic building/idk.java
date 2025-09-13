
public class idk {
    public static void main(String[] args) {
        int n = 98;
        boolean[] doors = new boolean[n]; // false = closed, true = open
        int open = 0;
        int close = 0;
        for (int pass = 1; pass <= n; pass++) {
            for (int i = pass - 1; i < n; i += pass) {
                doors[i] = !doors[i];
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Door " + (i + 1) + ": " + (doors[i] ? "Open" : "Closed"));
            if (doors[i]) {
                open++;
            }
            close++;
        }
        System.out.println("total number of opened door " + open);
        System.out.println("total number of closed door " + close);

        int z = (int) Math.sqrt(n);
        System.out.println("Number of opened door " + z);

    }
}
