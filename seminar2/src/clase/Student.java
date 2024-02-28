package clase;

import java.util.Arrays;

public class Student extends Aplicant {
	protected String facultate;
	protected int anStudii;
	private static int finantare = 30;
	
	public String getFacultate() {
		return facultate;
	}
	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}
	public int getAnStudii() {
		return anStudii;
	}
	public void setAnStudii(int anStudii) {
		this.anStudii = anStudii;
	}


	public Student() {
		super();
		
	}
	
	public Student(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect, String facultate, int an_studii) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumireProiect);
		this.facultate = facultate;
		this.anStudii = an_studii;
	}
	@Override
	public String toString() {
		return "Student: Nume=" + nume + ", Prenume=" + prenume + ", Varsta=" + varsta + ", Punctaj=" + punctaj + ", Nr_proiecte=" + nrProiecte +  ", DenumireProiect=" + Arrays.toString(denumireProiect) + "Facultate=" + facultate + ", An_studii=" + anStudii;
	}


	public void afiseazaFinantare() {
		System.out.println("Studentul "+getNume()+" "+getPrenume()+" primeste"+finantare+" Euro/zi in proiect.");
	}

	public static void setFinantare(int finantare) {
		Student.finantare = finantare;
	}
}
