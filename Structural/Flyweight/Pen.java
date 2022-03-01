package Structural.Flyweight;

import java.util.HashMap;

interface IPen 
{
    public void setColor(String color);
    public void mission();
}

class ThickPen implements IPen
{
    //Intrinsic Attribute
    private final String TASK;

    //Extrinsic Attribute
    private String color;

    public ThickPen() 
    {   
        TASK = "Write thick note";
    }

    @Override
    public void setColor(String color) {
       this.color = color;
    }

    @Override
    public void mission() {
       System.out.println("Thick pen with color " + color + " | " + "Task is " + TASK);
    }
    
}

class ThinPen implements IPen
{
    //Intrinsic Attribute
    private final String TASK;

    //Extrinsic Attribute
    private String color;

    public ThinPen() 
    {   
        TASK = "Write thin note";
    }

    @Override
    public void setColor(String color) {
       this.color = color;
    }

    @Override
    public void mission() {
       System.out.println("Thin pen with color " + color + " | " + "Task is " + TASK);
    }
    
}

class PenFactory 
{
    private static HashMap<String, IPen> hm = new HashMap<String, IPen>();

    public static IPen getPen(String type) {
        IPen p = null; 
        if(hm.containsKey(type)) {
            p = hm.get(type);
        } else {
            switch(type) {
                case "Thick Pen":
                    System.out.println("Thick pen created");
                    p = new ThickPen();
                    break;
                case "Thin Pen":
                    System.out.println("Thin pen created");
                    p = new ThinPen();
                    break;
                default:
                    System.out.println("Unreachable code");
            }
            hm.put(type, p);
        }
        return p;
    }
}