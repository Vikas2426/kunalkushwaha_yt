public class DynamicStack extends StaticStack {
    public DynamicStack() {
        super();
    }

    public DynamicStack(int size) {
        super(size);
    }

    private void extendStack() {
        int[] newData = new int[this.data.length * 2];
        for (int i = 0; i < this.data.length; i++) {
            newData[i] = data[i];
        }
        System.out.println("Extended!!");
        data = newData;
    }

    @Override
    public boolean push(int item) throws Exception {
        if (super.isFull()) {
            extendStack();
        }
        return super.push(item);
    }

}
