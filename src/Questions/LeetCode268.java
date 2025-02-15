package Questions;
public class LeetCode268 {
    public static void main(String[] args) {
        int[] arr = {3, 0, 1};
        int missing = missingNumber(arr);
        System.out.println("Missing number: " + missing);
    }
    static int missingNumber(int[] arr) {
        int n = arr.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
}
