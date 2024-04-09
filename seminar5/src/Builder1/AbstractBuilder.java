package Builder1;

public interface AbstractBuilder {

    Rezervare build();
    AbstractBuilder adaugaScaunErgonomic();
    AbstractBuilder adaugaMancare();
    AbstractBuilder adaugaBauturi();
    AbstractBuilder adaugaMuzica();
    AbstractBuilder adaugaGenMuzical(String genMuzical);


}
