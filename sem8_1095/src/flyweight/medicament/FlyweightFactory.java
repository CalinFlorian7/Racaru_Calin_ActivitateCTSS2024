package flyweight.medicament;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<String,Flyweight> clienti;

    public FlyweightFactory() {
        this.clienti = new HashMap<>();
    }
    public Flyweight getClient(String nrAsigurare,String nume)
    {
        if(!clienti.containsKey(nrAsigurare))
        {
            clienti.put(nrAsigurare,new Client(nrAsigurare,nume));
        }
        return  clienti.get(nrAsigurare);
    }

}
