package Main;



import Builder1.AbstractBuilder;
import Builder1.Rezervare;
import Prototype.AbstractPrototype;
import Prototype.Client;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        RezervareBuilder rezervareBuilder=new RezervareBuilder();
//        Rezervare rezervare= rezervareBuilder.adaugaBauturi().adaugaMancare().build();
////        rezervare.setAreScaunErgonomic(true);
//        Rezervare rezervare1=rezervareBuilder.adaugaGenMuzical("manele").build();
//        System.out.println(rezervare);
//        System.out.println(rezervare1);
        AbstractBuilder abstractBuilder=new Rezervare.BuilderRezervare();
        Rezervare rezervare=abstractBuilder.adaugaBauturi().build();
        Rezervare rezervare1=abstractBuilder.adaugaMancare().build();
        System.out.println(rezervare);
        System.out.println(rezervare1);
        List<String>accesorii=new ArrayList<>();
        accesorii.add("fluier");
        accesorii.add("telefon");
        Client client=new Client("Dan",234,accesorii);
        AbstractPrototype client1=client.clone();
        ((Client)client1).setNume("Dragos");

        System.out.println(client);
        System.out.println(client1);





    }
}
