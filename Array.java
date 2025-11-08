


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






        //2-D Array
        System.out.println("\n-- 2-D Array example --");

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        //another way to declare and initialize 2-D array
        int[][] matrix1 = new int[3][3];
        matrix1[0][0] = 1;
        matrix1[0][1] = 2;
        matrix1[0][2] = 3;
        matrix1[1][0] = 4;
        matrix1[1][1] = 5;
        matrix1[1][2] = 6;
        matrix1[2][0] = 7;
        matrix1[2][1] = 8;
        matrix1[2][2] = 9;

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
