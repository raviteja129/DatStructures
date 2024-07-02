package Arrays;

public class RecursionDemo1 {
    public static void main(String[] args) {
        int result = addNums(4);
        System.out.println(result);
    }

    public static int addNums(int n) {
        if (n == 0) {
            return 0;
        } else {
            System.out.println(n + " -- " + (n-1));
            return n + addNums(n - 1);
        }
    }
}
