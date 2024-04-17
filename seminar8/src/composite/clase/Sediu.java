package composite.clase;

public interface Sediu {
    public void adaugaSediu(Sediu sediu);
    public void stergeSediu(Sediu sediu);
    public Sediu getSediu(int index);
    public  void afiseaza(String indentare);
    public int calculeazaNrAngajati();
}
