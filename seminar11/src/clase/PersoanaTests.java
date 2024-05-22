package clase;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersoanaTests {

    @org.junit.Test
    public void getSexReturnM() {
        Persoana persoana=new Persoana("Mihai","102111031131");
        assertEquals("M",persoana.getSex());
    }
    @org.junit.Test
    public void getSexReturnF() {
        Persoana persoana=new Persoana("Maria","202111031131");
        assertEquals("F",persoana.getSex());
    }
    @org.junit.Test
    public void testSuperiorBoundry()
    {
        Persoana persoana=new Persoana("Mihai","102111031131");
        assertEquals("M",persoana.getSex());
    }
    @org.junit.Test
    public void getSexCrossCheck()
    {
        Persoana persoana=new Persoana("Mihai","102111031131");
        assertEquals(persoana.CNP.charAt(0)%2==0?"F":"M",persoana.getSex());
    }
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void getSexErrorCondition()
    {
        Persoana persoana=new Persoana("Mihai","c02111031131");
        String rez=persoana.getSex();
    }
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void getSexEmptyString()
    {
        Persoana persoana=new Persoana("Mihai","");
        persoana.getSex();
    }
    @org.junit.Test(timeout = 1)
    public void getPerformance()
    {
        Persoana persoana=new Persoana("Mihai","102121");
    persoana.getSex();
    }
    @org.junit.Test
    public void getConformance()
    {
        Persoana persoana=new Persoana("Mihai","102121");
        assertTrue(persoana.getSex().equals("F")||persoana.getSex().equals("M"));
    }
    @org.junit.Test
    public void getSexOrder()
    {
        Persoana persoanaM=new Persoana("Mihai","102121");
        Persoana persoanaF=new Persoana("Mihai","202121");
        assertTrue(persoanaM.getSex().compareTo(persoanaF.getSex())>0);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void valideazaNullCnp()
    {
        Persoana persoanaM=new Persoana("Mihai",null);
        persoanaM.getSex();


    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void ValideazaSex0()
    {
        Persoana persoanaM=new Persoana("Mihai",null);
        persoanaM.getSex();
    }


}