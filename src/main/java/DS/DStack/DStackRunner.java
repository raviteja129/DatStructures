package OLD.DS.DStack;

public class DStackRunner {
    public static void main(String[] args) {
        DStackDemo dstk = new DStackDemo();
        dstk.push(10);
        dstk.push(20);
        dstk.push(30);
        dstk.show();
        System.out.println("Size is: " + dstk.size());
        System.out.println("Pop Elemnt is: " + dstk.pop());
        System.out.println("Pop Elemnt is: " + dstk.pop());
        System.out.println("Pop Elemnt is: " + dstk.pop());
        System.out.println("Pop Elemnt is: " + dstk.pop());
        System.out.println("Peek Element is: " + dstk.peek());
        System.out.println("Size is: " + dstk.size());
    }
}
