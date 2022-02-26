package Creational.SingletonMethod;

final public class Singleton {
    private static Singleton instance;

    //Making the constructor private
    private Singleton() { System.out.println("Object created"); }

    //Lazy instantiation - create object only when we need it

    // public static Singleton getInstance() {
    //     if(instance == null) {
    //         instance=  new Singleton();
    //     }
    //     return instance;
    // }

    //Double check locking

    public static Singleton getInstance() {
        if(instance == null) {
            synchronized(Singleton.class) {
                if(instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void print() {
        System.out.println("Hello welcome to Singleton Design Pattern");
    }
}
