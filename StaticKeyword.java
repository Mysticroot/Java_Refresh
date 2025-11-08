//static variables:-

// A static variable is shared among all instances of a class. It belongs to the class itself rather than any specific instance.

//static variables are shared among all of the class 
//it can be accessed by 
//{ClassName.VarName;}


//STATIC BLOCK Static{}
//it is called only once and used to declare static variables in the class

//for loading the class without actually creating the obj of that class we use Class.ForName(ClassName);

//static methods:-
// A static method belongs to the class and can be called without creating an instance of the class. It can only directly access static variables and other static methods.

//you can access static methods without creating obj 

//in static methods you cant use non-static varables directly ...you need to pass the obj too in the static methods to know which obj you are talking about

class Mobile {
    static String brand = "Samsung"; // static variable
    String model; // instance variable

    // static method
    static void showBrand() {
        System.out.println("Brand: " + brand);
    }

    // instance method
    void showModel() {
        System.out.println("Model: " + model);
    }
}



public class StaticKeyword {
    
    public static void main(String[] args) {
        
       Mobile obj=new Mobile();
         obj.model="Galaxy S21";
         obj.brand="Apple"; // modifying static variable using instance (not recommended)

         Mobile obj1=new Mobile();
         obj1.model="iPhone 13";
         obj1.brand="OnePlus"; // modifying static variable using instance (not recommended)


         obj.showModel(); // Model: Galaxy S21
         obj1.showModel(); // Model: iPhone 13


         //


    }
}
