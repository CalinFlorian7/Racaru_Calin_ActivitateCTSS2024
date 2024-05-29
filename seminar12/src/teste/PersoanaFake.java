package teste;

import clase.IPersoana;

public class PersoanaFake implements IPersoana {
    private String valoareSex;
    private int valoareVarsta;
    private  String valoareCnp;

    public void setValoareSex(String valoareSex) {
        this.valoareSex = valoareSex;
    }

    public void setValoareVarsta(int valoareVarsta) {
        this.valoareVarsta = valoareVarsta;
    }

    public void setValoareCnp(String valoareCnp) {
        this.valoareCnp = valoareCnp;
    }

    @Override
    public String getSex() {
        return valoareSex;
    }

    @Override
    public int getVarsta() {
        return valoareVarsta;
    }

    @Override
    public boolean checkCNP() {
        return false;
    }
}
