package DS.Arrays;

public class Print3LargestNumbers {
    static int first,second,third;
    public static void main(String[] args) {
        int[] arr = {100,6,3,20,40,90,10};
        print3LargestNumbers(arr);
    }

    public static void print3LargestNumbers(int[] arr) {
        int arrSize = arr.length;
        if (arrSize < 3) {
            System.out.println("Invalid Input");
        }

        for (int i = 0; i < arrSize; i++) {
            if (arr[i] > first) {
                third = second;
                second= first;
                first = arr[i];
            }
            else if (arr[i] > second) {
                third = second;
                second = arr[i];
            }
            else if (arr[i] > third){
                third = arr[i];
            }
        }
        System.out.println(first + " " + second + " " + third);
    }
}
