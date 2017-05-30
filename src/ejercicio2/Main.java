package ejercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Ejercicio2 test = new Ejercicio2();
		
		List<Tarea> tareas = new ArrayList<Tarea>();
		
		test.listarTareas(tareas);
		
		
		Collections.sort(tareas, new Comparator<Tarea>(){

			public int compare(Tarea t1, Tarea t2) {
				return new Integer(t1.duracionTarea()).compareTo(new Integer(t2.duracionTarea()));
			}
			
		});
		System.out.println();
		
		
		test.listarTareas(tareas);

	}

}
