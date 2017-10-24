namespace collections {
    public class List2 {
        public static void Main(string[] args) {
            System.Collections.Generic.IList<string> al = new System.Collections.Generic.List<string>();
            al.Add("1");
            al.Add("2");
            al.Add("3");
            al.Remove("2");
            al.RemoveAtReturningValue(1);
            Sharpen.Collections.AddAll(al, Sharpen.Arrays.AsList("5", "6", "7"));
            al[0] = "1";
            System.Console.Out.WriteLine(al.Count);
            System.Console.Out.WriteLine((al.Count == 0));
            System.Console.Out.WriteLine(al.Contains("3"));
            System.Console.Out.WriteLine(Sharpen.Collections.ToArray(al));
            System.Console.Out.WriteLine(Sharpen.Collections.ToArray(al, new string[al.Count]));
            System.Collections.Generic.LinkedList<string> ll = new System.Collections.Generic.LinkedList<string>();
            ll.AddFirst("f1");
            ll.AddLast("l1");
            Sharpen.Collections.RemoveFirst(ll);
            Sharpen.Collections.RemoveLast(ll);
            ll.Remove("1");
            System.Console.Out.WriteLine(ll);
        }
    }
}