//throws keyword is used to declare an exception



// It is used in method signatures to indicate that a method may throw one or more exceptions.
// Here is an example of how to use the 'throws' keyword in a method declaration.
// In this example, we define a method that declares it may throw a generic Exception.
// The calling method is responsible for handling the exception using a try-catch block.

public class ThrowsKey {

    public static void main(String[] args) throws Exception {

        try {
            methodThatThrowsException();
        } catch (Exception e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }

    public static void methodThatThrowsException() throws Exception {
        throw new Exception("This is an exception");
    }
}

