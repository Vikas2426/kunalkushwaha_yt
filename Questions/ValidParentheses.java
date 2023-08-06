import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char bracket = s.charAt(i);
            if (bracket == '[' || bracket == '(' || bracket == '{') {
                stack.push(bracket);
            } else {
                int stackElement = stack.peek();
                if (bracket == '}' && stackElement == '{'
                        || bracket == ')' && stackElement == '('
                        || bracket == ']' && stackElement == '[') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String input = "{[()]}";
        System.out.println(isValid(input)); // Output: true
    }
}
