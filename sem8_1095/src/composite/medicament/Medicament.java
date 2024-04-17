package composite.medicament;

public class Medicament  implements StructuraAbstracta{
    private String denumire;
    private  double pret;

    public Medicament(String denumire, double pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    public String getDenumire() {
        return denumire;
    }

    public double getPret() {
        return pret;
    }

    @Override
    public void adaugaCategorie(StructuraAbstracta sa) {
        throw new UnsupportedOperationException("nu poti adauga categ");

    }

    @Override
    public void stergeCategorie(StructuraAbstracta sa) {
        throw new UnsupportedOperationException("nu poti sterge categ");

    }

    @Override
    public void calculeazaPret(double procent) {
        this.pret=this.pret*(1-procent);

    }

    @Override
    public void afisareProspect(String identare) {
        System.out.println(identare+"Medicamnetul "+this.denumire+" are pretul "+pret );




    }

    @Override
    public StructuraAbstracta getCategorie(int index) {
        return null;
    }
}
