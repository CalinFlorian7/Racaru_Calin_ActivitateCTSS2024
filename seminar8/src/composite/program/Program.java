package composite.program;

import composite.clase.Agentie;
import composite.clase.Filiala;
import composite.clase.Sediu;
import composite.clase.Sucursala;

public class Program {
    public static void main(String[] args) {
        Sediu sediu=new Agentie("Banca",10);
        Sediu sucursala1=new Sucursala("BRD",9);
        Sediu agentieSector1=new Agentie("BRD sector 1",23);
        Sediu agentieSector2=new Agentie("BRD sector 2",23);
        Sediu filialaRomana=new Filiala(4,"BRD-Romana");
        Sediu filialaVictoriei=new Filiala(4,"BRD-Victoriei");
        Sediu filialaObor=new Filiala(4,"BRD-Obor");
        Sediu filialMuncii=new Filiala(4,"BRD-Muncii");
        agentieSector1.adaugaSediu(filialaRomana);
        agentieSector1.adaugaSediu(filialaVictoriei);
        agentieSector2.adaugaSediu(filialaObor);
        agentieSector2.adaugaSediu(filialMuncii);
        sediu.adaugaSediu(filialaVictoriei);
        sediu.adaugaSediu(agentieSector1);
        sediu.adaugaSediu(filialaVictoriei);
        System.out.println(agentieSector1.calculeazaNrAngajati());
        System.out.println(sediu.calculeazaNrAngajati());


    }

}

