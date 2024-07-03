package DS.Arrays;

public class Find3argestNumber {
    static int first, second,third;
    public static void main(String[] args) {
        int[] arr = {20,10,3,4,90};
        find3LargestNumber(arr);
    }

    public static void find3LargestNumber(int[] arr) {
        int size = arr.length;
        if (size < 3) {
            System.out.println("Invali Input");
        }

        first = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] > first)
                first = arr[i];
        }
        second = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] > second && arr[i] < first)
                second = arr[i];
        }
        third = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] > third && arr[i] < second)
                third = arr[i];
        }

        System.out.println("Third Largest Number is: " + third);
        System.out.println("Second Largest Number is: " + second);
        System.out.println("First Largest Number is: " + first);
    }
}
