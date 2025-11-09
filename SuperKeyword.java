
class A extends Object{

    public A()
    {
          System.out.println("in A");

    }

    public A(int n)
     {
          System.out.println("in A "+n);
     }
}

class B extends A{

     public B()
     {

        // super(5);
          System.out.println("in B");
     }

     public B(int n)
     {
        // super(n);
          System.out.println("in B "+n);
     }

     public void show() {
         System.out.println("in B");
     }

}

public class SuperKeyword {
    public static void main(String[] args) {
        
        B obj =new B();

        obj.show();


    }
    
}
