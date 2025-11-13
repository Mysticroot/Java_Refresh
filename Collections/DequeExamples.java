package Collections;

/*
 * DequeExamples.java
 * -------------------
 * Deque (double-ended queue) interface. Use ArrayDeque for most use-cases.
 * Supports addFirst/addLast, removeFirst/removeLast, peekFirst/peekLast.
 *
 * Time complexity (common):
 *  - addFirst/addLast/removeFirst/removeLast: O(1)
 *  - peekFirst/peekLast: O(1)
 */

import java.util.*;

public class DequeExamples {
    public static void main(String[] args) {
        Deque<String> dq = new ArrayDeque<>();
        dq.addFirst("a");
        dq.addLast("b");
        dq.addLast("c");
        System.out.println("Deque: " + dq);
        System.out.println("removeFirst: " + dq.removeFirst());
        System.out.println("peekLast: " + dq.peekLast());
    }
}
