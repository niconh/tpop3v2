package ejercicio4;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class PruebaEjercicio4 {

	@Test
	public void test() {
		
		Ejercicio4 test = new Ejercicio4();
		
		List<ElementoMochila> elementos = new ArrayList<ElementoMochila>();
		
		elementos.add(new ElementoMochila(3,5));
		elementos.add(new ElementoMochila(3,7));
		elementos.add(new ElementoMochila(2,4));
		elementos.add(new ElementoMochila(3,6));
		elementos.add(new ElementoMochila(1,2));
		
		SolucionEjercicio4 solucion = test.ejercicio4(elementos, 8);
		
		System.out.println("Ganancia: " + solucion.getGanaciaMaxima());
		
		System.out.println("Cantidad de instrucciones: " + solucion.getCantidadInstrucciones());
		
		
	}

}
