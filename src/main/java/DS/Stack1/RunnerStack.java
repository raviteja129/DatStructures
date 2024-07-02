package OLD.DS.Stack1;

public class RunnerStack {
    public static void main(String[] args) {
        StackAlgo1 stack = new StackAlgo1();
        stack.push(8);
        stack.push(7);
        stack.push(12);
        stack.push(15);

        System.out.println("-- Values in the Stack --");
        stack.show();
        System.out.println();

        System.out.println("-- Top value is --");
        System.out.println(stack.topVal());
    }
}
