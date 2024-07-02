package Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {5,7,8,9,10};
        int n = arr.length;
        System.out.println(missingNumber(arr, n));
    }

    public static int missingNumber(int[] arr, int len) {
        int sum = 0;
        int n = len + 1;
        for (int i = 0; i < len; i++) {
            sum = sum + arr[i];
        }
        return ((n * (n+1)) /2 - sum);
    }
}
