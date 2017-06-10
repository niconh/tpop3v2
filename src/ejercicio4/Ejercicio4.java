package ejercicio4;

import java.util.*;

public class Ejercicio4 {
	
	
	private static int cantInstrucciones = 0;
	
	public int mochila(List<ElementoMochila> elementos, int capacidad) {
		
		int res = 0;
		if(capacidad < 0){
				res = Integer.MAX_VALUE;
				cantInstrucciones++;
		}
		else{
			if(capacidad > 0 && elementos.size() > 0){
				cantInstrucciones++;
				List<ElementoMochila> elementosMenos1 = new ArrayList<ElementoMochila>(elementos);
				elementosMenos1.remove(0);
				int ganancia1 = elementos.get(0).getGanancia() + mochila(elementosMenos1, capacidad - elementos.get(0).getPeso());
				int ganancia2 = mochila(elementosMenos1, capacidad);
				res = Math.max(ganancia1,ganancia2);	
			}
		}
				
		return res;
	}
	
	public SolucionEjercicio4 ejercicio4(List<ElementoMochila> elementos, int capacidad){
		
		int res = mochila(elementos,capacidad);
		return new SolucionEjercicio4(res,cantInstrucciones);
	}

	public static int getCantInstrucciones() {
		return cantInstrucciones;
	}

	
}
