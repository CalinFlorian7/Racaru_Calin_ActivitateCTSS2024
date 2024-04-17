package composite.program;

import composite.medicament.Categorie;
import composite.medicament.Medicament;
import composite.medicament.StructuraAbstracta;

public class Program {
    public static void main(String[] args) {
        StructuraAbstracta medicament=new Categorie("Medicamente",0);
        StructuraAbstracta raceala=new Categorie("Raceala",0.2);
        StructuraAbstracta durere=new Categorie("Durere",0.1);
        StructuraAbstracta copii=new Categorie("Copii",0);
        StructuraAbstracta adulti=new Categorie("Adulti",0);
        StructuraAbstracta nurofen=new Medicament("Nurofen",0.3);
        StructuraAbstracta mig400=new Medicament("mig400",0.3);
        StructuraAbstracta nurofenKids=new Medicament("nurofenKids",0.3);
        medicament.adaugaCategorie(raceala);
        medicament.adaugaCategorie(durere);
        raceala.adaugaCategorie(copii);
        raceala.adaugaCategorie(adulti);
        copii.adaugaCategorie(nurofenKids);
        copii.adaugaCategorie(mig400);
        adulti.adaugaCategorie(nurofen);
        medicament.afisareProspect(" ");
        raceala.calculeazaPret(0.1);
        medicament.afisareProspect(" ");




    }
}
