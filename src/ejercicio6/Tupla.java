package ejercicio6;

import java.util.*;

public class Tupla {
	
	private boolean haySolucion;
	private List<Integer> s1;
	private List<Integer> s2;

	public Tupla(boolean haySolucion, List<Integer> s1, List<Integer> s2) {
		super();
		this.haySolucion = haySolucion;
		this.s1 = s1;
		this.s2 = s2;
	}

	public boolean isHaySolucion() {
		return haySolucion;
	}

	public void setHaySolucion(boolean haySolucion) {
		this.haySolucion = haySolucion;
	}

	public List<Integer> getS1() {
		return s1;
	}

	public void setS1(List<Integer> s1) {
		this.s1 = s1;
	}

	public List<Integer> getS2() {
		return s2;
	}

	public void setS2(List<Integer> s2) {
		this.s2 = s2;
	}

	

}
