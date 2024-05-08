package state.clase;

public class Reteta {
    private int nrMEdicamente;
    private float pret;
    private int nrReteta;
    AbstractState stare;

    public Reteta(int nrMEdicamente, float pret, int nrReteta) {
        this.nrMEdicamente = nrMEdicamente;
        this.pret = pret;
        this.nrReteta = nrReteta;
        this.stare = new Emisa();

    }

    protected void setStare(AbstractState stare) {
        this.stare = stare;
    }
    public void cereMedicamente()
    {
        if(stare instanceof Emisa)
        {
            System.out.println("Au fost solicitate "+nrMEdicamente+" medicamnte pt reteta"+nrReteta);
            AbstractState solicitata=new Solicitata();
            solicitata.schimbaStare(this);
        }
        else
        {
            System.out.println("Nu poti solicita medicamente");
        }
    }


    public void cumparaMedicamnt()
    {
        if(stare instanceof Solicitata)
        {
            System.out.println("Au fost cumparate "+nrMEdicamente+" medicamnte pt reteta"+nrReteta);
            AbstractState cumparata=new Achizitionata();
            cumparata.schimbaStare(this);
        }
        else {
            System.out.println("Nu poti cumpara medicamnte cu aceasta reteta");
        }
    }
    public void respingeReteta()
    {
        if (stare instanceof Solicitata)
        {
            System.out.println("Nu avem aceste medicamente!!");
            AbstractState emisa=new Emisa();
            emisa.schimbaStare(this);
        }
        else
        {
            System.out.println("Reteta nu a fost solicitata!");
        }
    }


}
