package decorator.bilet;

public class Bilet implements BiletAbstract{
    private int pret;
    private String cod;

    public Bilet(int pret, String cod) {
        this.pret = pret;
        this.cod = cod;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public int getPret() {
        return pret;
    }

    @Override
    public void printareBilet() {
        System.out.println("Pretul biletului cu codul "+cod +" este: "+pret);
    }
}
