
class StringExamples {
    public static void main(String[] args) {
        

        System.out.println("-- String examples --");

        // Declare and initialize strings
        String str1 = "Hello, World!";
        String str2 = new String("Java Programming");

        // Access and print string properties
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 7 of str1: " + str1.charAt(7));

        // Modify strings (strings are immutable, so this creates a new string)
        String str3 = str1.replace("World", "Java");
        System.out.println("Modified str1: " + str3);

        // Concatenate strings
        String str4 = str1 + " Welcome to " + str2 + ".";
        System.out.println("Concatenated string: " + str4);

        // Iterate through the string and print each character
        System.out.println("Characters in str1:");
        for (int i = 0; i < str1.length(); i++) {
            System.out.println("Character at index " + i + ": " + str1.charAt(i));
        }


        //stringbuffer example
        System.out.println("\n-- StringBuffer example --"); 

        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println("Appended StringBuffer: " + sb.toString());

        sb.insert(5, ",");
        System.out.println("After insertion: " + sb.toString());

        sb.replace(0, 5, "Hi");
        System.out.println("After replacement: " + sb.toString());

        sb.delete(2, 7);
        System.out.println("After deletion: " + sb.toString());

        //stringbuilder example
        System.out.println("\n-- StringBuilder example --");

        StringBuilder sbd = new StringBuilder("Java");
        sbd.append(" Programming");

        System.out.println("Appended StringBuilder: " + sbd.toString());

        sbd.insert(4, " Language");
        System.out.println("After insertion: " + sbd.toString());

        sbd.replace(0, 4, "Advanced");
        System.out.println("After replacement: " + sbd.toString());
        
    }
}
