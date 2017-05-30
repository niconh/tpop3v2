package ejercicio2;

public class Tarea {
	
	private int inicio;
	private int fin;
	
	public Tarea(int inicio, int fin) {
		super();
		this.inicio = inicio;
		this.fin = fin;
	}
	
	public int duracionTarea(){
		return this.fin - this.inicio;
	}

	public int getInicio() {
		return inicio;
	}

	public void setInicio(int inicio) {
		this.inicio = inicio;
	}

	public int getFin() {
		return fin;
	}

	public void setFin(int fin) {
		this.fin = fin;
	}
	
	

}
