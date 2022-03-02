package Creational.BuilderMethod;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        Builder carBuilder = new Car();
        Builder motorcycleBuilder = new MotorCycle();

        director.Construct(carBuilder);
        director.Construct(motorcycleBuilder);

        Product p1 = carBuilder.getVehicle();
        p1.show();
        Product p2 = motorcycleBuilder.getVehicle();
        p2.show();
    }
}
