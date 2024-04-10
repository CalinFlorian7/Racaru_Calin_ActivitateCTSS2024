package proxy.autobuz;

public class Autobuz implements AutobuzAbstract {
    private int nrCalatori;
    private int nrAutobuz;
    private String numeSofer;

    public Autobuz(int nrCalatori, int nrAutobuz, String numeSofer) {
        this.nrCalatori = nrCalatori;
        this.nrAutobuz = nrAutobuz;
        this.numeSofer = numeSofer;
    }

    @Override
    public int getNrAutobuz() {
        return nrAutobuz;
    }

    @Override
    public void opresteAutobuzInStatie(String statie) {
        System.out.println("Autobuzul "+nrAutobuz+" condus de "+numeSofer+" a oprit in statia "+statie);

    }

    public int getNrCalatori() {
        return nrCalatori;
    }
}
