package ba.unsa.etf.rpr;

public class App 
{
    public static void main( String[] args )
    {

        PizzaFactory pizzaMajstor = new PizzaFactory();
        Pizza mojaPizza = pizzaMajstor.naruciPizzu("Margarita");
        mojaPizza.napraviPicu();

    }
}
