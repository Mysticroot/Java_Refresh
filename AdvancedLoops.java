
public class AdvancedLoops {

    
    public static void main(String[] args) {
        
        // Nested For Loop
        System.out.println("Nested For Loop:");

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 2; j++) {
                System.out.println("i: " + i + ", j: " + j);
            }
        }

        // Enhanced For Loop (For-Each Loop)
        System.out.println("\nEnhanced For Loop:");
        String[] fruits = {"Apple", "Banana", "Cherry"};
        
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

    }
}