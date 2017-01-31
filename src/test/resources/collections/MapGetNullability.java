package collections;

import java.util.Map;

public class MapGetNullability {

    public Map<Long, String> stringMap;
    public Map<Long, Integer> intMap;

    public void work() {
        String str = stringMap.get(1L);
        if (str != null) {
            System.out.println(str);
        }

        Integer i = intMap.get(2L);
        if (i != null) {
            System.out.println(i);
            System.out.println(i + 1);
        }
        System.out.println(i);
        if (i == null || str == null) {
            System.out.println(i + "text");
            System.out.println("text" + i);
            System.out.println(i + str);
            System.out.println(str + i);
        }
        System.out.println(i + 2);

        print1(i, i);
        print2(i, i);
    }

    public void print1(int a, Object b) {
        System.out.println(a + " " + b);
    }

    public void print2(Integer a, int b) {
        System.out.println(a + b);
    }

}
