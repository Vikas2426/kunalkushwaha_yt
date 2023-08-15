import java.util.Stack;

class Solution {
    public String removeDuplicates(String s) {
        if (s.length() < 2)
            return s;
        Stack<Character> stack = new Stack<>();
        StringBuilder output = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(c);
                continue;
            }
            if (stack.peek() != c) {
                stack.push(c);
                continue;
            } else {
                stack.pop();
            }
        }
        while (!stack.isEmpty()) {
            output.append(stack.pop());
        }
        return output.reverse().toString();
    }
}

class RemoveDuplicates {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.removeDuplicates("abbaca"));
    }
}