package ba.unsa.etf.rpr;

public class PizzaFactory {

    public Pizza naruciPizzu(String vrstaPizze) {
        if (vrstaPizze == null)
            return null;
        if (vrstaPizze.equals("Margarita"))
            return new Margarita();
        else if (vrstaPizze.equals("Kapricoza"))
            return new Kapricoza();
        else
            return new Vegeterijana();
    }
}
