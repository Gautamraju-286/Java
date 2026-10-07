import java.util.*;

class ListIteratorDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");

        ListIterator<String> i = list.listIterator();

        while (i.hasNext())
            System.out.println(i.next());
    }
}
