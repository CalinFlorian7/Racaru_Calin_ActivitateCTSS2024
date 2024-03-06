package main;

import companie.Manager;

public class Main {

    public static void main(String[] args) {
        Manager manager1=Manager.getInstance();
        Manager manager2=Manager.getInstance("Mihai",33.3,4);
        System.out.println(manager1);
        System.out.println(manager2);

    }

}
