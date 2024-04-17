package composite.medicament;

public interface StructuraAbstracta {
    public void adaugaCategorie(StructuraAbstracta sa);
    public void stergeCategorie(StructuraAbstracta sa);
    public void calculeazaPret(double procent);
    public void afisareProspect(String identare);
    public StructuraAbstracta getCategorie(int index);

}
