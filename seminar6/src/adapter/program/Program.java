package adapter.program;

import adapter.autobuz.AdapterMetrou;
import adapter.autobuz.CardStb;
import adapter.metrou.BiletMetrou;
import adapter.metrou.Calatorie;

public class Program {
    public static void validareIntrareMetrou(Calatorie calatorie)
    {
        if(calatorie.estePermisAccesul())
        {
            System.out.println("Calatorie placuta");
        }
        else {
            System.out.println("Sold calatorii insuficiente");
        }
    }
    public static void validareUrcareStb(CardStb cardStb)
    {
        cardStb.validareCard();
    }
    public static void main(String[] args) {
        Calatorie biletMetrou=new BiletMetrou("Manole",3);
        validareIntrareMetrou(biletMetrou);
        validareIntrareMetrou(biletMetrou);
        validareIntrareMetrou(biletMetrou);
        validareIntrareMetrou(biletMetrou);
        CardStb biletAutobuz=new AdapterMetrou(biletMetrou);
        validareUrcareStb(biletAutobuz);


    }
}
