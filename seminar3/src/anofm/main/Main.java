package anofm.main;

import anofm.ManagerRegistry;
import companie.Manager;

public class Main {
    public static void main(String[] args) {
        ManagerRegistry registry=ManagerRegistry.getInstance();
        registry.inregistreazaManager("CTS SRL","Popescu",1000);
        registry.inregistreazaManager("CTS SRL","Ionescu",1000);
        System.out.println(registry.getManager("CTS SRL"));



    }
}
