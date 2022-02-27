package Behavioral.Mediator;

//Mediator
interface IATCMediator 
{
    public void registerRunway(Runway runway);
    public void registerFlight(Flight flight);
    public boolean isAvailable();
    public void setAvailabilty(boolean status);    
}

// Concrete Mediator
class ATCMediator implements IATCMediator
{
    private Runway runway;
    private Flight flight;
    private boolean available;

    @Override
    public void registerRunway(Runway runway) {
        this.runway = runway;
    }

    @Override
    public void registerFlight(Flight flight) {
        this.flight = flight;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    @Override
    public void setAvailabilty(boolean status) {
        this.available = status;
    }
    
}

interface Command 
{
    void land();
}

class Runway implements Command
{
    private IATCMediator atcMediator;

    Runway(IATCMediator atcMediator) 
    {
        this.atcMediator = atcMediator;
    }

    @Override
    public void land() {
        System.out.println("Landing permission granted");
        atcMediator.setAvailabilty(true);
    }
    
}

class Flight implements Command
{
    private IATCMediator atcMediator;

    Flight(IATCMediator atcMediator)
    {
        this.atcMediator = atcMediator;
    }

    @Override
    public void land() {
        if(atcMediator.isAvailable()) {
            System.out.println("Landed successfully");
            atcMediator.setAvailabilty(false);
        } else {
            System.out.println("Waiting for the runway ");
        }
    }
    
}
