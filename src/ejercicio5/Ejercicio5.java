package ejercicio5;

import java.util.*;

public class Ejercicio5 {
	
	private static int cantInstrucciones = 0;
	
	public int mochila(List<ElementoMochila> elementos, int capacidad){
		
		
		
		int [][] matriz = new int[elementos.size()+1][capacidad+1];
		
		for(int elem=0; elem <= elementos.size(); elem++){
			matriz[elem][0] = 0; 
			cantInstrucciones++;
		}
		
		for(int cap=0; cap <= capacidad; cap++){
			matriz[0][cap] = 0;
			cantInstrucciones++;
		}  
		
		for(int elem=1; elem <= elementos.size(); elem++){
						
			for(int cap=1; cap <= capacidad; cap++){
				
				cantInstrucciones++;
				
				if((cap - elementos.get(elem-1).getPeso()) >= 0){
					int ganancia1 = elementos.get(elem-1).getGanancia() + matriz[elem-1][cap - elementos.get(elem-1).getPeso()];
					int ganancia2 = matriz[elem-1][cap];
					matriz[elem][cap] = Math.max(ganancia1,ganancia2);                                               
				}
				else{
					matriz[elem][cap] = matriz[elem-1][cap];
				}
			}
		}
		
//		for (int i = 0; i <= elementos.size(); i++) {
//		    for (int j = 0; j <= capacidad; j++) {
//		        System.out.print(matriz[i][j] + "  ");
//		    }
//		    System.out.println();
//		}
		
//		System.out.println(matriz[elementos.size()][capacidad]);
		
		return matriz[elementos.size()][capacidad];
	}
	
	public SolucionEjercicio5 ejercicio5(List<ElementoMochila> elementos, int capacidad){
		
		int res = mochila(elementos,capacidad);
		return new SolucionEjercicio5(res,cantInstrucciones);
	}

	public static int getCantInstrucciones() {
		return cantInstrucciones;
	}
	
}
