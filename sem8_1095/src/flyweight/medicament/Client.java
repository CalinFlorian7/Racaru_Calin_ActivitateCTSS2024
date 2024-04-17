package flyweight.medicament;

public class Client implements Flyweight {
    private String nume;
    private String numarAsigurare;

    public Client(String nume, String numarAsigurare) {
        this.nume = nume;
        this.numarAsigurare = numarAsigurare;
    }

    @Override
    public void achizitioneazaReteta(Reteta reteta) {
        System.out.println("Clientul "+nume+" cu nr asigurare "+numarAsigurare+" are reteta: ");
        System.out.println(reteta.toString());
    }

}
