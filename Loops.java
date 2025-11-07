public class Loops {
    
    public static void main(String[] args) {
        
        // For Loop
        System.out.println("For Loop:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration: " + i);
        }

        // While Loop
        System.out.println("\nWhile Loop:");
        int j = 0;
        while (j < 5) {
            System.out.println("Iteration: " + j);
            j++;
        }

        // Do-While Loop
        System.out.println("\nDo-While Loop:");
        int k = 0;
        do {
            System.out.println("Iteration: " + k);
            k++;
        } while (k < 5);

    }
}
