import java.util.*;

class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);

        System.out.println(q);
        System.out.println("Removed: " + q.remove());
    }
}
