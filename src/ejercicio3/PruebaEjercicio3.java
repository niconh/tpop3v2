package ejercicio3;

import java.util.*;

import org.junit.Assert;
import org.junit.Test;

public class PruebaEjercicio3 {

	@Test
	public void test() {
		Ejercicio3 test = new Ejercicio3();
		
		Grafo grafo = new Grafo(new ArrayList<Vertice>(), new ArrayList<Arista>());
		
		grafo.agregarVertice(new Vertice("A"));
		grafo.agregarVertice(new Vertice("B"));
		grafo.agregarVertice(new Vertice("C"));
		grafo.agregarVertice(new Vertice("D"));
		grafo.agregarVertice(new Vertice("E"));
		grafo.agregarVertice(new Vertice("F"));
		grafo.agregarVertice(new Vertice("G"));
		grafo.agregarVertice(new Vertice("H"));
		
		grafo.agregarArista(new Arista(new Vertice("A"),new Vertice("C"),4));
		grafo.agregarArista(new Arista(new Vertice("A"),new Vertice("B"),4));
		grafo.agregarArista(new Arista(new Vertice("E"),new Vertice("F"),4));
		grafo.agregarArista(new Arista(new Vertice("E"),new Vertice("C"),8));
		grafo.agregarArista(new Arista(new Vertice("D"),new Vertice("H"),7));
		grafo.agregarArista(new Arista(new Vertice("C"),new Vertice("F"),1));
		grafo.agregarArista(new Arista(new Vertice("F"),new Vertice("G"),3));
		grafo.agregarArista(new Arista(new Vertice("C"),new Vertice("D"),5));
		grafo.agregarArista(new Arista(new Vertice("B"),new Vertice("C"),3));
		grafo.agregarArista(new Arista(new Vertice("B"),new Vertice("E"),7));
		grafo.agregarArista(new Arista(new Vertice("C"),new Vertice("H"),6));
		grafo.agregarArista(new Arista(new Vertice("A"),new Vertice("D"),3));
		grafo.agregarArista(new Arista(new Vertice("H"),new Vertice("G"),2));
		
		
		SolucionEjercicio3 solucion = test.Kruskal(grafo);
		
		Assert.assertEquals("Test suma de pesos de las aristas", 20, solucion.getSumatoriaAristasSP(), 0.1);
		Assert.assertEquals("Test cantidad de insutrcciones", 109, solucion.getCantidadInstrucciones(), 2);
		
		System.out.println("Suma de las aristas del Spanning Tree: "+solucion.getSumatoriaAristasSP());
		System.out.println("Cantidad de instrucciones ejecutadas: "+solucion.getCantidadInstrucciones());
		
		
		System.out.println();
		System.out.println("Grafo resultante:");
		for(Arista a: solucion.getGrafo().getAristas()){
			System.out.println(a.getOrigen().getNombre() + a.getPeso() + a.getDestino().getNombre());
		}

	}

}
