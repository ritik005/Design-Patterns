package Structural.Facade;

interface MobileShop 
{
    public void modelNo();
    public void price();
}

class Samsung implements MobileShop
{

    @Override
    public void modelNo() {
        System.out.println("Galaxy S9");
    }

    @Override
    public void price() {
        System.out.println("Rs 350000");
    }
    
}

class IPhone implements MobileShop
{

    @Override
    public void modelNo() {
        System.out.println("Iphone 11 pro");
    }

    @Override
    public void price() {
        System.out.println("Rs 75000");
    }
    
}

class Shopkeeper
{
    private MobileShop Iphone;
    private MobileShop Samsung;

    public Shopkeeper()
    {
        Iphone = new IPhone();
        Samsung = new Samsung();
    }

    public void iphoneSale() {
        Iphone.modelNo();
        Iphone.price();
    }

    public void samsungSale() {
        Samsung.modelNo();
        Samsung.price();
    }
}

