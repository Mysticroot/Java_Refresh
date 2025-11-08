// This is a sample interface file
// an class having only abstract methods is called interface
//interface methods are by default abstract and public
//

interface Animal {
    void eat();
    void sleep();
}





public class Interfaces {
    
    public static void main(String[] args) {

        Animal dog = new Animal() {
            public void eat() {
                System.out.println("Dog is eating.");
            }

            public void sleep() {
                System.out.println("Dog is sleeping.");
            }
        };

        dog.eat();
        dog.sleep();
    }

}
