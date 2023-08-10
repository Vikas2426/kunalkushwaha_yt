import java.util.Stack;
import java.util.Arrays;

public class NextGreaterElement {
    public static int[] nextGreaterElement(int[] input) {
        int len = input.length;
        int[] result = new int[len];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < len; i++) {
            int x = input[i];
            while (!stack.empty() && x > input[stack.peek()]) {
                result[stack.pop()] = x;
            }
            stack.push(i);
        }
        while (!stack.empty()) {
            result[stack.pop()] = -1;
        }
        return result;

    }

    public static void main(String[] args) {
        int[] input = { 1, 3, 4, 2 };
        System.out.println(Arrays.toString(nextGreaterElement(input))); // [3, 4, -1, -1]
    }
}