
    class Outer {
        int outerField = 10;

        class Inner {
            void display() {
                System.out.println("Outer field is: " + outerField);
            }
        }
    }


    //anonymous inner class
   


public class InnerClass {
    
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.display();



       
    }
}
