package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericTypeReference<T> {
    private static final Class myclass = GenericTypeReference.class;

    public static void test(Object o) {
        if (o.getClass() == GenericTypeReference.class) {
            System.out.println("1");
        }
        System.out.println(GenericTypeReference.class);
        System.out.println(List.class);
        System.out.println(ArrayList.class);
        System.out.println(Enum.class);
    }

}