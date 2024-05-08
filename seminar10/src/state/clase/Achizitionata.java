package state.clase;

public class Achizitionata implements AbstractState{
    protected Achizitionata() {
    }

    @Override
    public void schimbaStare(Reteta reteta) {
        reteta.setStare(this);
    }
}
