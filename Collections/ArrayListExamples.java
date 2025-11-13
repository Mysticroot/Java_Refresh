package Collections;

/*
 * ArrayListExamples.java
 * ----------------------
 * ArrayList: resizable array implementation. Good for random access
 * (get by index) and iteration. Adds/removes at end are O(1) amortized;
 * removes at middle are O(n).
 *
 * Common methods (short):
 *  - add(E e), add(int index, E e)
 *  - get(int index)
 *  - set(int index, E e)
 *  - remove(int index) / remove(Object o)
 *  - size(), isEmpty(), contains(Object o)
 *  - clear(), toArray()
 *
 * Time complexity (common):
 *  - add(E): O(1) amortized
 *  - add(index, E): O(n)
 *  - get(index): O(1)
 *  - set(index, E): O(1)
 *  - remove(index)/remove(Object): O(n)
 *  - contains(Object): O(n)
 *  - size(): O(1)
 */

import java.util.*;

public class ArrayListExamples {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        // add
        list.add("apple");
        list.add("banana");
        list.add(1, "orange"); // insert at index

        System.out.println("ArrayList: " + list);

        // access
        System.out.println("get(1): " + list.get(1));
        list.set(1, "grape");
        System.out.println("after set: " + list);

        // remove
        list.remove("apple");
        list.remove(0);
        System.out.println("after removes: " + list);

        // iterate
        for (String s : list) System.out.println("item: " + s);

        // utilities
        System.out.println("contains banana? " + list.contains("banana"));
        System.out.println("size: " + list.size());

        list.clear();
        System.out.println("cleared, empty? " + list.isEmpty());
    }
}
