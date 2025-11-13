package Collections;

/*
 * TreeMapExamples.java
 * ---------------------
 * TreeMap: sorted map backed by a Red-Black tree. Keeps keys in sorted order.
 *
 * Time complexity (common):
 *  - put/get/remove: O(log n)
 *  - firstKey()/lastKey()/subMap(): O(log n)
 */

import java.util.*;

public class TreeMapExamples {
    public static void main(String[] args) {
        NavigableMap<String, Integer> tm = new TreeMap<>();
        tm.put("c", 3);
        tm.put("a", 1);
        tm.put("b", 2);
        System.out.println("TreeMap (sorted keys): " + tm);
    }
}
