package DS.Stack;

import java.util.Stack;

public class ParanthesisExample {
    public static void main(String[] args) {
        ParanthesisExample pe = new ParanthesisExample();
        System.out.println(pe.ParanthesisCheck());
    }

    public String ParanthesisCheck() {
        String str = "{[()]}";
        char[] ch = str.toCharArray();
        Stack<Character> sk = new Stack<>();
        for (char ele: ch) {
            if (ele == '{' || ele == '[' || ele == '(') {
                sk.push(ele);
            } else {
                if (sk.isEmpty() || !isMatching(sk.pop(), ele)) {
                    return "No";
                }
            }
        }
        return sk.isEmpty() ? "Yes" : "No";
    }

    public boolean isMatching(char open, char close) {
        return (open == '{' && close == '}' || open == '[' && close == ']' || open == '(' && close == ')');
    }
}
