package ejercicio4;

import java.util.*;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Ejercicio4 test = new Ejercicio4();
		
		List<ElementoMochila> elementos = new ArrayList<ElementoMochila>();
		
		elementos.add(new ElementoMochila(3,5));
		elementos.add(new ElementoMochila(2,4));
		
		int res = test.ejercicio4(elementos, 5);
		
		System.out.println(res);
		
		
		
	}

}
