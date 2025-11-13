package Collections;

/*
 * TreeSetExamples.java
 * ---------------------
 * TreeSet: sorted set backed by a Red-Black tree. Maintains natural order
 * or takes a Comparator. Operations are O(log n).
 *
 * Time complexity (common):
 *  - add(E)/remove(E)/contains(E): O(log n)
 *  - first()/last(): O(log n) or O(1) depending on implementation
 */

import java.util.*;

public class TreeSetExamples {
    public static void main(String[] args) {
        NavigableSet<Integer> ts = new TreeSet<>();
        ts.add(5);
        ts.add(1);
        ts.add(3);
        System.out.println("TreeSet (sorted): " + ts);
        System.out.println("first: " + ts.first() + ", last: " + ts.last());
    }
}
