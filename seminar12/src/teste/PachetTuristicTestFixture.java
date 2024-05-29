package teste;

import clase.IPersoana;
import clase.PachetTuristic;
import clase.Persoana;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import teste.dubluri.CuFake;
import teste.dubluri.FaraFake;

import static org.junit.Assert.*;

public class PachetTuristicTestFixture {
    private PachetTuristic pachetTuristic;

    @Before
    @Category(CuFake.class)

    public void setUp()throws Exception {
        IPersoana persoana=new PersoanaFake();
        ((PersoanaFake)persoana).setValoareVarsta(70);
        this.pachetTuristic=new PachetTuristic(persoana,"Bucuresti",90d);

    }
    @Test
    @Category(CuFake.class)

    public void TestaplicaDiscoutCuZero()
    {
        this.pachetTuristic.aplicaDiscountVarstnici(0);
        assertEquals(Double.valueOf(90d),pachetTuristic.getPret(),0.01);

    }
    @Test
    public void TestaplicaDiscoutCuSutaLaSuta()
    {
        this.pachetTuristic.aplicaDiscountVarstnici(100);
        assertEquals(Double.valueOf(0),pachetTuristic.getPret(),0.01);

    }
    @Test(expected = IllegalArgumentException.class)
    public void TestaplicaDiscoutCuMinus()
    {
        this.pachetTuristic.aplicaDiscountVarstnici(-10);


    }
    @Test(timeout =10 )
    public void testDiscountPerformanta()
    {
        this.pachetTuristic.aplicaDiscountVarstnici(100);

    }

}