public class reverseNumber {
    public void reverseDigits(int n, int[] revNum, int[] basePos) {
        if (n > 0) {

            reverseDigits(n / 10, revNum, basePos);

            // Add current digit with its base position
            revNum[0] += (n % 10) * basePos[0];
            basePos[0] *= 10;
        }
    }

    public static void main(String[] args) {
        reverseNumber solution = new reverseNumber();
        int n = 4562;
        int[] revNum = { 0 };
        int[] basePos = { 1 };
        solution.reverseDigits(n, revNum, basePos);
        System.out.println(revNum[0]);
    }
}
