package ejercicio3;

import java.util.*;


public class Ejercicio3 {
	
	private static int cantInstrucciones = 0;
	
	public void ordenarAristasDeMenorAMayor(Grafo grafo){
		Collections.sort(grafo.getAristas(), new Comparator<Arista>(){ 
			public int compare(Arista a1, Arista a2) {
				cantInstrucciones++;
				return new Integer(a1.getPeso()).compareTo(new Integer(a2.getPeso()));
			}
		});
	}
	
	public Hashtable<String, Integer> unirParticiones(Hashtable<String, Integer> particiones, Arista a){
		
		int max = Math.max(particiones.get(a.getOrigen().getNombre()), particiones.get(a.getDestino().getNombre()));
		int min = Math.min(particiones.get(a.getOrigen().getNombre()), particiones.get(a.getDestino().getNombre()));
		
		for(String ver: particiones.keySet()){
			cantInstrucciones++;
			if(particiones.get(ver) == max){
				particiones.put(ver, min);
			}
		}
		
		return particiones;
	}
	
	public SolucionEjercicio3 Kruskal(Grafo grafo){
		
		
		ordenarAristasDeMenorAMayor(grafo);
	
		Grafo SP = new Grafo(new ArrayList<Vertice>(), new ArrayList<Arista>()); 
		
		SP.setVertices(grafo.getVertices()); 
		
		Hashtable<String, Integer> particiones = new Hashtable<String, Integer>();
		int nroParticion = 1;
		for(Vertice ver: grafo.getVertices()){
			particiones.put(ver.getNombre(), nroParticion);
			nroParticion++;			
			cantInstrucciones++;
		}
		
		for(Arista arista: grafo.getAristas()){
			if( particiones.get(arista.getOrigen().getNombre()) != particiones.get(arista.getDestino().getNombre()) ) {
				SP.agregarArista(arista); 
				particiones = unirParticiones(particiones,arista);
				cantInstrucciones++;
			}
		}
		
		int suma=0;
		for(Arista a: SP.getAristas()){
			suma = suma + a.getPeso();
		}
				
		return new SolucionEjercicio3(suma,cantInstrucciones,SP);
	}
		

		
		
}
	
	
	
	
	
	
	
	
	


