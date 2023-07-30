public class StackMain {

    public static void main(String[] args) throws Exception {
        StaticStack cs = new StaticStack(5);
        System.out.println("push : " + cs.push(3));
        System.out.println("peek : " + cs.peek());
        System.out.println("pop : " + cs.pop());
        System.out.println("push : " + cs.push(3));
        System.out.println("push : " + cs.push(4));
        System.out.println("push : " + cs.push(5));
        System.out.println("peek : " + cs.peek());
        System.out.println("pop : " + cs.pop());
        System.out.println("pop : " + cs.pop());
        System.out.println("pop : " + cs.pop());
        // System.out.println(cs.pop());
        System.out.println("Dynamic Stack");
        DynamicStack ds = new DynamicStack(2);
        System.out.println("push : " + ds.push(3));
        System.out.println("peek : " + ds.peek());
        System.out.println("pop : " + ds.pop());
        System.out.println("push : " + ds.push(3));
        System.out.println("push : " + ds.push(4));
        System.out.println("push : " + ds.push(5));
        System.out.println("peek : " + ds.peek());
        System.out.println("pop : " + ds.pop());
        System.out.println("pop : " + ds.pop());
        System.out.println("pop : " + ds.pop());
        System.out.println("pop : " + ds.pop());
    }
}
