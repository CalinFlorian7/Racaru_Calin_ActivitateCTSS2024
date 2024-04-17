package composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Sucursala implements Sediu {
    private List<Sediu> listaSedii;
    private String nume;
    private int nrProgramatori;


    public Sucursala(String nume, int nrOperatori) {
        this.nume = nume;
        this.nrProgramatori = nrOperatori;
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
        System.out.println(identare+"Agentia cu numele "+nume+" are "+nrProgramatori+"si are urm sedii:");
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
        return suma+nrProgramatori;
    }
}
