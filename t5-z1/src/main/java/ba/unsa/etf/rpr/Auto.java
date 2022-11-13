package ba.unsa.etf.rpr;

public class Auto implements AutoPlan{

    private Boolean krov;
    private Integer brojVrata;
    private String vrstaMjenjaca;
    private Integer brojBrzina;

    @Override
    public void postaviKrov(Boolean imakrov) {
        this.krov = imakrov;
    }

    @Override
    public void postaviVrata(Integer vrata) {
        this.brojVrata = vrata;
    }

    @Override
    public void postaviMjenjac(String mjenjac) {
        this.vrstaMjenjaca = mjenjac;
    }

    @Override
    public void postaviBrojBrzina(Integer brzine) {
        this.brojBrzina = brzine;
    }

    public Boolean getKrov() {
        return krov;
    }

    public Integer getBrojVrata() {
        return brojVrata;
    }

    public String getVrstaMjenjaca() {
        return vrstaMjenjaca;
    }

    public Integer getBrojBrzina() {
        return brojBrzina;
    }
}
