import java.util.ArrayList;

import javax.sound.midi.SysexMessage;

public class Sub {
    static void subArray(ArrayList<Integer> arr) {
        int n = arr.size();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr.get(k) + " ");
                }
                System.out.println();
            }
        }
    }

    static void printSubArrays(int[] arr, int start, int end) {
        if (end == arr.length)
            return;
        else if (start > end)
            printSubArrays(arr, 0, end + 1);
        else {
            System.out.print("[");
            for (int i = start; i < end; i++) {
                System.out.print(arr[i] + ",");
            }
            System.out.println(arr[end] + "]");
            printSubArrays(arr, start + 1, end);
        }
        return;
    }

    public static void main(String[] args) {
        // Iterative Approach
        /*
         * ArrayList<Integer> arr = new ArrayList<>();
         * arr.add(1);
         * arr.add(2);
         * arr.add(3);
         * System.err.println("All non empty subarrays:");
         * subArray(arr);
         */
        int[] arr = { 1, 2, 3 };
        printSubArrays(arr, 0, 0);
    }
}
