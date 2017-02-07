package generics;

class NullTypeVariable {
    public static <T> T f(Class<T> clazz) {
        return (T) null;
    }
}