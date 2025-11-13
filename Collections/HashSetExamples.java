package Collections;

/*
 * HashSetExamples.java
 * ---------------------
 * HashSet: unordered collection of unique elements. Backed by hash table.
 * Fast add/contains/remove (O(1) average). No guaranteed order.
 *
 * Common methods: add(E), contains(E), remove(E), iterator(), size()
 *
 * Time complexity (common):
 *  - add(E): O(1) average
 *  - contains(E): O(1) average
 *  - remove(E): O(1) average
 *  - iterator(): O(n)
 */

import java.util.*;

public class HashSetExamples {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        s.add("apple");
        s.add("banana");
        s.add("apple"); // duplicate ignored
        System.out.println("HashSet: " + s);
        System.out.println("contains banana? " + s.contains("banana"));
    }
}
