package ar.unlam.edu.parcialpb1;

import java.util.ArrayList;



public class Biblioteca {
	private ArrayList<Historia> Historia = new ArrayList<Historia>(); 
	private ArrayList<Geografia> Geografia = new ArrayList<Geografia>();
	private ArrayList<Matematicas> Matematicas = new ArrayList<Matematicas>();
	
	public Biblioteca(ArrayList<ar.unlam.edu.parcialpb1.Historia> historia,
			ArrayList<ar.unlam.edu.parcialpb1.Geografia> geografia,
			ArrayList<ar.unlam.edu.parcialpb1.Matematicas> matematicas) {
		super();
		Historia = historia;
		Geografia = geografia;
		Matematicas = matematicas;
	}

	public ArrayList<Historia> getHistoria() {
		return Historia;
	}

	public void setHistoria(ArrayList<Historia> historia) {
		Historia = historia;
	}

	public ArrayList<Geografia> getGeografia() {
		return Geografia;
	}

	public void setGeografia(ArrayList<Geografia> geografia) {
		Geografia = geografia;
	}

	public ArrayList<Matematicas> getMatematicas() {
		return Matematicas;
	}

	public void setMatematicas(ArrayList<Matematicas> matematicas) {
		Matematicas = matematicas;
	}
	

	
	public void agregarLibroDeHistoria(Historia historia) {

		this.Historia.add(historia);

	}

	public void agregarLibroDeGeografia(Geografia geografia) {
		
		this.Geografia.add(geografia);
		
	}
	
public void agregarLibroDeMatematicas(Matematicas matematica) {
		
		this.Matematicas.add(matematica);
		
	}

	

}
