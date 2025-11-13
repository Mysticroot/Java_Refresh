package Collections;

/*
 * LinkedHashMapExamples.java
 * ---------------------------
 * LinkedHashMap: preserves insertion order of entries while providing
 * map semantics. Useful when iteration order matters.
 *
 * Time complexity (common):
 *  - put/get/remove: O(1) average
 *  - iteration over entries: O(n)
 */

import java.util.*;

public class LinkedHashMapExamples {
    public static void main(String[] args) {
        Map<String, String> lm = new LinkedHashMap<>();
        lm.put("first", "1st");
        lm.put("second", "2nd");
        lm.put("third", "3rd");
        System.out.println("LinkedHashMap (insertion order): " + lm);
    }
}
