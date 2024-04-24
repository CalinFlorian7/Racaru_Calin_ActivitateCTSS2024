package strategy.program;

import strategy.clase.PlataCardBancar;
import strategy.clase.PlataSms;
import strategy.clase.Validator;

public class Program {
    public static void main(String[] args) {
        Validator validator=new Validator("32",new PlataSms());
        validator.valideaza(32);
        Validator validatorCardBancar=new Validator("32",new PlataCardBancar());
        validator.valideaza(21);

    }
}
