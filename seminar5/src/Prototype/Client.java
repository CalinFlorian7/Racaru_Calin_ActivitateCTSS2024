package Prototype;

import java.util.ArrayList;
import java.util.List;

public class Client implements AbstractPrototype{
    private String nume;
    private int varsta;
    private List<String>listaAccesorii;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public Client(String nume, int varsta, List<String> accesorii) {
        this.nume = nume;
        if(varsta<14)
        {
            throw  new RuntimeException("Varsta pre mica");
        }
        this.varsta = varsta;
        if(accesorii.size()>=5)
        {
            throw new RuntimeException("prea multe accesorii");
        }
        listaAccesorii=accesorii;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", listaAccesorii=" + listaAccesorii +
                '}';
    }

    private Client()
{

}
    @Override
    public AbstractPrototype clone() {
        Client client=new Client();
        client.nume=this.nume;
        client.varsta=this.varsta;
        client.listaAccesorii=new ArrayList<>();
        this.listaAccesorii.forEach(accesoriu->{
            client.listaAccesorii.add(accesoriu);
        });

        return client;
    }
}
