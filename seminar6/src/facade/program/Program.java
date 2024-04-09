package facade.program;

import facade.autobuz.Autobuz;
import facade.autobuz.FacadeAutobuz;

public class Program {
    public static void main(String[] args) {
        Autobuz autobuz=new Autobuz();
        System.out.println("Fara facade");
        autobuz.deschideUsaDinFata();
        autobuz.deschideUsaDinMijloc();
        autobuz.deschideUsaDinSpate();
        autobuz.punePeLiberUsaDinFata();
        autobuz.punePeLiberUsaDinMijloc();
        autobuz.punePeLiberUsaDinSpate();
        System.out.println("Cu facade");
        FacadeAutobuz facadeAutobuz=new FacadeAutobuz(autobuz);
        facadeAutobuz.deschideToateUsile();
        facadeAutobuz.elibereazaToateUsile();
    }
}
