package ejercicio3;

public class SolucionEjercicio3 {
	
	private int sumatoriaAristasSP;
	private int cantidadInstrucciones;
	private Grafo grafo;
	
	public SolucionEjercicio3(int sumatoriaAristasSP, int cantidadInstrucciones, Grafo grafo) {
		this.sumatoriaAristasSP = sumatoriaAristasSP;
		this.cantidadInstrucciones = cantidadInstrucciones;
		this.grafo = grafo;
	}

	public int getSumatoriaAristasSP() {
		return sumatoriaAristasSP;
	}

	public int getCantidadInstrucciones() {
		return cantidadInstrucciones;
	}

	public Grafo getGrafo() {
		return grafo;
	}

}
