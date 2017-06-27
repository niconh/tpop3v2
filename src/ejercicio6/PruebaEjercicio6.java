package ejercicio6;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class PruebaEjercicio6 {

	@Test
	public void test() {
		
		List<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);
		numeros.add(6);
		numeros.add(7);
		numeros.add(8);
		
		Ejercicio6 test = new Ejercicio6();
		
		SolucionEjercicio6 solucion = test.ejercicio6(numeros);
		
		System.out.println("Cantidad de particiones que suman igual: " + solucion.getNumeroDeParticiones());
		System.out.println("Cantidad de instrucciones: " + solucion.getCantidadInstrucciones());
		
		Assert.assertEquals("Cantidad de particiones que suman igual: ", 216, solucion.getNumeroDeParticiones(), 1);
		Assert.assertEquals("Cantidad de instrucciones ejecutadas: ", 9841, solucion.getCantidadInstrucciones(), 1);
	}

}
