package composite.clase;

public class Filiala implements Sediu{
    private int nrAngajati;
    private String nume;

    public Filiala(int nrAngajati, String nume) {
        this.nrAngajati = nrAngajati;
        this.nume = nume;
    }

    @Override
    public void adaugaSediu(Sediu sediu) {
        throw  new UnsupportedOperationException("err");
    }

    @Override
    public void stergeSediu(Sediu sediu) {
        throw  new UnsupportedOperationException("err");

    }

    @Override
    public Sediu getSediu(int index) {
        throw  new UnsupportedOperationException("err");

    }

    @Override
    public void afiseaza(String indentare) {
        System.out.println(indentare+"Filiala "+nume+" are "+nrAngajati +"angajati ");


    }

    @Override
    public int calculeazaNrAngajati() {
        throw  new UnsupportedOperationException("err");

    }
}
