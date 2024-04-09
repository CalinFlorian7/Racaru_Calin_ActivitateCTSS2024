package adapter.autobuz;

import java.util.GregorianCalendar;

public class AbonamentCardCalatorii extends CardStb {
    private GregorianCalendar dataExpirare;

    public AbonamentCardCalatorii(GregorianCalendar dataExpirare) {
        this.dataExpirare = dataExpirare;
    }

    public AbonamentCardCalatorii(String numeClient, String cnpClient, GregorianCalendar dataExpirare) {
        super(numeClient, cnpClient);
        this.dataExpirare = dataExpirare;
    }

    @Override
    public void validareCard() {
        if(this.dataExpirare.before(new GregorianCalendar()))
        {
            System.out.println("Calatorie placuta!");
        }
        else
        {
            System.out.println("Abonamentul a expirat!");
        }

    }
}
