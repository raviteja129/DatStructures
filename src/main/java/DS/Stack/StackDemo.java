package OLD.DS.Stack;

public class StackDemo {
    int[] nums = new int[4];
    int top;

    public int size() {
        return top;
    }

    public void push(int data) {
        if (top == nums.length) {
            System.out.println("Stack is Full");
        } else {
            nums[top] = data;
            top++;
        }
    }

    public boolean isEmpty() {
        return top <= 0;
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

    public void show() {
        for (int ele: nums) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public int peek() {
        int data = 0;
        if (isEmpty()) {
            System.out.println("No Elemnts for peek");
        } else {
            data = nums[top-1];
        }
        return data;
    }
}
