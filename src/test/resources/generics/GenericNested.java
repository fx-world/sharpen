package generics;

public class GenericNested {

    /**
     * @sharpen.static.helpers
     */
    public static class X<T1> {
        public NestedItem<T1> intClass;

        public static class NestedItem<T2> {
            public T2 v;
        }

        public static void foo() {
        }

        public static int bar;
    }


    public static void main(String[] args) {
        X.foo();
        int i = X.bar;
        X.NestedItem<String> a = new X.NestedItem<>();
    }
}