package adapter.metrou;

public class BiletMetrou extends Calatorie{
    private int nrCalartorii;

    public BiletMetrou(String numeClient, int nrCalartorii) {
        super(numeClient);
        this.nrCalartorii = nrCalartorii;
    }

    public BiletMetrou() {

    }

    @Override
    public boolean estePermisAccesul() {
        return --this.nrCalartorii>=0;
    }
}
