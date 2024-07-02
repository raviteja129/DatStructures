package Arrays;

public class Sort0s1s2s {
    public static void main(String[] args) {
        int[] arr= {0,2,1,2,0};
        /*Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }*/

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (int ele: arr) {
            System.out.print(ele + " ");
        }

    }
}
