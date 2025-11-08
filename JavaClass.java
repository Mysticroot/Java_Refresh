

  


class Calculator {

    public int add(int a, int b) {
        return a + b;
    }
    
}

public class JavaClass {

    public static void main(String[] args) {
        

        Calculator calc = new Calculator();

        int sum = calc.add(5, 10);
        System.out.println("Sum: " + sum);
    }
    
}
