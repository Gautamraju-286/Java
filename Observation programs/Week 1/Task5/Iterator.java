import java.util.*;

class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");

        Iterator<String> i = list.iterator();

        while (i.hasNext())
            System.out.println(i.next());
    }
}
