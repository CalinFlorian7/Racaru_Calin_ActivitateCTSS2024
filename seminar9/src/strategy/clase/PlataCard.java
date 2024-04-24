package strategy.clase;

public class PlataCard  implements ModDePlata{
    @Override
    public void plateste(double pret) {
        System.out.println("S a efectuat plata cu cardul in val de "+pret);
    }
}
