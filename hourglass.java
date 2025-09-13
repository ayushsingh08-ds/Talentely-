public class hourglass {
    // Function to find maximum hourglass sum in a matrix
    public static int maxHourglassSum(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < m - 2; j++) {
                int sum = mat[i][j] + mat[i][j + 1] + mat[i][j + 2]
                        + mat[i + 1][j + 1]
                        + mat[i + 2][j] + mat[i + 2][j + 1] + mat[i + 2][j + 2];
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[][] mat = {
                { 1, 2, 3, 0, 0 },
                { 0, 0, 0, 0, 0 },
                { 2, 1, 4, 0, 0 },
                { 0, 0, 0, 2, 0 },
                { 1, 1, 0, 1, 0 }
        };
        System.out.println("Maximum hourglass sum: " + maxHourglassSum(mat));
    }
}
