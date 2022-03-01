package Structural.Flyweight;

public class Main {
    public static void main(String[] args) {
        IPen p = PenFactory.getPen("Thick Pen");
        p.setColor("Red");
        p.mission();

        IPen p1 = PenFactory.getPen("Thick Pen");
        p1.setColor("Yellow");
        p1.mission();

        IPen p2 = PenFactory.getPen("Thin Pen");
        p2.setColor("Yellow");
        p2.mission();
    }
}
