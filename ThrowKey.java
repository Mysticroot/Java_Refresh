//  ThrowKey.java
// The 'throw' keyword in Java is used to explicitly throw an exception.
// It is typically used within a method to indicate that an exception condition has occurred.
// Here is an example of how to use the 'throw' keyword to throw an exception.

    //super method is used to call the constructor of the parent class.
    // In this example, we define a custom exception class and use the 'throw' keyword to throw an instance of that exception.
    //the super method in exception class helps to pass the exception message to the parent Exception class.

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class ThrowKey {

    public static void main(String[] args) {
        try {
            throw new CustomException("This is a custom exception");
        } catch (CustomException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
