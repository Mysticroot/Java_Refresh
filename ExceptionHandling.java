// ExceptionHandling.java

//try-catch block is used to handle exceptions in Java.
// In this example, we handle an ArithmeticException that occurs when dividing by zero.
    // We also use a finally block to execute code regardless of whether an exception occurred or not.


//finally block is optional and is used to execute important code such as closing resources.
// It always executes after the try and catch blocks, regardless of whether an exception was thrown or caught.



public class ExceptionHandling {

    public static void main(String[] args) {
        try {

            int result = divide(10, 0);
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {

            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Execution completed.");
        }
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}


