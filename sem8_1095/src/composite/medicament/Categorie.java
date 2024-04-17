package composite.medicament;

import java.util.ArrayList;
import java.util.List;

public class Categorie implements StructuraAbstracta {
     private List<StructuraAbstracta> medicamente;
    private String denumire;
    private double pretReducere;

    public Categorie(List<StructuraAbstracta> medicamente, String denumire, double pretReducere) {
        this.medicamente = medicamente;
        this.denumire = denumire;
        this.pretReducere = pretReducere;
    }

    public Categorie(String denumire, double pretReducere) {
        this.denumire = denumire;
        this.pretReducere = pretReducere;
        this.medicamente=new ArrayList<>();
    }

    public List<StructuraAbstracta> getMedicamente() {
        return medicamente;
    }

    public String getDenumire() {
        return denumire;
    }

    public double getPretReducere() {
        return pretReducere;
    }

    @Override
    public void adaugaCategorie(StructuraAbstracta sa) {
        this.medicamente.add(sa);
    }

    @Override
    public void stergeCategorie(StructuraAbstracta sa) {
        this.medicamente.remove(sa);

    }

    @Override
    public void calculeazaPret(double procent) {
        for(StructuraAbstracta sa:medicamente)
        {
            sa.afisareProspect(" ");
        }

    }

    @Override
    public void afisareProspect(String identare) {
        System.out.println(identare+"categoria: "+this.denumire+" are urm subcateg:");
        for(StructuraAbstracta sa:medicamente)
        {
            sa.afisareProspect(identare+"    ");
        }

    }

    @Override
    public StructuraAbstracta getCategorie(int index) {
        if(index>=0&&index<this.medicamente.size())
        {
            return this.medicamente.get(index);
        }
        else
            return null;


    }
}
