package Creational.AbstractFactoryMethod;

// Abstract factory - Factory of Factory

interface MovieFactory 
{
    IBollywoodMovie GetBollywoodMovie();
    ITollywoodMovie GetTollywoodMovie();   
} 

interface ITollywoodMovie
{
    public String MovieName();
}

interface IBollywoodMovie
{
    public String MovieName();
}

class TollywoodActionMovie implements ITollywoodMovie
{

    @Override
    public String MovieName() {
        return "Vijay the master ";
    }
    
}

class TollywoodComedyMovie implements ITollywoodMovie
{

    @Override
    public String MovieName() {
        return "Kanchana";
    }
    
}

class BollywoodComedyMovie implements IBollywoodMovie
{

    @Override
    public String MovieName() {
        return "Hera Pheri";
    }
    
}

class BollywoodActionMovie implements IBollywoodMovie
{

    @Override
    public String MovieName() {
        return "Rowdy Rathore";
    }
    
}

class ComedyMovie implements MovieFactory
{

    @Override
    public IBollywoodMovie GetBollywoodMovie() {
        return new BollywoodComedyMovie();
    }

    @Override
    public ITollywoodMovie GetTollywoodMovie() {
        return new TollywoodComedyMovie();
    }
    
}

class ActionMovie implements MovieFactory
{

    @Override
    public IBollywoodMovie GetBollywoodMovie() {
        return new BollywoodActionMovie();
    }

    @Override
    public ITollywoodMovie GetTollywoodMovie() {
        return new TollywoodActionMovie();
    }
    
}

