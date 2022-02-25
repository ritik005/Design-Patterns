package Creational.FactoryMethod;

interface OS 
{
    void getInfo();
}

class Android implements OS
{

    @Override
    public void getInfo() {
        System.out.println("Android is running");
    }
    
}

class IOS implements OS
{

    @Override
    public void getInfo() {
        System.out.println("IOS is running");
    }
    
}

class Window implements OS
{

    @Override
    public void getInfo() {
        System.out.println("Window is running");
    }
    
}

class OperatingSystemFactory
{
    public OS getInstance(String str) 
    {
        if(str == "open") return new Android();
        else if(str == "closed") return new IOS();
        else return new Window();
    }
}