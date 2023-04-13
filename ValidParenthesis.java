import java.util.Stack;
public class ValidParenthesis {
    public static void main(String[] args){
        String s="(())()((()))";
        if( isValid(s) )
        System.out.print("valid");
        else
        System.out.print("not valid");

    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
}