package adapter.autobuz;

import adapter.metrou.Calatorie;

public class AdapterMetrou  extends CardStb{
    private Calatorie calatorie;

    public AdapterMetrou() {
    }

    public AdapterMetrou(Calatorie calatorie) {
        this.calatorie = calatorie;
    }

    public AdapterMetrou(String numeClient, String cnpClient, Calatorie calatorie) {
        super(numeClient, cnpClient);
        this.calatorie = calatorie;
    }

    @Override
    public void validareCard() {
        if(calatorie.estePermisAccesul())
        {
            System.out.println("Calatorie placuta !");
        }
        else
        {
            System.out.println("Fonduri insuficiente!");
        }

    }
}
