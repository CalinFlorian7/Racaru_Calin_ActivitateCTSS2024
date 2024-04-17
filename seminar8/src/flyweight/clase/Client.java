package flyweight.clase;

public class Client  implements Flyweight{
    private String nume;
    private String adresa;
    private String nrTelefon;

    public Client(String nume, String adresa, String nrTelefon) {
        this.nume = nume;
        this.adresa = adresa;
        this.nrTelefon = nrTelefon;
    }

    @Override
    public void afisareInformatiiClient(Cont cont) {
        System.out.println("Clientul "+nume+" cu adresa "+adresa+" cu nr de tel: "+nrTelefon+" are contul:"+cont.toString());



    }
}
