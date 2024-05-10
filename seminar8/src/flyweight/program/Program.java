package flyweight.program;

import flyweight.clase.Banca;
import flyweight.clase.Cont;

public class Program {
    public static void main(String[] args) {
        Banca banca=new Banca("BCR",212.3);
        banca.putClient("Calin","Leresti","0741");
        banca.putClient("Dan","Vasilea 34","0722");
        Cont cont =new Cont(12,2222);
        Cont cont1 =new Cont(13,921021);
        banca.getClient("Calin").afisareInformatiiClient(cont);
    }
}
