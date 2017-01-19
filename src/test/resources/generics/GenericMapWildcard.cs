namespace generics {
    public class GenericMapWildcard {
        public virtual void printNoWildcard<K, V>(System.Collections.Generic.IDictionary<K, V> map) {
            K key = map.Keys.GetEnumerator().Current;
            V value = map[key];
            System.Console.Out.WriteLine(key + ":" + value);
            foreach (K k in map.Keys) {
                System.Console.Out.WriteLine(k + ":" + map[k]);
            }
            foreach (System.Collections.Generic.KeyValuePair<K, V> e in map) {
                System.Console.Out.WriteLine(e.Key);
                System.Console.Out.WriteLine(e.Value);
            }
            foreach (var e in map) {
                System.Console.Out.WriteLine(e.Key);
                System.Console.Out.WriteLine(e.Value);
            }
        }

        public virtual void printWildcardKey<K, _T0>(System.Collections.Generic.IDictionary<K, _T0> map) {
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

        public virtual void printWildcardKeyValue<_T0, _T1>(System.Collections.Generic.IDictionary<_T0, _T1> map) {
            var key = map.Keys.GetEnumerator().Current;
            var value = map[key];
            System.Console.Out.WriteLine(key + ":" + value);
            foreach (var k in map.Keys) {
                System.Console.Out.WriteLine(k + ":" + map[k]);
            }
            foreach (var e in map) {
                var k = e.Key;
                var v = e.Value;
                System.Console.Out.WriteLine(k);
                System.Console.Out.WriteLine(v);
            }
        }

        public virtual void work() {
            System.Collections.Generic.IDictionary<string, int> map1 = new System.Collections.Generic.Dictionary<string, int>();
            System.Collections.Generic.IDictionary<string, object> map2 = new System.Collections.Generic.Dictionary<string, object>();
            System.Collections.Generic.IDictionary<generics.GenericMapWildcard, string> map3 = new System.Collections.Generic.Dictionary<generics.GenericMapWildcard, string>();
            System.Collections.Generic.IDictionary<generics.GenericMapWildcard, generics.GenericMapWildcard> map4 = new System.Collections.Generic.Dictionary<generics.GenericMapWildcard, generics.GenericMapWildcard>();
            printNoWildcard(map1);
            printNoWildcard(map2);
            printNoWildcard(map3);
            printNoWildcard(map4);
            printWildcardKey(map1);
            printWildcardKey(map2);
            printWildcardKey(map3);
            printWildcardKey(map4);
            printWildcardKeyValue(map1);
            printWildcardKeyValue(map2);
            printWildcardKeyValue(map3);
            printWildcardKeyValue(map4);
        }
    }
}