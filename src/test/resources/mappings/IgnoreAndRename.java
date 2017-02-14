package mappings;

public class IgnoreAndRename {

    public static class ReplaceWithHandWrittenClass1 {
        public String name;
    }

    public static void work1(ReplaceWithHandWrittenClass1 a) {
        System.out.println(a.name);
    }

    public static class ReplaceWithHandWrittenClass2<T> {
        public T name;
    }

    public static void work2(ReplaceWithHandWrittenClass2<String> a) {
        System.out.println(a.name);
    }

}
