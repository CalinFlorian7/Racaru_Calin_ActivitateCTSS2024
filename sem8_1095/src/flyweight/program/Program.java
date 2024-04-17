package flyweight.program;

import flyweight.medicament.Flyweight;
import flyweight.medicament.FlyweightFactory;
import flyweight.medicament.Reteta;

public class Program {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory=new FlyweightFactory();
        Reteta reteta1=new Reteta("reteta1",12,2);
        Reteta reteta2=new Reteta("reteta2",15,16);
        Reteta reteta3=new Reteta("reteta3",127,7);
        Reteta reteta4=new Reteta("reteta4",13,1);
        Reteta reteta5=new Reteta("reteta1",16,44);
        Flyweight client=flyweightFactory.getClient("12345","Calin");
        client.achizitioneazaReteta(reteta1);
        client.achizitioneazaReteta(reteta2);



    }
}
