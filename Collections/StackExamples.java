package Collections;

/*
 * StackExamples.java
 * -------------------
 * Stack: LIFO stack. Legacy class (extends Vector). Prefer Deque
 * implementations (ArrayDeque) for stack behavior in new code.
 *
 * Common methods: push(E), pop(), peek(), empty()
 *
 * Time complexity (common):
 *  - push(E): O(1)
 *  - pop(): O(1)
 *  - peek(): O(1)
 *  - empty(): O(1)
 */

import java.util.*;

public class StackExamples {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        st.push("a");
        st.push("b");
        System.out.println("stack top: " + st.peek());
        System.out.println("pop: " + st.pop());
    }
}
