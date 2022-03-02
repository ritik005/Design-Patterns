package Creational.BuilderMethod;

import java.util.LinkedList;

interface Builder
{
    public void buildBody();
    public void addWheels();
    public void addHeadlights();
    public Product getVehicle();
}

class Product
{
    private LinkedList<String> list;

    public Product()
    {
        list = new LinkedList<String>();
    }

    public void add(String str)
    {
        list.addLast(str);
    }

    public void show()
    {
        System.out.println("Product completed as below: ");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

class Car implements Builder
{
    private Product product = new Product();

    @Override
    public void buildBody() {
        product.add("This is a body of a car");
    }

    @Override
    public void addWheels() {
        product.add("4 wheels are added");
    }

    @Override
    public void addHeadlights() {
        product.add("2 headlights are added");
    }

    @Override
    public Product getVehicle() {
        return product;
    }
    
}

class MotorCycle implements Builder
{
    private Product product = new Product();

    @Override
    public void buildBody() {
        product.add("This is a body of motorcycle");
    }

    @Override
    public void addWheels() {
        product.add("2 wheels are added");
    }

    @Override
    public void addHeadlights() {
        product.add("1 headlight is added");
    }

    @Override
    public Product getVehicle() {
        return product;
    }
    
}

class Director
{
    Builder myBuilder;

    public void Construct(Builder builder)
    {
        myBuilder = builder;
        myBuilder.buildBody();
        myBuilder.addWheels();
        myBuilder.addHeadlights();
    }
}

