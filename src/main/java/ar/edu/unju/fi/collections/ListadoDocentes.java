package ar.edu.unju.fi.collections;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.fi.model.Carrera;
import ar.edu.unju.fi.model.Docente;

public class ListadoDocentes {

	public static List<Docente> docentes = new ArrayList<Docente>();
	
	public static List<Docente> listarDocentes(){
		
		return docentes;
	}
	
	public static Docente buscarDocentePorLegajo(String legajo) {
		
		for (Docente d : docentes) {
			if(d.getLegajo().equals(legajo)) {
				return d;
			}
		}
		return null;
	}
	
	public static void agregarDocente(Docente d) {
		d.setEstado(true);

		docentes.add(d);
	}
	
	// Método para modificar una carrera
	public static void modificarDocente(Docente docenteModificado) {
		docenteModificado.setEstado(true);
		for (int i = 0; i < docentes.size(); i++) {
			Docente docente = docentes.get(i);
			if (docente.getLegajo().equals(docenteModificado.getLegajo())) {
				docentes.set(i, docenteModificado);
				break;
			}
		}
	}
	
	// Metodo para eliminar una carrera
	public static void eliminarDocente(String legajo) {
		// borrado fisico
		// carreras.removeIf(carrera -> carrera.getCodigo().equals(codigo));

		// borrado logico
		for (int i = 0; i < docentes.size(); i++) {
			Docente docente = docentes.get(i);
			if (docente.getLegajo().equals(legajo)) {
				docente.setEstado(false);
				break;
			}
		}
	}
		  
		  
}
