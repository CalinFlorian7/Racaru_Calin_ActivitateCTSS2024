package companie;

public class Manager {
    private String nume;
    private double salariu;
    private int nrSubordonati;
private static Manager instanta=new Manager("nume",1222.2,4);

    protected Manager(String nume, double salariu, int nrSubordonati) {
        this.nume = nume;
        this.salariu = salariu;
        this.nrSubordonati = nrSubordonati;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "nume='" + nume + '\'' +
                ", salariu=" + salariu +
                ", nrSubordonati=" + nrSubordonati +
                '}';
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public double getSalariu() {
        return salariu;
    }

    public void setSalariu(double salariu) {
        this.salariu = salariu;
    }

    public int getNrSubordonati() {
        return nrSubordonati;
    }

    public void setNrSubordonati(int nrSubordonati) {
        this.nrSubordonati = nrSubordonati;
    }
    public synchronized static Manager getInstance(String name,double salariu,int nrSubordonati){
       if(instanta==null)
       {
           instanta=new Manager(name,salariu,nrSubordonati);
       }
        return instanta;
    }
    public static Manager getInstance()
    {

            instanta=getInstance("Ion",232.3,4);

        return instanta;
    }
}
