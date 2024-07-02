package OLD.DS.DStack;

public class DStackDemo {
    int capacity = 1;
    int[] stack = new int[capacity];
    int top;

    public int size() {
        return top;
    }

    public void push(int data) {
        if (size()== capacity) {
            expand();
        }
        stack[top] = data;
        top++;
    }

    public void expand() {
        int length = size();
        int[] newStack = new int[capacity+1];
        System.arraycopy(stack,0,newStack,0,length);
        stack = newStack;
        capacity += 1;
    }

    public void show() {
        for (int ele: stack) {
            System.out.print(ele + " ");
        }
        System.out.println();
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
            data = stack[top];
            stack[top] = -1;
        }

        return data;
    }

    public int peek() {
        int data = 0;
        if (isEmpty()) {
            System.out.println("No Peek Elements");
        } else {
            data = stack[top-1];
        }
        return data;
    }
}
