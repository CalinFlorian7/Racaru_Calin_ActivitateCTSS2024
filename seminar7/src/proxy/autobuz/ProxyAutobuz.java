package proxy.autobuz;

public class ProxyAutobuz implements AutobuzAbstract{
   private AutobuzAbstract autobuz;

    public ProxyAutobuz(AutobuzAbstract autobuz) {
        this.autobuz = autobuz;
    }

    @Override
    public int getNrAutobuz() {
        return autobuz.getNrAutobuz();
    }

    @Override
    public int getNrCalatori() {
        return autobuz.getNrCalatori();
    }

    @Override
    public void opresteAutobuzInStatie(String statie) {
        if(autobuz.getNrCalatori()>0) {
            autobuz.opresteAutobuzInStatie(statie);
        }
        else
        {
            System.out.println("Autobuzul "+autobuz.getNrAutobuz()+" nu opreste in statie");
        }

    }
}
