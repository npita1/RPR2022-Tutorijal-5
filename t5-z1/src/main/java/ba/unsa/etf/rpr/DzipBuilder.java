package ba.unsa.etf.rpr;

public class DzipBuilder implements AutoBuilder{

    private Auto auto;

    public DzipBuilder(Auto auto) {
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

    }

    @Override
    public void gradiBrzine() {

    }
}
