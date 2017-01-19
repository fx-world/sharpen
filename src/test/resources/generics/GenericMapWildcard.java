package generics;

import java.util.HashMap;
import java.util.Map;

public class GenericMapWildcard {

    public <K, V> void printNoWildcard(Map<K, V> map) {
        K key = map.keySet().iterator().next();
        V value = map.get(key);
        System.out.println(key + ":" + value);

        for (K k : map.keySet()) {
            System.out.println(k + ":" + map.get(k));
        }
        for (Map.Entry<K, V> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        for (Map.Entry<?, ?> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
    }

    public <K> void printWildcardKey(Map<K, ?> map) {
        K key = map.keySet().iterator().next();
        Object value = map.get(key);
        System.out.println(key + ":" + value);

        for (K k : map.keySet()) {
            System.out.println(k + ":" + map.get(k));
        }
        for (Map.Entry<K, ?> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
    }

    public void printWildcardKeyValue(Map<?, ?> map) {
        Object key = map.keySet().iterator().next();
        Object value = map.get(key);
        System.out.println(key + ":" + value);

        for (Object k : map.keySet()) {
            System.out.println(k + ":" + map.get(k));
        }

        for (Map.Entry<?, ?> e : map.entrySet()) {
            Object k = e.getKey();
            Object v = e.getValue();
            System.out.println(k);
            System.out.println(v);
        }
    }

    public void work() {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Object> map2 = new HashMap<>();
        Map<GenericMapWildcard, String> map3 = new HashMap<>();
        Map<GenericMapWildcard, GenericMapWildcard> map4 = new HashMap<>();

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