package DS.Arrays;

public class Move0Right {
    public static void main(String[] args) {
        int[] arr = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        int count=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }
        while (count < arr.length)
            arr[count++] = 0;

        System.out.println("Array after pushing zeros to the back: ");
        for (int i=0; i< arr.length; i++)
            System.out.print(arr[i]+" ");
    }
}
