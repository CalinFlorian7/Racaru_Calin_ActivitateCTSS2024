package strategy.clase;

public class PlataSms implements ModDePlata{
    public PlataSms() {
    }

    @Override
    public void plateste(double pret) {
        System.out.println("S a efectuat plata cu sms in val de "+pret);

    }
}
