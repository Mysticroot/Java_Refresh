


public class Array {
    
    public static void main(String[] args) {
        
        System.out.println("-- Array examples --");

        // Declare and initialize an array of integers
        int[] numbers = {10, 20, 30, 40, 50};

        //another way to declare and initialize an array
        int[] numbers1 = new int[] {10, 20, 30, 40, 50};
        System.out.println("First element: " + numbers1[0]);
        System.out.println("Third element: " + numbers1[2]);

        //another way to declare and initialize an array
        int[] numbers2 = new int[5];
        numbers2[0] = 10;
        numbers2[1] = 20;   
        numbers2[2] = 30;
        numbers2[3] = 40;
        numbers2[4] = 50;
        

        // Access and print elements of the array
        System.out.println("First element: " + numbers[0]);
        System.out.println("Third element: " + numbers[2]);

        // Modify an element in the array
        numbers[1] = 25;
        System.out.println("Modified second element: " + numbers[1]);

        // Iterate through the array and print all elements
        System.out.println("All elements in the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
    }
}
