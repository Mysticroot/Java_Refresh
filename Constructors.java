//name of  constructor should be same as the class name
//it never returns anything 
//it is used to initialize the object
//if we do not create a constructor java provides a default constructor
//we can overload constructor
//constructor cannot be abstract,static,final
//types of constructor
//1. default constructor
//2. parameterized constructor
//3. copy constructor




public class Constructors {
    int age;
    String name;

    //default constructor
    public Constructors(){
        age=20;
        name="Rohit";
    }

    //parameterized constructor
    public Constructors(int a, String n){
        age=a;
        name=n;
    }

    //method to display values
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }

    //copy constructor can be created like this
    public Constructors(Constructors obj){
        this.age=obj.age;
        this.name=obj.name;
    }
    

    public static void main(String[] args) {
        
        //object using default constructor
        Constructors obj1=new Constructors();
        obj1.display();

        //object using parameterized constructor
        Constructors obj2=new Constructors(25,"Amit");
        obj2.display();
    }
    
}
