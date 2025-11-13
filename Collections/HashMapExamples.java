package Collections;

/*
 * HashMapExamples.java
 * ---------------------
 * HashMap: key->value mapping, unordered. Fast get/put/remove (O(1) avg).
 *
 * Common methods: put(K,V), get(K), remove(K), containsKey(K), keySet(), values()
 *
 * Time complexity (common):
 *  - put/get/remove/containsKey: O(1) average
 *  - iteration over entries: O(n)
 */

import java.util.*;

public class HashMapExamples {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.putIfAbsent("a", 10);
        System.out.println("HashMap: " + map);
        System.out.println("get a: " + map.get("a"));

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " => " + e.getValue());
        }
    }
}
