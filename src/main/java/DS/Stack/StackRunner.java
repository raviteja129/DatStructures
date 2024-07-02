package OLD.DS.Stack;

public class StackRunner {
    public static void main(String[] args) {
        StackDemo stk = new StackDemo();
        System.out.println("Empty = " + stk.isEmpty());
        stk.push(10);
        stk.push(20);
        stk.push(30);
        stk.push(40);
        stk.show();
        System.out.println("Size of Stack is: " + stk.size());
        System.out.println("Pop Element is: " + stk.pop());
        stk.show();
        System.out.println("Peek Element is: " + stk.peek());
        System.out.println("Empty = " + stk.isEmpty());
    }
}
