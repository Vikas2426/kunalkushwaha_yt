public class QueueMain {
    public static void main(String[] args) {
        CircularDynamicQueue cdq = new CircularDynamicQueue(2);
        System.out.println(cdq.dequeque());
        System.out.println(cdq.enqueue(1));
        System.out.println(cdq.enqueue(2));
        cdq.display();

        System.out.println(cdq.enqueue(3));
        cdq.display();

        System.out.println(cdq.peek());
        System.out.println(cdq.getSize());
        cdq.display();
        System.out.println(cdq.dequeque());
        System.out.println(cdq.getSize());
        System.out.println(cdq.enqueue(4));
        System.out.println(cdq.peek());
        System.out.println(cdq.getSize());
        cdq.display();
    }
}
