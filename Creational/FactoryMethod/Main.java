package Creational.FactoryMethod;

public class Main {
    public static void main(String[] args) {
        OperatingSystemFactory osf = new OperatingSystemFactory();
        OS obj = osf.getInstance("open");
        obj.getInfo();
    }
}