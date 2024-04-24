package strategy.clase;

public class PlataCardBancar implements ModDePlata {
    @Override
    public void plateste(double pret) {
        System.out.println("S a efectuat plata cu ca bancar in val de "+pret);

    }
}
