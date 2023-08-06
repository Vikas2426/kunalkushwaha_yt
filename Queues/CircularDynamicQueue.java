public class CircularDynamicQueue {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int end = 0, front = 0, size = 0;

    public CircularDynamicQueue(int size) {
        this.data = new int[size];
    }

    public CircularDynamicQueue() {
        this.data = new int[DEFAULT_SIZE];
    }

    public int getSize() {
        return size;
    }

    public boolean isFull() {
        return size == this.data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void extendQueue() {
        int[] temp = new int[data.length * 2];

        // copy all previous items in new data
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[(front + i) % data.length];
        }
        front = 0;
        end = data.length;
        data = temp;

    }

    public boolean enqueue(int item) {
        if (isFull()) {
            extendQueue();
        }
        this.data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }

    public int dequeque() {
        if (isEmpty()) {
            System.out.print("Queue is empty");
            return -1;
        }
        int removedItem = this.data[front++];
        front = front % data.length;
        size--;
        return removedItem;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.print("Queue is empty");
            return -1;
        }

        return this.data[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        int i = front;
        do {
            System.out.print(data[i++] + " <- ");
            i = i % data.length;
        } while (i != end);
        System.out.println("END");
    }

}
