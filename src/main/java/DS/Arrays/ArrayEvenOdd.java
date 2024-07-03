package DS.Arrays;

public class ArrayEvenOdd {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 4, 7, 6, 9, 10 };
        int i = -1, j=0;
        while (j != arr.length) {
            if (arr[j] % 2 == 0) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            j++;
        }
        for (int k = 0; k < arr.length; k++)
            System.out.print(arr[k] + " ");
    }
}
