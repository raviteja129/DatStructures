package DS.Stack;

import java.util.Stack;

public class ReverseStack {
    static Stack<Character> st = new Stack<>();
    public static void main(String[] args) {
        st.push('1');
        st.push('2');
        st.push('3');
        st.push('4');

        System.out.print(st + " ");
        System.out.println();

        reverse();

        System.out.print(st + " ");
    }

    public static void reverse() {
        if (st.size() > 0) {
            char x = st.peek();
            st.pop();
            reverse();
            insert(x);
        }
    }

    public static void insert(char x) {
        if (st.isEmpty()) {
            st.push(x);
        } else {
            char a = st.peek();
            st.pop();
            insert(x);
            st.push(a);
        }

    }


}
