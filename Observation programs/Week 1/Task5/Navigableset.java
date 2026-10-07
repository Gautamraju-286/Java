import java.util.*;

class NavigableSetDemo {
    public static void main(String[] args) {
        NavigableSet<Integer> set = new TreeSet<>();

        set.add(10);
        set.add(20);
        set.add(30);

        System.out.println(set);
        System.out.println("Lower: " + set.lower(20));
        System.out.println("Higher: " + set.higher(20));
    }
}
