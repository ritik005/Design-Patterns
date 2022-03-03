package Structural.Bridge;

abstract class TV 
{
    IRemote remote;

    TV(IRemote remote)
    {
        this.remote = remote;
    }

    abstract void on();
    abstract void off();
}

interface IRemote 
{
    public void on();
    public void off();
}

class SonyTv extends TV
{
    IRemote remoteType;

    SonyTv(IRemote remote)
    {
        super(remote);
        this.remoteType = remote;
    }

    @Override
    void on() {
        System.out.println("Sony Tv is on :");
        remoteType.on();
    }

    @Override
    void off() {
        System.out.println("Sony Tv is off :");
        remoteType.off();
    }
    
}

class SamsungTv extends TV
{
    IRemote remoteType;

    SamsungTv(IRemote remote)
    {
        super(remote);
        this.remoteType = remote;
    }

    @Override
    void on() {
        System.out.println("Samsung Tv is on");
        remoteType.on();
    }

    @Override
    void off() {
        System.out.println("Samsung Tv is off");
        remoteType.off();
    }
    
}

class OldRemote implements IRemote
{

    @Override
    public void on() {
        System.out.println("On with old remote");
    }

    @Override
    public void off() {
        System.out.println("Off with old remote");
    }
    
}

class NewRemote implements IRemote
{

    @Override
    public void on() {
        System.out.println("On with new remote");
    }

    @Override
    public void off() {
        System.out.println("Off with new remote");
    }
    
}
