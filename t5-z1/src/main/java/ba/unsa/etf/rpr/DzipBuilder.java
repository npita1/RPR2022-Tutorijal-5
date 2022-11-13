package ba.unsa.etf.rpr;

public class DzipBuilder implements AutoBuilder{

    private Auto auto;

    public DzipBuilder() {
        this.auto = auto;
    }

    @Override
    public void gradiKrov() {
        auto.postaviKrov(true);
    }

    @Override
    public void gradiVrata() {
        auto.postaviVrata(4);
    }

    @Override
    public void gradiMjenjac() {
        auto.postaviMjenjac("Manuelni");
    }

    @Override
    public void gradiBrzine() {
        auto.postaviBrojBrzina(6);
    }

    @Override
    public Auto getAuto() {
        return this.auto;
    }
}
