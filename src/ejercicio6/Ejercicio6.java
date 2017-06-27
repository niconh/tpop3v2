package ejercicio6;

import java.util.*;

public class Ejercicio6 {
	
	private static int cantInstrucciones = 0;
	private static int numeroDePart = 0;
	
	public int sumatoria(List<Integer> numeros){
		int suma=0;
		for(Integer n: numeros){
			suma = suma + n;
		}
		return suma;
	}
		
	public SolucionEjercicio6 ejercicio6(List<Integer> numeros){
		
		List<Integer> s1 = new ArrayList<Integer>();
		List<Integer> s2 = new ArrayList<Integer>();
		
		particiones(numeros,s1,s2);
				
		return new SolucionEjercicio6(numeroDePart,cantInstrucciones);
	}
	
	public Tupla particiones(List<Integer> numeros, List<Integer> s1, List<Integer> s2){
		
		cantInstrucciones++;
		
		List<Integer> sec1 = new ArrayList<Integer>();
		List<Integer> sec2 = new ArrayList<Integer>();
		Tupla res = new Tupla(false,sec1,sec2);
		
		if(numeros.size() == 0){
			if(sumatoria(s1) == sumatoria(s2) && s1.size() != 0){
				numeroDePart++;
				res.setHaySolucion(true);
				res.setS1(s1);
				res.setS2(s2);
			}
		}
		else{
			
			List<Integer> numerosSin1 = new ArrayList<Integer>(numeros);
			numerosSin1.remove(0);		
			
			List<Integer> s1mas1 = new ArrayList<Integer>(s1);
			s1mas1.add(numeros.get(0));
			res = particiones(numerosSin1,s1mas1,s2);

			List<Integer> s2mas1 = new ArrayList<Integer>(s2);
			s2mas1.add(numeros.get(0));
			res = particiones(numerosSin1,s1,s2mas1);
			
			res = particiones(numerosSin1,s1,s2);

		}

		return res;
	}

	public static int getCantInstrucciones() {
		return cantInstrucciones;
	}


	public static int getNumeroDePart() {
		return numeroDePart;
	}
	
}
