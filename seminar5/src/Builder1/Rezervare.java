package Builder1;

public class Rezervare {
    private boolean areMancare;
    private boolean areScaunErgonomic;
    private boolean areMuzica;
    private boolean areBautura;
    private  String genMuzical;

    public static class BuilderRezervare implements AbstractBuilder
    {
        private boolean areMancare;
        private boolean areScaunErgonomic;
        private boolean areMuzica;
        private boolean areBautura;
        private  String genMuzical;

        @Override
        public Rezervare build() {
            Rezervare rezervare=new Rezervare(areMancare,areScaunErgonomic,areMuzica,areBautura,genMuzical);
            return rezervare;
        }

        @Override
        public AbstractBuilder adaugaScaunErgonomic() {
            return null;
        }

        @Override
        public AbstractBuilder adaugaMancare() {
            this.areMancare=true;
            return this;
        }

        @Override
        public AbstractBuilder adaugaBauturi() {
            this.areBautura=true;
            return this;
        }

        @Override
        public AbstractBuilder adaugaMuzica() {
            this.areMuzica=true;
            return this;
        }

        @Override
        public AbstractBuilder adaugaGenMuzical(String genMuzical) {
            this.genMuzical=genMuzical;
            return this;
        }
    }
    protected Rezervare(boolean areMancare, boolean areScaunErgonomic, boolean areMuzica, boolean areBautura,String genMuzical) {
        this.genMuzical=genMuzical;
        this.areMancare = areMancare;
        this.areScaunErgonomic = areScaunErgonomic;
        this.areMuzica = areMuzica;
        this.areBautura = areBautura;
    }
    protected Rezervare()
    {
        this.genMuzical="????";
        this.areMancare = false;
        this.areScaunErgonomic = false;
        this.areMuzica = false;
        this.areBautura = false;
    }

    public boolean isAreMancare() {
        return areMancare;
    }

    protected void setAreMancare(boolean areMancare) {
        this.areMancare = areMancare;
    }

    public boolean isAreScaunErgonomic() {
        return areScaunErgonomic;
    }

    protected void setAreScaunErgonomic(boolean areScaunErgonomic) {
        this.areScaunErgonomic = areScaunErgonomic;
    }

    public boolean isAreMuzica() {
        return areMuzica;
    }

    protected void setAreMuzica(boolean areMuzica) {
        this.areMuzica = areMuzica;
    }

    public boolean isAreBautura() {
        return areBautura;
    }

    protected void setAreBautura(boolean areBautura) {
        this.areBautura = areBautura;
    }

    public String getGenMuzical() {
        return genMuzical;
    }

    protected void setGenMuzical(String genMuzical) {
        this.genMuzical = genMuzical;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "areMancare=" + areMancare +
                ", areScaunErgonomic=" + areScaunErgonomic +
                ", areMuzica=" + areMuzica +
                ", areBautura=" + areBautura +
                ", genMuzical='" + genMuzical + '\'' +
                '}';
    }
}
