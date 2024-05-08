package state.clase;

public class Solicitata implements AbstractState{
    protected Solicitata() {
    }

    @Override
    public void schimbaStare(Reteta reteta) {
        reteta.setStare(this);
    }
}
