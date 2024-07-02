package OLD.DS.Stack1;

public class StackAlgo1 {
    int[] stk = new int[4];
    int top = 0;

    public void push(int data) {
        stk[top] = data;
        top++;
    }

    public void show() {
        for (int ele : stk) {
            System.out.print(ele + " ");
        }
    }

    public int topVal() {
        int data;
        top--;
        data = stk[top];
        return data;
    }
}
