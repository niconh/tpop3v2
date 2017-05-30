package ejercicio1;

public class SolucionEjercicio1 {

	private Punto a;
	private Punto b;
	private double minDistancia;
	private int cantInstrucciones;

	public SolucionEjercicio1(Punto a, Punto b, int cantInstrucciones) {
		this.a = a;
		this.b = b;
		this.setMinDistancia(a.calcularDistancia(b));
		this.cantInstrucciones = cantInstrucciones;
	}

	public SolucionEjercicio1(Punto a, Punto b) {
		this(a, b, 0);
	}

	public SolucionEjercicio1(int cantInstrucciones) {
		this.setMinDistancia(Double.MAX_VALUE);
		this.cantInstrucciones = cantInstrucciones;
	}
	
	public Punto getA() {
		return a;
	}

	public Punto getB() {
		return b;
	}

	public int getCantInstrucciones() {
		return cantInstrucciones;
	}

	public void setCantInstrucciones(int cantInstrucciones) {
		this.cantInstrucciones = cantInstrucciones;
	}

	public double getMinDistancia() {
		return minDistancia;
	}

	public void setMinDistancia(double minDistancia) {
		this.minDistancia = minDistancia;
	}


	@Override
	public String toString() {
		return getA() + " - " + getB() + " : " + getCantInstrucciones();
	}

}
