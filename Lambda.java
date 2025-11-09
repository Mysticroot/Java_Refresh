 interface LambdaInterface {
    int operation(int a, int b);
}

public class Lambda {

    public static void main(String[] args) {
        LambdaInterface addition = (a, b) -> a + b;
        LambdaInterface subtraction = (a, b) -> a - b;

        System.out.println("Addition: " + performOperation(5, 3, addition));
        System.out.println("Subtraction: " + performOperation(5, 3, subtraction));
    }

    public static int performOperation(int a, int b, LambdaInterface operation) {
        return operation.operation(a, b);

        
    }
}


