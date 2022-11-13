package ba.unsa.etf.rpr;

public class CabrioBuilder implements AutoBuilder{

    private Auto auto;

    public CabrioBuilder() {
        this.auto = new Auto();
    }

    @Override
    public void gradiKrov() {
        auto.postaviKrov(false);
    }

    @Override
    public void gradiVrata() {
        auto.postaviVrata(2);
    }

    @Override
    public void gradiMjenjac() {
        auto.postaviMjenjac("Automatski");
    }

    @Override
    public void gradiBrzine() {
        auto.postaviBrojBrzina(5);
    }

    @Override
    public Auto getAuto() {
        return this.auto;
    }
}
