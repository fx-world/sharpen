package generics;

public class GenericNested<T1> {
    public Internal<T1> intClass;

    public static class Internal<T2> {
        public T2 v;
    }
}