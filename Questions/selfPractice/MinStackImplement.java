import java.util.Stack;

class MinVal {
    int min;
    int val;

    public int getMin() {
        return this.min;
    }

    public int getVal() {
        return this.val;
    }

    public MinVal(int min, int val) {
        this.min = min;
        this.val = val;
    }
}

class MinStack {
    int min;

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public MinStack() {
    }

    public void push(int val) {
        if (this.minStack.isEmpty() || this.minStack.peek() >= val) {
            this.minStack.push(val);
        }
        this.stack.push(val);
    }

    public void pop() {
        int stackPeek = this.stack.peek();
        int minStackPeek = this.minStack.peek();
        if (stackPeek == minStackPeek) {
            this.minStack.pop();
        }
        this.stack.pop();
    }

    public int top() {
        return this.stack.peek();
    }

    public int getMin() {
        return this.minStack.peek();
    }

}

public class MinStackImplement {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(512);
        minStack.push(-1024);
        minStack.push(-1024);
        minStack.push(512);
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
        // System.out.println(minStack.getMin());
        // System.out.println(minStack.top());
        // System.out.println(minStack.getMin());
        // minStack.pop();
        // minStack.push(10);
        // minStack.push(-7);
        // System.out.println(minStack.getMin());
        // minStack.push(-7);
        // minStack.pop();
        // System.out.println(minStack.top());
        // System.out.println(minStack.getMin());
        // minStack.pop();
    }
}