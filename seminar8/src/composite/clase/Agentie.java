package composite.clase;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Agentie implements Sediu{
    private List<Sediu>listaSedii;
    private String nume;
    private int nrOperatori;

    public Agentie(String nume, int nrOperatori) {
        this.nume = nume;
        this.nrOperatori = nrOperatori;
        this.listaSedii=new ArrayList<>();
    }

    @Override
    public void adaugaSediu(Sediu sediu) {
        this.listaSedii.add(sediu);

    }

    @Override
    public void stergeSediu(Sediu sediu) {
        this.listaSedii.remove(sediu);

    }

    @Override
    public Sediu getSediu(int index) {

        return listaSedii.get(index);
    }

    @Override
    public void afiseaza(String identare) {
        System.out.println(identare+"Agentia cu numele "+nume+" are "+nrOperatori+"si are urm sedii:");
        for (Sediu sediu:listaSedii
             ) {
            System.out.println(identare+"    ");

        }

    }

    @Override
    public int calculeazaNrAngajati() {
        int suma=0;
        for (Sediu sediu:listaSedii) {
           suma+= sediu.calculeazaNrAngajati();

        }
        return suma+nrOperatori;
    }
}
