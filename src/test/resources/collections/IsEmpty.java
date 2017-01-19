package collections;

import java.util.*;

class IsEmpty {
    public void test(){
        ArrayList<String> list = new ArrayList<>();
        Collection<String> collection = list;
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        Set<Integer> set = hashSet;
        HashMap<Integer, String> hashMap = new HashMap<>();
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        Map<Integer, String> map = hashMap;

        list.isEmpty();
        collection.isEmpty();
        hashSet.isEmpty();
        treeSet.isEmpty();
        set.isEmpty();
        hashMap.isEmpty();
        treeMap.isEmpty();
        map.isEmpty();
    }
}