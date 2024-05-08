package template.clase;

import java.util.HashMap;
import java.util.Map;

public abstract class Template {
    protected Map <String,Integer>stocuri;

    protected Template() {
        this.stocuri=new HashMap<>();
        stocuri.put("paracetamol",1);
        stocuri.put("nurofen",2);
        stocuri.put("algocalmin",3);
    }
    protected abstract void primesteReteta();
    protected abstract boolean verificaStoc();
    protected abstract void incaseaza();
    protected abstract void auduceMedicament();
    protected abstract void emiteBon();
    protected abstract void respingeReteta();


    public final void cumparaMedicament()
    {
    primesteReteta();
    if(verificaStoc())
    {
        auduceMedicament();
        incaseaza();
        emiteBon();
    }
    else
    {
        respingeReteta();
    }

    }
}
