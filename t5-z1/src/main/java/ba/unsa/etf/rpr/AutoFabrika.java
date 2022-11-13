package ba.unsa.etf.rpr;

public class AutoFabrika {

    private AutoBuilder autoBuilder;

    public AutoFabrika(AutoBuilder autoBuilder) {
        this.autoBuilder = autoBuilder;
    }

    public Auto getAuto() {
        return this.autoBuilder.getAuto();
    }

    public void napraviAuto() {
        this.autoBuilder.gradiVrata();
        this.autoBuilder.gradiBrzine();
        this.autoBuilder.gradiKrov();
        this.autoBuilder.gradiMjenjac();
    }
}
