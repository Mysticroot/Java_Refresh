
//you can either extend Thread class or implement Runnable interface to create a thread
//here we are extending Thread class

class A extends Thread {

    public void run() {
       for(int i=0;i<5;i++) {
           System.out.println("Hello from A");
           try {
               Thread.sleep(5);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
}
}


class B extends Thread {
    public void run() {
       for(int i=0;i<5;i++) {
           System.out.println("Hello from B");
           try {
               Thread.sleep(5);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
    }
}

public class Threads {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        a.start();
        b.start();
    }
}



//in case of implementing Runnable interface
/*
class A implements Runnable {   

    public void run() {
       for(int i=0;i<5;i++) {
           System.out.println("Hello from A");
           try {
               Thread.sleep(5);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
}
}   */

//and similarly class B implements Runnable
/*
class B implements Runnable {
    public void run() {
       for(int i=0;i<5;i++) {
           System.out.println("Hello from B");
           try {
               Thread.sleep(5);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
    }
}
*/

//and main method
/*  

public class Threads {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);

        t1.start();
        t2.start();
    }
}   



//and by using anonymous class main becomes like 
public class Threads {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for(int i=0;i<5;i++) {
                    System.out.println("Hello from A");
                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for(int i=0;i<5;i++) {
                    System.out.println("Hello from B");
                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        t1.start();
        t2.start();
    }
}   
*/

//andf with runnable with lambda

/*
public class Threads {

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for(int i=0;i<5;i++) {
                System.out.println("Hello from A");
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i=0;i<5;i++) {
                System.out.println("Hello from B");
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();
    }
}   
*/
    