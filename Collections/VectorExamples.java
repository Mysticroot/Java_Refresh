package Collections;

/*
 * VectorExamples.java
 * --------------------
 * Vector: synchronized, resizable array. Legacy class; prefer ArrayList
 * unless you need legacy synchronization. Methods mirror ArrayList.
 *
 * Time complexity (common):
 *  - add(E): O(1) amortized
 *  - get(index): O(1)
 *  - remove(Object)/remove(index): O(n)
 *  - size(): O(1)
 */

import java.util.*;

public class VectorExamples {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(1);
        v.add(2);
        v.add(3);
        System.out.println("Vector: " + v);
        v.remove(Integer.valueOf(2));
        System.out.println("after remove: " + v);
    }
}
