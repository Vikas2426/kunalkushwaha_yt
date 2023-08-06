import java.util.Stack;

public class MinAddToMakeValid {
    public static int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            char bracket = s.charAt(i);
            if (bracket == '(') {
                stack.push(bracket);
            } else if (bracket == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else {
                ans++;
            }
        }
        return stack.size() + ans;
    }

    public static void main(String[] args) {
        String input = "((())";
        System.out.println(minAddToMakeValid(input)); // Output: 1
    }
}
