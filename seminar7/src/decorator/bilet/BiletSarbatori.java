package decorator.bilet;

public class BiletSarbatori  extends Decorator{
    private static int discount=10;
    public BiletSarbatori(BiletAbstract bilet) {
        super(bilet);
    }

    @Override
    public void printareBilet() {
        super.getBilet().printareBilet();
        System.out.println("Sarbatori fericite");
    }

    @Override
    public void reducerePret() {
        int pret= ((Bilet)super.getBilet()).getPret()-discount;
        ((Bilet)super.getBilet()).setPret(pret);
    }
}
