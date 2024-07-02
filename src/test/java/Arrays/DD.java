package Arrays;

public class DD {
    public static void main(String[] args) {
        add(10);
        //System.out.println(result);
    }

    public static int add(int num) {
        if (num > 0) {
            for (int i = num; i > 0 ; i--) {
                if (num %2 == 0) {
                    System.out.println(num + " is Even");
                    return add(num-1);
                } else {
                    System.out.println(num + " is Odd");
                    return add(num-1);
                }
            }
        }
        return 0;
    }
}
