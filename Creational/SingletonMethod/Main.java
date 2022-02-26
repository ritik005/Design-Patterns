package Creational.SingletonMethod;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                Singleton obj1 = Singleton.getInstance();
                // obj1.print();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                Singleton obj2 = Singleton.getInstance();
            }
        });

        // Only single object will be created
        t1.start();
        t2.start();
    }
}
