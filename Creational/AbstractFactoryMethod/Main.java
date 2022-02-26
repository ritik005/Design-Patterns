package Creational.AbstractFactoryMethod;

public class Main {
    public static void main(String[] args) {
        ActionMovie am = new ActionMovie();
        ITollywoodMovie tAction = am.GetTollywoodMovie();
        IBollywoodMovie bAction = am.GetBollywoodMovie();

        System.out.println("Action movies are: ");
        System.out.println(tAction.MovieName());
        System.out.println(bAction.MovieName());

        ComedyMovie cm = new ComedyMovie();
        ITollywoodMovie tComedy = cm.GetTollywoodMovie();
        IBollywoodMovie bComedy = cm.GetBollywoodMovie();

        System.out.println("Comedy movies are: ");
        System.out.println(tComedy.MovieName());
        System.out.println(bComedy.MovieName());

    }
}
