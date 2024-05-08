package state.program;

import state.clase.Reteta;

public class Program {
    public static void main(String[] args) {
        Reteta reteta=new Reteta(3,23.3f,1 );
        reteta.cereMedicamente();
        reteta.cumparaMedicamnt();
        reteta.cereMedicamente();
        reteta.respingeReteta();

    }
}
