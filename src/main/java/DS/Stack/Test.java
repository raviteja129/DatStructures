package OLD.DS.Stack;

public class Test {
    int[] nums = new int[5];
    int top;

    public boolean isEmpty() {
        return top <= 0;
    }

    public void push(int data) {
        if (top == 5) {
            System.out.println("Stack is full");
        } else {
            nums[top] = data;
            top++;
        }
    }

    public int size() {
        return top;
    }

    public void show() {
        for (int ele:nums) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public int peek() {
        int data;
        data = nums[top-1];
        return data;
    }

    public int pop() {
        int data = 0;
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        } else {
            top--;
            data = nums[top];
            nums[top] = -1;
        }
        return data;
    }
}
