package ejercicio5;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class PruebaEjercicio5 {

	@Test
	public void test() {
		
		Ejercicio5 test = new Ejercicio5();
		
		List<ElementoMochila> elementos = new ArrayList<ElementoMochila>();
		
		elementos.add(new ElementoMochila(1,2));
		elementos.add(new ElementoMochila(2,3));
		elementos.add(new ElementoMochila(2,4));
		elementos.add(new ElementoMochila(3,6));
		elementos.add(new ElementoMochila(3,5));
		elementos.add(new ElementoMochila(3,4));
		elementos.add(new ElementoMochila(2,6));
		
		SolucionEjercicio5 solucion = test.ejercicio5(elementos, 7);
		
		System.out.println("Ganancia: " + solucion.getGanaciaMaxima());
		System.out.println("Cantidad de instrucciones: " + solucion.getCantidadInstrucciones());
		
		Assert.assertEquals("Ganacia maxima de la mochila actual: ", 16, solucion.getGanaciaMaxima(), 1);
		Assert.assertEquals("Cantidad de instrucciones ejecutadas: ", 63, solucion.getCantidadInstrucciones(), 2);
	}

}
