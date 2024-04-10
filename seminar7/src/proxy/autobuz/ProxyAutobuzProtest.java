package proxy.autobuz;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;

public class ProxyAutobuzProtest implements AutobuzAbstract{

private List<String> statiiInterzise=new ArrayList<>();
AutobuzAbstract autobuz;

    public ProxyAutobuzProtest(List<String> statiiInterzise, AutobuzAbstract autobuz) {
        this.statiiInterzise = statiiInterzise;
        this.autobuz = autobuz;
    }
    public void adaugaStatieInterzisa(String statie)
    {
        statiiInterzise.add(statie);
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
        if(statiiInterzise.contains(statie))
        {
            System.out.println("Nu se opreste in statie, este interzisa!");
        }
        else
        {
            autobuz.opresteAutobuzInStatie(statie);
        }

    }
}
