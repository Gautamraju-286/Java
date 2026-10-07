import java.util.*;

class DequeDemo {
    public static void main(String[] args) {
        Deque<Integer> d = new ArrayDeque<>();

        d.addFirst(10);
        d.addLast(20);

        System.out.println(d);
    }
}
