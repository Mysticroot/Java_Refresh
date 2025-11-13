package Collections;

/*
 * LinkedHashSetExamples.java
 * ---------------------------
 * LinkedHashSet: preserves insertion order while providing HashSet
 * performance characteristics.
 *
 * Time complexity (common):
 *  - add(E): O(1) average
 *  - contains(E): O(1) average
 *  - remove(E): O(1) average
 */

import java.util.*;

public class LinkedHashSetExamples {
    public static void main(String[] args) {
        Set<String> s = new LinkedHashSet<>();
        s.add("one");
        s.add("two");
        s.add("three");
        System.out.println("LinkedHashSet (insertion order): " + s);
    }
}
