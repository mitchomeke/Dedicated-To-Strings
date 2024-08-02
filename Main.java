import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        Stack<Character> st = new Stack<Character>();
        for (int i = 0; i < str.length();i++){
            char ch = str.charAt(i);
            if (st.isEmpty()){
                st.push(ch);
            }
            else if (ch == '{' || ch == '[' || ch == '('){
                st.push(ch);
            }
            else if (ch == ')' && st.peek() == '('){
                st.pop();
            }
            else if (ch == ']' && st.peek() == '['){
                st.pop();
            }
            else if (ch == '}' && st.peek() == '{'){
                st.pop();
            }
        }
        if (st.isEmpty()){
            System.out.println("yeah it´s a balanced string!");
        }else {
            System.out.println("no, it´s not a balanced string.");
        }
    }
}