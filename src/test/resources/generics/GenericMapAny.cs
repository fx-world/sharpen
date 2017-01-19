namespace generics {
    public class GenericMapAny {
        public virtual void printFull<K, V>(System.Collections.Generic.IDictionary<K, V> map) {
            K key = map.Keys.GetEnumerator().Current;
            V value = map[key];
            System.Console.Out.WriteLine(key + ":" + value);
            foreach (K k in map.Keys) {
                System.Console.Out.WriteLine(k + ":" + map[k]);
            }
            foreach (var e in map) {
                System.Console.Out.WriteLine(e.Key);
                System.Console.Out.WriteLine(e.Value);
            }
        }

        public virtual void printHalf<K, _T0>(System.Collections.Generic.IDictionary<K, _T0> map) {
            K key = map.Keys.GetEnumerator().Current;
            var value = map[key];
            System.Console.Out.WriteLine(key + ":" + value);
            foreach (K k in map.Keys) {
                System.Console.Out.WriteLine(k + ":" + map[k]);
            }
            foreach (var e in map) {
                System.Console.Out.WriteLine(e.Key);
                System.Console.Out.WriteLine(e.Value);
            }
        }

        public virtual void printAny<_T0, _T1>(System.Collections.Generic.IDictionary<_T0, _T1> map) {
            var key = map.Keys.GetEnumerator().Current;
            var value = map[key];
            System.Console.Out.WriteLine(key + ":" + value);
            foreach (var k in map.Keys) {
                System.Console.Out.WriteLine(k + ":" + map[k]);
            }
            foreach (var e in map) {
                System.Console.Out.WriteLine(e.Key);
                System.Console.Out.WriteLine(e.Value);
            }
        }

        public virtual void work() {
            System.Collections.Generic.IDictionary<string, int> map1 = new System.Collections.Generic.Dictionary<string, int>();
            System.Collections.Generic.IDictionary<string, object> map2 = new System.Collections.Generic.Dictionary<string, object>();
            System.Collections.Generic.IDictionary<generics.GenericMapAny, string> map3 = new System.Collections.Generic.Dictionary<generics.GenericMapAny, string>();
            System.Collections.Generic.IDictionary<generics.GenericMapAny, generics.GenericMapAny> map4 = new System.Collections.Generic.Dictionary<generics.GenericMapAny, generics.GenericMapAny>();
            printFull(map1);
            printFull(map2);
            printFull(map3);
            printFull(map4);
            printHalf(map1);
            printHalf(map2);
            printHalf(map3);
            printHalf(map4);
            printAny(map1);
            printAny(map2);
            printAny(map3);
            printAny(map4);
        }
    }
}