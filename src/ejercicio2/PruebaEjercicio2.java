package ejercicio2;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class PruebaEjercicio2 {

	@Test
	public void test() {

		Ejercicio2 test = new Ejercicio2();
		
		List<Tarea> tareas = test.crearTareas();
		
		test.ordenarTareas(tareas);
		test.listarTareas(tareas);
		
		System.out.println();
		
		List<Tarea> tareasRealizadas = test.cantidadMaximaDeTareas(tareas);
		
		test.ordenarTareasPorInicio(tareasRealizadas);
		
		test.listarTareas(tareasRealizadas);
		
		
	}

}
