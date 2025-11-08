



class Calc{

    public int add(int a,int b){
        return a+b;
    }

    public int sub(int a,int b){
        return a-b;
    }
}

class Advcalc extends Calc{


    public int multi(int a ,int b){
        return a*b;
    }

    public double power  (int a,int b){
        return Math.pow(a,b);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        
        Advcalc obj=new Advcalc();

        System.out.println(obj.add(20,25));
        System.out.println(obj.sub(20,25));
        System.out.println(obj.multi(20,25));
        System.out.println(obj.power(20,25));

    }
}
