package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class List2 {

    public static void main(String[] args) {
        List<String> al = new ArrayList<>();
        al.add("1");
        al.add("2");
        al.add("3");
        al.remove("2");
        al.remove(1);
        al.addAll(Arrays.asList("5", "6", "7"));

        System.out.println(al.size());
        System.out.println(al.isEmpty());
        System.out.println(al.contains("3"));
        System.out.println(al.toArray());
        System.out.println(al.toArray(new String[al.size()]));

        LinkedList<String> ll = new LinkedList<>();
        ll.addFirst("f1");
        ll.addLast("l1");
        ll.removeFirst();
        ll.removeLast();
        ll.remove("1");
        System.out.println(ll);

    }

}