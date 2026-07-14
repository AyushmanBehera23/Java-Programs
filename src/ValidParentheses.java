import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
    static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '{' || c == '[' || c == '(') {
                st.push(c);
            }
            else {
                if (st.isEmpty()) {
                    return false;
                }
                if (c == ']' && st.peek() == '[') {
                    st.pop();
                }
                else if (c == '}' && st.peek() == '{') {
                    st.pop();
                }
                else if (c == ')' && st.peek() == '(') {
                    st.pop();
                }
                else {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (isValid(s)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
        sc.close();
    }
}
//ayush