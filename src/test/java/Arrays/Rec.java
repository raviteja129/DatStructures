package Arrays;

public class Rec {
    int result;
    public static void main(String[] args) {
        System.out.println("All Odd Numbers");
        oddEven(1,10);
        System.out.println();
        System.out.println("All Even Numbers");
        oddEven(2,10);

    }

    public static void oddEven(int startVal, int range) {
        if (startVal > range) {
            return;
        } else {
            oddEven(startVal+2, range);
            System.out.print(startVal + " ");
        }
    }
}
