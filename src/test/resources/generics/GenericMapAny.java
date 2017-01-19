package generics;

import java.util.HashMap;
import java.util.Map;

public class GenericMapAny {

    public <K, V> void printFull(Map<K, V> map) {
        K key = map.keySet().iterator().next();
        V value = map.get(key);
        System.out.println(key + ":" + value);

        for (K k : map.keySet()) {
            System.out.println(k + ":" + map.get(k));
        }
        for (Map.Entry<?, ?> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
    }

    public <K> void printHalf(Map<K, ?> map) {
        K key = map.keySet().iterator().next();
        Object value = map.get(key);
        System.out.println(key + ":" + value);

        for (K k : map.keySet()) {
            System.out.println(k + ":" + map.get(k));
        }
        for (Map.Entry<?, ?> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
    }

    public void printAny(Map<?, ?> map) {
        Object key = map.keySet().iterator().next();
        Object value = map.get(key);
        System.out.println(key + ":" + value);

        for (Object k : map.keySet()) {
            System.out.println(k + ":" + map.get(k));
        }

        for (Map.Entry<?, ?> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
    }

    public void work() {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Object> map2 = new HashMap<>();
        Map<GenericMapAny, String> map3 = new HashMap<>();
        Map<GenericMapAny, GenericMapAny> map4 = new HashMap<>();

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