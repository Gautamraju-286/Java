import java.util.*;

class NavigableMapDemo {
    public static void main(String[] args) {
        NavigableMap<Integer, String> map = new TreeMap<>();

        map.put(10, "A");
        map.put(20, "B");
        map.put(30, "C");

        System.out.println(map);
        System.out.println("Lower: " + map.lowerKey(20));
        System.out.println("Higher: " + map.higherKey(20));
    }
}
