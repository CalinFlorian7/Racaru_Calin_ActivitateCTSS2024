package Builder;

public class RezervareBuilder  implements AbstractBuilder{

    private Rezervare rezervare;

    public RezervareBuilder() {
        this.rezervare = new Rezervare();
    }

    @Override
    public Rezervare build() {


        return rezervare;
    }

    @Override
    public AbstractBuilder adaugaScaunErgonomic() {
        rezervare.setAreScaunErgonomic(true);
        return this;
    }

    @Override
    public AbstractBuilder adaugaMancare() {
        rezervare.setAreMancare(true);
        return this;
    }

    @Override
    public AbstractBuilder adaugaBauturi() {
        rezervare.setAreBautura(true);
        return this;
    }

    @Override
    public AbstractBuilder adaugaMuzica() {
        rezervare.setAreMuzica(true);
        return this;
    }

    @Override
    public AbstractBuilder adaugaGenMuzical(String genMuzical) {
        rezervare.setGenMuzical(genMuzical);
        return this;
    }
}
