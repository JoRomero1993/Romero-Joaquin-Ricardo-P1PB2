package ar.unlam.edu.parcialpb1;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import ar.unlam.edu.parcialpb1.Biblioteca;
import ar.unlam.edu.parcialpb1.Estudiante;
import ar.unlam.edu.parcialpb1.Geografia;
import ar.unlam.edu.parcialpb1.Historia;
import ar.unlam.edu.parcialpb1.Libros;
import ar.unlam.edu.parcialpb1.Matematicas;

public class testBiblioteca {

	/*Se requiere implementar la totalidad de las clases que den soluci?n a 
	 * la situaci?n planteada 
y al menos 5 casos pruebas significativos.*/
	
@Test
public void losLibrosSePuedenCrear() {
	
	Historia historia1 = new Historia();
	Geografia geografia1 = new Geografia();
	Matematicas matematicas1 = new Matematicas();
	
	
	assertNotNull(historia1);
	assertNotNull(geografia1);
	assertNotNull(matematicas1);
	
}
public void losEstudiantesSePuedenCrear() {
	
	Estudiante estudiante1 = new Estudiante();
	
	assertNotNull(estudiante1);
}
public void sePuedeCrearLaBiblioteca() {
	
	Biblioteca bibliotecaNacional= new Biblioteca(null, null, null);
	assertNotNull(bibliotecaNacional);
	
}
public void sePuedeGuardarLibrosEnBiblioteca() {
	
	Biblioteca bibliotecaNacional= new Biblioteca(null, null, null);
	
	Historia historia1 = new Historia();
	Geografia geografia1 = new Geografia();
	Matematicas matematicas1 = new Matematicas();
	
		

	Boolean okLibro1 = bibliotecaNacional.agregarLibroDeHistoria(historia1);
	Boolean okLibro2 = 	bibliotecaNacional.agregarLibroDeGeografia(geografia1);
	Boolean okLibro3 = 	bibliotecaNacional.agregarLibroDeMatematicas(matematicas1);
	
	assertTrue(okLibro1);
	assertTrue(okLibro2);
	assertTrue(okLibro3);

}
	
	
	
}
