package decorator.bilet;

public class BiletAniversareStb  extends Decorator{
    public BiletAniversareStb(BiletAbstract bilet) {
        super(bilet);
    }

    @Override
    public void printareBilet() {
        super.getBilet().printareBilet();
        System.out.println("La mutli ani Stb!");
    }

    @Override
    public void reducerePret() {
        ((Bilet)super.getBilet()).setPret(0);

    }
}
