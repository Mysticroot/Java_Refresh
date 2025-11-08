//final method cannot be overridden
//final variable value cannot be changed
//final class cannot be inherited


class FinalKeyword{
  // final variable
    final int MAX_VALUE = 100;
    
    // final method

    final void display() {
        System.out.println("This is a final method.");
    }

    // final class
    final class InnerFinalClass {
        void show() {
            System.out.println("This is a final class.");
        }
    
    }
}


public class FinalKey {
    
    public static void main(String[] args) {
        FinalKeyword obj = new FinalKeyword();
        System.out.println("Max Value: " + obj.MAX_VALUE);
        obj.display();

        FinalKeyword.InnerFinalClass innerObj = obj.new InnerFinalClass();
        innerObj.show();
    }
}