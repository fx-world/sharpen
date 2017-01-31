namespace collections {
    public class MapGetNullability {
        public System.Collections.Generic.IDictionary<long, string> stringMap;

        public System.Collections.Generic.IDictionary<long, int> intMap;

        public virtual void work() {
            string str = stringMap.GetOrNull(1L);
            if (str != null) {
                System.Console.Out.WriteLine(str);
            }
            int? i = intMap.GetOrNullable(2L);
            if (i != null) {
                System.Console.Out.WriteLine(i);
                System.Console.Out.WriteLine(i.Value + 1);
            }
            System.Console.Out.WriteLine(i);
            if (i == null || str == null) {
                System.Console.Out.WriteLine(i + "text");
                System.Console.Out.WriteLine("text" + i);
                System.Console.Out.WriteLine(i + str);
                System.Console.Out.WriteLine(str + i);
            }
            System.Console.Out.WriteLine(i.Value + 2);
            print1(i.Value, i);
            print2(i.Value, i.Value);
        }

        public virtual void print1(int a, object b) {
            System.Console.Out.WriteLine(a + " " + b);
        }

        public virtual void print2(int a, int b) {
            System.Console.Out.WriteLine(a + b);
        }
    }
}