
//classes are normally public
//variables are normally private
//methods  are normally public/protected




class Human{
    private int age;
    private String name;

   
    
    public void getAge() {
         System.out.println(age);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getName() {
        System.out.println(name);
    }

    public void setName(String name) {
        this.name = name;
    }

}

public class AccessTypes {

    public static void main(String[] args) {
        

        Human obj=new Human();

        obj.setAge(30);
        obj.setName("rohit");
        obj.getAge();
        obj.getName();
    }

}
