package Collections;

/*
 * PriorityQueueExamples.java
 * ---------------------------
 * PriorityQueue: heap-based priority queue. By default, natural ordering
 * (Comparable) or provide a Comparator. Not thread-safe.
 *
 * Time complexity (common):
 *  - add/offer: O(log n)
 *  - poll/remove: O(log n)
 *  - peek: O(1)
 */

import java.util.*;

public class PriorityQueueExamples {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(5);
        pq.add(1);
        pq.add(3);
        System.out.println("poll order: ");
        while (!pq.isEmpty()) System.out.println(pq.poll());
    }
}
