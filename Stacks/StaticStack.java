public class StaticStack {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int ptr = -1;

    public StaticStack(int size) {
        this.data = new int[size];
    }

    public StaticStack() {
        this.data = new int[DEFAULT_SIZE];
    }

    public boolean isFull() {
        return ptr == this.data.length - 1;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }

    public boolean push(int item) throws Exception {
        if (isFull()) {
            throw new Exception("Stack is full");
        }
        this.data[++ptr] = item;
        return true;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty");
        }

        return this.data[ptr--];
    }

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty");
        }

        return this.data[ptr];
    }

}
