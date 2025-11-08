/*
 * Methods.java

 * Quick rules / structure for methods:
 *  - Signature: [modifiers] returnType methodName([params])
 *  - Body: { ... } contains statements, may return value if non-void
 *  - Access modifiers: public / protected / private / default
 *  - Static methods belong to class; instance methods to objects
 *  - Overloading: same name, different parameter list
 *  - Overriding: subclass provides implementation for superclass method
 
 */

public class Methods {

    // Simple method examples
    public int add(int a, int b) { // instance method with return
        return a + b;
    }

    public double add(double a, double b) { // overloaded method
        return a + b;
    }

    public void printMessage(String msg) { // void return type
        System.out.println(msg);
    }

    // Small class examples for OOP
    static class Person {
        protected String name;

        public Person(String name) {
            this.name = name;
        }

        public void speak() {
            System.out.println("Person says: Hi, I'm " + name);
        }
    }

    static class Student extends Person {
        private int id;

        public Student(String name, int id) {
            super(name);
            this.id = id;
        }

        @Override
        public void speak() { // overriding -> polymorphism
            System.out.println("Student says: Hi, I'm " + name + ", id=" + id);
        }
    }

    public static void main(String[] args) {
        Methods m = new Methods();

        System.out.println("-- Method examples --");
        System.out.println("add(int, int): " + m.add(3, 4));
        System.out.println("add(double, double): " + m.add(2.5, 1.5));
        m.printMessage("Hello from printMessage()");

        System.out.println("\n-- OOP: classes, inheritance, polymorphism --");
        Person p = new Person("Alice");
        Person s = new Student("Bob", 101); // polymorphic reference
        p.speak();
        s.speak();

        System.out.println("\n-- Notes & next steps --");
        System.out.println("Add more topics: Generics, File I/O, JDBC, Networking, GUI, Build tools (Maven/Gradle)");
    }
}
