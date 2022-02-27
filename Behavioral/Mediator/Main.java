package Behavioral.Mediator;

public class Main {
    public static void main(String[] args) {
        IATCMediator atcMediator = new ATCMediator();
        Flight airIndia = new Flight(atcMediator);
        Runway mainRunway = new Runway(atcMediator);

        atcMediator.registerFlight(airIndia);
        atcMediator.registerRunway(mainRunway);
        
        mainRunway.land();
        airIndia.land();
    }
}
