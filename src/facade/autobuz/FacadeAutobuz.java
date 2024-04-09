package facade.autobuz;

public class FacadeAutobuz {
    private Autobuz autobuz;

    public FacadeAutobuz(Autobuz autobuz) {
        this.autobuz = autobuz;
    }
    public void deschideToateUsile()
    {
        autobuz.deschideUsaDinFata();
        autobuz.deschideUsaDinMijloc();
        autobuz.deschideUsaDinSpate();
    }
    public void elibereazaToateUsile()
    {
        autobuz.punePeLiberUsaDinFata();
        autobuz.punePeLiberUsaDinMijloc();
        autobuz.punePeLiberUsaDinSpate();
    }
}
