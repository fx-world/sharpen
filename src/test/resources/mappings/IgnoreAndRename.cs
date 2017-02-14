using renamednamespace;

namespace mappings {
    public class IgnoreAndRename {
        public static void work1(RenamedReplaceWithHandWrittenClass1 a) {
            System.Console.Out.WriteLine(a.name);
        }

        public static void work2(RenamedReplaceWithHandWrittenClass2<string> a) {
            System.Console.Out.WriteLine(a.name);
        }
    }
}