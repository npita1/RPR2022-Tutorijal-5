package ba.unsa.etf.rpr;

public class App 
{
    public static void main( String[] args )
    {

        AutoBuilder cabrioAutomobil = new CabrioBuilder();
        AutoFabrika fabrika = new AutoFabrika(cabrioAutomobil);
        fabrika.napraviAuto();
        Auto automobil = fabrika.getAuto();

        System.out.println("Auto napravljeno!");
        System.out.println("Da li auto ima krov? - " + automobil.getKrov());
        System.out.println("Koliko vrata ima auto? - " + automobil.getBrojVrata());
        System.out.println("Koliko brzina ima auto? - " + automobil.getBrojBrzina());
        System.out.println("Vrsta mjenjaca: " + automobil.getVrstaMjenjaca());
    }
}
