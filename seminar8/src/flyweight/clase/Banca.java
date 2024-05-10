package flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class Banca {
    private String nume;
    private double capital;
    private Map<String,Flyweight> clienti;

    public Banca(String nume, double capital) {
        this.nume = nume;
        this.capital = capital;
        clienti=new HashMap<>();
    }
    public void putClient(String nume,String adresa,String telefon)
    {
        Flyweight client=new Client(nume,adresa,telefon);
        if(!clienti.containsKey(nume))
        {
            clienti.put(nume,client);
        }
        else
        {
            System.out.println("Acest client deja exista!");
        }
    }
    public Flyweight getClient(String nume)
    {
        if(!clienti.containsKey(nume))
        {
            throw new IllegalArgumentException("Clientul nu exista");
        }
        else
            return clienti.get(nume);
    }

}
