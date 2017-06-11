package generics;

import java.util.*;

public class GenericTypeReference<T> {
    private static final Class myclass = GenericTypeReference.class;

    public static void main(Object[] args) {
        Object o = args[0];
        if (o.getClass() == GenericTypeReference.class) {
            System.out.println("1");
        }
        if (o instanceof GenericTypeReference) {
            System.out.println("2");
        }
        if (o instanceof String) {
            System.out.println("3");
        }
        if (o instanceof List) {
            System.out.println("4");
        }
    }

}