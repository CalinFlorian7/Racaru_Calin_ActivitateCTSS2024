package template.clase;

public class AchizitieMedicamntPeBazaDeReteta extends Template{
    private String numeMedicament;


    public AchizitieMedicamntPeBazaDeReteta(String numeMedicament) {
        super();
        this.numeMedicament = numeMedicament;

    }

    @Override
    protected void primesteReteta() {
        System.out.println("Am primit reteta pt medicamentul "+numeMedicament);
    }

    @Override
    protected boolean verificaStoc() {
        return  super.stocuri.containsKey(numeMedicament);

    }

    @Override
    protected void incaseaza() {
        System.out.println("Am incasat banii pt medicamntul "+numeMedicament);

    }

    @Override
    protected void auduceMedicament() {
        System.out.println("Medicmantul "+numeMedicament+" a fost adus din depozit");
        if(super.stocuri.get(numeMedicament)>1) {
            super.stocuri.replace(numeMedicament, super.stocuri.get(numeMedicament) - 1);
        }
        else
        {
            super.stocuri.remove(numeMedicament);
        }

    }

    @Override
    protected void emiteBon() {
        System.out.println("Bonul a fost emis");
    }

    @Override
    protected void respingeReteta() {
        System.out.println("Reteta a fost respinsa!");
    }
}
