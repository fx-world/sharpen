package generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GenericTypeReference<T> {
    private static final Class myclass = GenericTypeReference.class;

    public static void test(Object o) {
        if (o.getClass() == GenericTypeReference.class) {
            System.out.println("1");
        }
        System.out.println(GenericTypeReference.class);
        System.out.println(List.class);
        System.out.println(Map.class);
        System.out.println(Set.class);
        System.out.println(ArrayList.class);
        System.out.println(Enum.class);
    }

}