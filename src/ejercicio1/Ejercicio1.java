package ejercicio1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ejercicio1 {

	private int cantInstrucciones;
	
	public Ejercicio1() {
	}

	public int getCantInstrucciones() {
		return cantInstrucciones;
	}

	public SolucionEjercicio1 distanciaMinimaIterativa(List<Punto> points) {
		
		double dmin = Double.MAX_VALUE; this.cantInstrucciones++;
		SolucionEjercicio1 puntosMenorDist = new SolucionEjercicio1(this.cantInstrucciones);
			
		for(int i = 0; i < points.size();i++){
			for(int j = i+1; j < points.size();j++){
				double dist = points.get(i).calcularDistancia(points.get(j)); this.cantInstrucciones++;
				
				if (dist < dmin){
					dmin = dist; this.cantInstrucciones++;					
					puntosMenorDist = new SolucionEjercicio1(points.get(i), points.get(j)); this.cantInstrucciones++;					
				}
			}
		}
	
		puntosMenorDist.setCantInstrucciones(cantInstrucciones);
		return puntosMenorDist;
	}
	

	public SolucionEjercicio1 distanciaMinimaDC(List<Punto> points) {
		List<Punto> puntosOrdenados = mergeSort(points);
		return distanciaMinimaDCRecursivo(puntosOrdenados);
	}

	private SolucionEjercicio1 distanciaMinimaDCRecursivo(List<Punto> puntosOrdenados) {
		if (puntosOrdenados.size() < 2) {
			// solución sin puntos, y distancia mínima "infinita"
			return new SolucionEjercicio1(this.cantInstrucciones);
		}
		else if (puntosOrdenados.size() == 2) {
			// caso base
			return new SolucionEjercicio1(puntosOrdenados.get(0), puntosOrdenados.get(1), this.cantInstrucciones);
		}

		List<Punto> puntosIzq = new ArrayList<Punto>(puntosOrdenados.subList(0, puntosOrdenados.size()/2)); this.cantInstrucciones++;
		List<Punto> puntosDer = new ArrayList<Punto>(puntosOrdenados.subList(puntosOrdenados.size()/2, puntosOrdenados.size())); this.cantInstrucciones++;

		// coordenada X que establece la division entre ambos conjuntos de puntos
		double coordXDivision = ( puntosIzq.get(puntosIzq.size()-1).getX() +  puntosDer.get(0).getX() ) / 2.0; this.cantInstrucciones++;

		SolucionEjercicio1 solIzq = distanciaMinimaDCRecursivo(puntosIzq);
		SolucionEjercicio1 solDer = distanciaMinimaDCRecursivo(puntosDer);

		SolucionEjercicio1 puntosMenor;
		this.cantInstrucciones++;

		if (solIzq.getMinDistancia() < solDer.getMinDistancia()) {
			puntosMenor = solIzq;
		}
		else {
			puntosMenor = solDer;
		}
		double minDistanciaIzqDer = Math.min(solIzq.getMinDistancia(), solDer.getMinDistancia()); this.cantInstrucciones++;
		double minDistancia = minDistanciaIzqDer;
		// calcular distancia mínima entre puntos de la izquierda con X en [coordXDivision - minDistancia, coordXDivision]
		// y puntos de la derecha con X en [coordXDivision, coordXDivision+minDistancia]

		// "turns out this step can be accomplished in linear time" - probarlo
		// https://en.wikipedia.org/wiki/Closest_pair_of_points_problem
		for (int i = puntosIzq.size() - 1; i >= 0 && puntosIzq.get(i).getX() >= coordXDivision - minDistancia; i-- ) {
			for (int j = 0; j < puntosDer.size() && puntosDer.get(i).getX() <= coordXDivision + minDistancia; j++ ) {
				this.cantInstrucciones++;
				if (puntosIzq.get(i).calcularDistancia(puntosDer.get(j)) < minDistancia) {
					puntosMenor = new SolucionEjercicio1(puntosIzq.get(i), puntosDer.get(j));
				}
			}
		}
		puntosMenor.setCantInstrucciones(cantInstrucciones);
		return puntosMenor;
	}
	
	

	public List<Punto> mergeSort(List<Punto> puntos){
		
		List<Punto>	Sres = new ArrayList<Punto>();
		
		List<Punto>	S1 = new ArrayList<Punto>();
		List<Punto>	S2 = new ArrayList<Punto>();
		
		this.cantInstrucciones++;
		if(puntos.size() == 1){
			Sres.add(puntos.get(0));
		}
		else{			
			S1 = puntos.subList(0, puntos.size()/2);
			S2 = puntos.subList((puntos.size()/2), puntos.size());
		
			S1 = mergeSort(S1); this.cantInstrucciones++;
			S2 = mergeSort(S2); this.cantInstrucciones++;
			Sres = merge(S1,S2); this.cantInstrucciones++;
		}
		
		return Sres;
	}
	
	
	public List<Punto> merge(List<Punto> puntosIzq, List<Punto> puntosDer){
		
		List<Punto> puntosOrd = new ArrayList<Punto>();
		Comparator<Punto> porXluegoPorY = new Comparator<Punto>() {
			@Override
			public int compare(Punto p1, Punto p2) {
				int res = p1.getX() - p2.getX();
				if (res == 0) {
					res = p1.getY() - p2.getY();
				}
				return res;
			}
		};
		int i=0;
		int j=0;
		while(i < puntosIzq.size() && j < puntosDer.size()){
			if (porXluegoPorY.compare(puntosIzq.get(i),  puntosDer.get(j)) < 0) {
				puntosOrd.add(puntosIzq.get(i));
				i++;
				this.cantInstrucciones++;
			}
			else{
				puntosOrd.add(puntosDer.get(j));
				j++;
				this.cantInstrucciones++;
			}
		}
		
		if(i < puntosIzq.size()) {
			for(int k = i; k < puntosIzq.size(); k++) {
				puntosOrd.add(puntosIzq.get(k));
				this.cantInstrucciones++;
			}
		}
		if (j < puntosDer.size()) {
			for(int k = j; k < puntosDer.size(); k++) {
				puntosOrd.add(puntosDer.get(k));
				this.cantInstrucciones++;
			}
		}

		return puntosOrd;
	}
	

}
