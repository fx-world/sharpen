package nativeTypeSystem;

public class ClassCast {
    public void test() {
        Object obj = "abc";
        String string = String.class.cast(obj);
    }
}
