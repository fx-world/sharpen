package collections;

import java.util.Map;

public class Map2 {
	static void test() {
		java.util.Map<String, String> map = new java.util.HashMap<>();
		if (map.containsKey("foo")) {
			Object value = map.get("foo");
		}
		for (Object value : map.values()) {
		}
		for (Object key : map.keySet()) {
		}
		Object removed = map.remove("foo");
		map.put("foo", "bar");
		String evicted = map.put("foo", "bar2");
	}

	static String putEvict(Map<String, String> map) {
	    return map.put("a", "b");
    }

	static java.util.Map genericSortedMap() {
		return new java.util.TreeMap<String, String>();
	}
	
	static java.util.Map sortedMap() {
		return new java.util.TreeMap();
	}
}