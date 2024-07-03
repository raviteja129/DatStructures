package DS.Arrays;

public class EvenGreaterOdd {
    public static void main(String[] args) {
        int[] arr = {2,1,5,4,6,8,0,9};
        for (int i = 1; i < arr.length; i++) {
            if (i%2 != 0 && arr[i] < arr[i-1]) {
                int temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temp;
            }
        }

        for (int ele: arr) {
            System.out.print(ele + " ");
        }
    }
}
