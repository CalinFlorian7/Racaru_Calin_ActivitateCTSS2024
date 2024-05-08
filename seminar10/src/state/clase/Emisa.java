package state.clase;

public class Emisa implements AbstractState{
    protected Emisa() {
    }

    @Override
    public void schimbaStare(Reteta reteta) {
        reteta.setStare(this);

    }
}
