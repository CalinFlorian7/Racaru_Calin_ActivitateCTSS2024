package decorator.program;

import decorator.bilet.*;

public class Program {
    public static void main(String[] args) {
        BiletAbstract bilet=new Bilet(200,"AZ");
        printareBilet(bilet);
        Decorator decorator=new BiletSarbatori(bilet);
        decorator.reducerePret();
        printareBilet(decorator);
        Decorator decorator1=new BiletSarbatori(bilet);
        Decorator decorator2=new BiletAniversareStb(decorator1);
        printareBilet(decorator2);

    }
    public static void printareBilet(BiletAbstract bilet)
    {
        bilet.printareBilet();
    }
}
