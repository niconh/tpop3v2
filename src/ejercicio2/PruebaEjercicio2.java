package ejercicio2;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class PruebaEjercicio2 {

	@Test
	public void test() {

		Ejercicio2 test = new Ejercicio2();
		
		List<Tarea> tareas = test.crearTareas();
		
		SolucionEjercicio2 cantidadMaximaDeTareas = test.cantidadMaximaDeTareas(tareas);
		
		Assert.assertEquals("Test cantidad de tareas", cantidadMaximaDeTareas.getCantidadTareas(), 10, 0.1);
		Assert.assertEquals("Test cantidad de insutrcciones", cantidadMaximaDeTareas.getCantidadInstrucciones(), 111, 10);
		
		System.out.println("Cantidad de tareas a realizar: "+cantidadMaximaDeTareas.getCantidadTareas());
		System.out.println("Cantidad de instrucciones ejecutadas: "+cantidadMaximaDeTareas.getCantidadInstrucciones());
		
		System.out.println();
		System.out.println("Lista de tareas a procesar:");
		test.ordenarTareasPorInicio(tareas);
		test.listarTareas(tareas);
		
		System.out.println();
		System.out.println("Lista de tareas a realizar:");
		List<Tarea> tareasRealizadas = test.listaMaximaDeTareas(tareas);
		test.ordenarTareasPorInicio(tareasRealizadas);
		test.listarTareas(tareasRealizadas);
		
		
	}

}
