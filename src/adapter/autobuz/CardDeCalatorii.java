package adapter.autobuz;

public class CardDeCalatorii extends CardStb{
    private float soldCard;
    private static float pretCalatorie=3.0f;

    public CardDeCalatorii() {
    }

    public CardDeCalatorii(String numeClient, String cnpClient, float soldCard) {
        super(numeClient, cnpClient);
        this.soldCard = soldCard;
    }

    @Override
    public void validareCard() {
        this.soldCard-=pretCalatorie;
        if(this.soldCard>pretCalatorie)
        {
            System.out.println("Calatorie placuta!");
        }
        else
        {
            System.out.println("Fonduri insuficiente");
        }


    }
}