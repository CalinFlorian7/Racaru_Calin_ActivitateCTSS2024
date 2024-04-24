package strategy.clase;

public class Validator {
    private String nrAutobuz;
    private ModDePlata modPlata;

    public Validator(String nrAutobuz, ModDePlata modPlata) {
        this.nrAutobuz = nrAutobuz;
        this.modPlata = modPlata;
    }

    public void setNrAutobuz(String nrAutobuz) {
        this.nrAutobuz = nrAutobuz;
    }

    public void setModPlata(ModDePlata modPlata) {
        this.modPlata = modPlata;
    }
    public void valideaza(double pret)
    {
        modPlata.plateste(pret);
    }
}
