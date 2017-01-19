package generics;

import java.util.HashMap;
import java.util.Map;

public class GenericMapAny {

    public void print(Map<?, ?> map) {
        Object key = map.keySet().iterator().next();
        System.out.println(map.get(key));;
        for (Map.Entry<?, ?> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
    }

    public void work() {
        Map<String, Integer> map1 = new HashMap<>();
        Map<Object, GenericMapAny> map2 = new HashMap<>();
        Map<GenericMapAny, String> map3 = new HashMap<>();
        Map<GenericMapAny, GenericMapAny> map4 = new HashMap<>();

        print(map1);
        print(map2);
        print(map3);
        print(map4);
    }

}