package mappings;

public class IgnoreAndRename {

    public static class ReplaceWithHandWrittenClass {
        public String name;
    }

    public static void work(ReplaceWithHandWrittenClass a) {
        System.out.println(a.name);
    }

}
