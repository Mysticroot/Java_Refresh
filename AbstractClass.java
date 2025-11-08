//abstract class cannot be instantiated
//it can have abstract and non-abstract methods
//abstract method must be implemented in derived class
//if a class has abstract method then the class must be declared abstract
//abstract class can have constructor, data members, static methods etc.




 abstract class Car{
    String model;
    int year;

    //constructor of abstract class
    public Car(String model, int year){
        this.model=model;
        this.year=year;
    }
}

class Sedan extends Car {

    public Sedan(String model, int year) {
        super(model, year);
    }

    public void displayInfo() {
        System.out.println("Model: " + model + ", Year: " + year);
    }
}

public class AbstractClass {

    public static void main(String[] args) {
        Sedan sedan = new Sedan("Toyota", 2020);
        sedan.displayInfo();

        Car car = new Sedan("Honda", 2021); 
        ((Sedan) car).displayInfo();    

        
    }

}


