namespace generics {
    public class GenericMapAny {
        public virtual void print<_T0, _T1>(System.Collections.Generic.IDictionary<_T0, _T1> map) {
            _T0 key = map.Keys.GetEnumerator().Current;
            System.Console.Out.WriteLine(map[key]);
            foreach (System.Collections.Generic.KeyValuePair<_T0, _T1> e in map) {
                System.Console.Out.WriteLine(e.Key);
                System.Console.Out.WriteLine(e.Value);
            }
        }

        public virtual void work() {
            System.Collections.Generic.IDictionary<string, int> map1 = new System.Collections.Generic.Dictionary<string, int>();
            System.Collections.Generic.IDictionary<object, generics.GenericMapAny> map2 = new System.Collections.Generic.Dictionary<object, generics.GenericMapAny>();
            System.Collections.Generic.IDictionary<generics.GenericMapAny, string> map3 = new System.Collections.Generic.Dictionary<generics.GenericMapAny, string>();
            System.Collections.Generic.IDictionary<generics.GenericMapAny, generics.GenericMapAny> map4 = new System.Collections.Generic.Dictionary<generics.GenericMapAny, generics.GenericMapAny>();
            print(map1);
            print(map2);
            print(map3);
            print(map4);
        }
    }
}