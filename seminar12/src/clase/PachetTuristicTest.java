package clase;

import org.junit.Test;
import teste.PersoanaFake;

import static org.junit.Assert.*;

public class PachetTuristicTest {

    @Test
    public void verificaDiscount() {
        IPersoana persoana=new Persoana("Maria","124565898");
        PachetTuristic pachetTuristic=new PachetTuristic(persoana,"Italia",100.0);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(90,pachetTuristic.getPret(),0.01);
    }
    @Test
    public void testBoundaryDiscount()
    {
        IPersoana persoana=new Persoana("Maria","149035898");
        PachetTuristic pachetTuristic=new PachetTuristic(persoana,"Italia",100.0);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(90,pachetTuristic.getPret(),0.01);
    }
    @Test
    public void testDiscountPersoanaFake()
    {
        PersoanaFake persoana=new PersoanaFake();
        persoana.setValoareVarsta(65);
        PachetTuristic pachetTuristic=new PachetTuristic(persoana,"Italia",1000.0);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(900,pachetTuristic.getPret(),0.01);
    }
    @Test
    public void testDiscountPersoanaFakeVarta()
    {
        PersoanaFake persoana=new PersoanaFake();
        persoana.setValoareVarsta(21);
        PachetTuristic pachetTuristic=new PachetTuristic(persoana,"Italia",1000.0);
        pachetTuristic.aplicaDiscountVarstnici(100);
        assertEquals(1000.0,pachetTuristic.getPret(),0.01);
    }





}