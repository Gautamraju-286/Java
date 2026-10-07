import java.util.*;

public class CollectionClasses {
    public static void main(String[] args) {

        // ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Gautam");
        list.add("Rahul");
        list.add("Virat");
        System.out.println("ArrayList: " + list);

        // LinkedList
        LinkedList<Integer> linked = new LinkedList<>();
        linked.add(10);
        linked.add(20);
        linked.add(30);
        linked.addFirst(5);
        System.out.println("LinkedList: " + linked);

        // HashSet
        HashSet<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("Java");
        System.out.println("HashSet: " + set);

        // TreeSet
        TreeSet<Integer> tree = new TreeSet<>();
        tree.add(40);
        tree.add(10);
        tree.add(30);
        tree.add(20);
        System.out.println("TreeSet: " + tree);

        // HashMap
        HashMap<Integer, String> map = new HashMap<>();
        map.put(101, "Gautam");
        map.put(102, "Rahul");
        map.put(103, "Arjun");
        System.out.println("HashMap: " + map);

        // Queue
        Queue<String> queue = new LinkedList<>();
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Mango");
        System.out.println("Queue: " + queue);

        // Iterator
        System.out.println("ArrayList elements:");
        Iterator<String> itr = list.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
