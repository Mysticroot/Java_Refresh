/*
 * Inputs.java
 * ------------
 * Demonstrates the common ways to take input in Java, how to store
 * those inputs, and how to display them. Use this file as study notes
 * while following video tutorials (Telusko or others).
 *
 * Sections included:
 *  - Command-line arguments (args[])
 *  - Environment variables and system properties
 *  - Scanner (recommended for simple CLI input)
 *  - BufferedReader (classic, fast for text lines)
 *  - Console (for password input without echo; may be null in IDEs)
 *  - File input using java.nio.file.Files
 *  - Storing inputs in arrays, List, Map
 *  - Displaying/formatting outputs
 *
 * Notes for later:
 *  - Look into Streams API, serialization, JSON parsing (Jackson / Gson),
 *    and NIO Channels for advanced I/O patterns.
 */

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Inputs {

    public static void main(String[] args) throws IOException {

        // Scanner (easy, high-level)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your full name (Scanner.nextLine()): ");
        String fullName = scanner.nextLine();

        System.out.print("Enter your age (Scanner - number): ");
        int age = 0;
        String ageInput = scanner.nextLine(); // use nextLine to avoid leftover newline issues
        try {
            age = Integer.parseInt(ageInput.trim());
        } catch (NumberFormatException e) {
            System.out.println("Invalid integer, defaulting age to 0");
        }

        //  BufferedReader (classic)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your favorite programming language (BufferedReader.readLine): ");
        String lang = br.readLine();

        //  Console (readPassword) - may be null in IDEs/editors
        Console console = System.console();
        if (console != null) {
            char[] pwd = console.readPassword("Enter a secret (won't echo): ");
            System.out.println("Secret length: " + (pwd == null ? 0 : pwd.length));
            // clear password from memory (good practice)
            if (pwd != null) Arrays.fill(pwd, ' ');
        } else {
            System.out.println("Console not available (running in IDE). Skipping secure input demo.");
        }

        // File input example using NIO (readAllLines)
        Path sample = Paths.get("sample_input.txt");
        if (Files.exists(sample)) {
            List<String> lines = Files.readAllLines(sample);
            System.out.println("Contents of sample_input.txt (first 10 lines or less):");
            lines.stream().limit(10).forEach(System.out::println);
        } else {
            System.out.println("No sample_input.txt found in working directory. Create one to test file reading.");
        }

        // Storing inputs in collections
        System.out.println("\n-- Storing inputs in Collections --");
        String[] arr = { fullName, String.valueOf(age), lang };
        System.out.println("Array: " + Arrays.toString(arr));

        List<String> list = new ArrayList<>();
        list.add(fullName);
        list.add(Integer.toString(age));
        list.add(lang);
        System.out.println("ArrayList: " + list);

        Map<String, String> map = new LinkedHashMap<>();
        map.put("name", fullName);
        map.put("age", Integer.toString(age));
        map.put("language", lang);
        System.out.println("Map: " + map);

        //  Display / formatting examples
        System.out.println("\n-- Display & formatting --");
        System.out.printf("Name: %s | Age: %d | Language: %s%n", fullName, age, lang);

        // Quick raw System.in byte read demo (not commonly used for text)
        System.out.println("\n-- Raw System.in byte read (press a key and Enter) --");
        System.out.print("Type a single character and press Enter: ");
        int b = System.in.read(); // reads one byte (int)
        // consume the rest of the line after reading one byte
        while (System.in.available() > 0) System.in.read();
        System.out.println("Read byte value: " + b + " (char: " + (char) b + ")");

        // Cleanup
        scanner.close();

        
    }
}
