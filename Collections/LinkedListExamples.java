package Collections;

/*
 * LinkedListExamples.java
 * -----------------------
 * LinkedList: doubly-linked list implementation. Good for frequent
 * insertions/removals at head/tail (O(1)), but slower random access (O(n)).
 * Implements List, Deque.
 *
 * Common methods (short):
 *  - add(E), addFirst(E), addLast(E), add(int, E)
 *  - getFirst(), getLast(), get(int)
 *  - remove(), removeFirst(), removeLast(), remove(int)
 *  - offer(), poll(), peek() (deque queue-style)
 *
 * Time complexity (common):
 *  - addFirst/addLast/offer: O(1)
 *  - add(index, E): O(n)
 *  - get(index): O(n)
 *  - removeFirst/removeLast: O(1)
 *  - contains(Object): O(n)
 *  - size(): O(1)
 */

import java.util.*;

public class LinkedListExamples {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("one");
        ll.add("two");
        ll.addFirst("zero");
        ll.addLast("three");
        System.out.println("LinkedList: " + ll);

        System.out.println("first: " + ll.getFirst() + ", last: " + ll.getLast());

        ll.removeFirst();
        System.out.println("after removeFirst: " + ll);

        // deque methods
        ll.offer("four");
        System.out.println("after offer: " + ll);
        System.out.println("poll(): " + ll.poll());
        System.out.println("peek(): " + ll.peek());
    }
}
