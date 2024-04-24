package observer.clase;

public class Client implements Observer{
    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteMesaj(String mesaj) {
        System.out.printf("%s: Mesajul primit %s%n", this.nume, mesaj);
    }
}
