package DS.Stack;

import java.util.Stack;

public class ReverseWords {
    public static void main(String[] args) {
        String str = "Hello there";
        reverseWords(str);
    }

    public static void reverseWords(String str) {
        Stack<Character> sk = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                sk.push(str.charAt(i));
            } else {
                while (sk.empty() == false) {
                    System.out.print(sk.pop());
                }
                System.out.print(" ");
            }
        }
        while (sk.empty() == false) {
            System.out.print(sk.pop());
        }
    }
}
