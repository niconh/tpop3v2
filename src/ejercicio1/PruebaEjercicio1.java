package ejercicio1;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class PruebaEjercicio1 {

	@Test
	public void testDistanciaIterativa() {
		List<Punto> puntos = listaPuntos1(); 
			
		SolucionEjercicio1 puntosMenorDist = new Ejercicio1().distanciaMinimaIterativa(puntos);
		System.out.println("testDistanciaIterativa: " + puntosMenorDist);
	}

	@Test
	public void testDistanciaIterativa2() {
		List<Punto> puntos = listaPuntos2(); 

		SolucionEjercicio1 puntosMenorDist = new Ejercicio1().distanciaMinimaIterativa(puntos);
		System.out.println("testDistanciaIterativa2: " + puntosMenorDist);
	}

	@Test
	public void testDistanciaMinimaDC1() {
		List<Punto> puntos = listaPuntos1(); 
			
		SolucionEjercicio1 puntosMenorDist = new Ejercicio1().distanciaMinimaDC(puntos);
		SolucionEjercicio1 puntosMenorDistIterativa = new Ejercicio1().distanciaMinimaIterativa(puntos);
		System.out.println("testDistanciaMinimaDC1 optimo : " + puntosMenorDist);
		System.out.println("testDistanciaMinimaDC1 f.bruta: " + puntosMenorDistIterativa);
		Assert.assertEquals("testDistanciaMinimaDC1 optimo y f.bruta no coinciden!", puntosMenorDist.getMinDistancia(), puntosMenorDistIterativa.getMinDistancia(), 0.00001d);
	}

	@Test
	public void testDistanciaMinimaDC2() {
		List<Punto> puntos = listaPuntos2(); 

		SolucionEjercicio1 puntosMenorDist = new Ejercicio1().distanciaMinimaDC(puntos);
		SolucionEjercicio1 puntosMenorDistIterativa = new Ejercicio1().distanciaMinimaIterativa(puntos);
		System.out.println("testDistanciaMinimaDC2 optimo : " + puntosMenorDist);
		System.out.println("testDistanciaMinimaDC2 f.bruta: " + puntosMenorDistIterativa);
		Assert.assertEquals("testDistanciaMinimaDC2 optimo y f.bruta no coinciden!", puntosMenorDist.getMinDistancia(), puntosMenorDistIterativa.getMinDistancia(), 0.00001d);
	}

	public static List<Punto> listaPuntos1(){
		List<Punto> puntos = new ArrayList<Punto>();
		
		Punto a = new Punto(10,3);
		Punto b = new Punto(50,4);
		Punto c = new Punto(10,16);
		Punto d = new Punto(-50,1);
		Punto e = new Punto(-20,4);
		Punto f = new Punto(20,4);
		Punto g = new Punto(50,1);
		Punto h = new Punto(-10,1);
		
		Punto aa = new Punto(20,-2);
		Punto bb = new Punto(40,-2);
		Punto cc = new Punto(30,3);
		Punto dd = new Punto(104,0);
		Punto ee = new Punto(0,0);
		Punto ff = new Punto(0,1);
		Punto gg = new Punto(20,-5);
		Punto hh = new Punto(-20,-5);
		
		Punto aaa = new Punto(0,20);
		Punto bbb = new Punto(50,10);
		Punto ccc = new Punto(4,0);
		Punto ddd = new Punto(-3,10);
		Punto eee = new Punto(-2,10);
		Punto fff = new Punto(-4,20);
		Punto ggg = new Punto(-1,40);
		Punto hhh = new Punto(-2,70);
		
		Punto aaaa = new Punto(256,-1);
		Punto bbbb = new Punto(-4,0);
		Punto cccc = new Punto(-2,3);
		Punto dddd = new Punto(-54,4);
		Punto eeee = new Punto(-24,5);
		Punto ffff = new Punto(-36,4);
		Punto gggg = new Punto(-39,-1);
		Punto hhhh = new Punto(-48,3);
	
		puntos.add(a);
		puntos.add(b);
		puntos.add(c);
		puntos.add(d);
		puntos.add(e);
		puntos.add(f);
		puntos.add(g);
		puntos.add(h);
		
		puntos.add(aa);
		puntos.add(bb);
		puntos.add(cc);
		puntos.add(dd);
		puntos.add(ee);
		puntos.add(ff);
		puntos.add(gg);
		puntos.add(hh);
		
		puntos.add(aaa);
		puntos.add(bbb);
		puntos.add(ccc);
		puntos.add(ddd);
		puntos.add(eee);
		puntos.add(fff);
		puntos.add(ggg);
		puntos.add(hhh);
		
		puntos.add(aaaa);
		puntos.add(bbbb);
		puntos.add(cccc);
		puntos.add(dddd);
		puntos.add(eeee);
		puntos.add(ffff);
		puntos.add(gggg);
		puntos.add(hhhh);
		
		return puntos;
	}

	public static <T> List<T> lista(T... puntos) {
		if (puntos == null)
			return new ArrayList<T>();
		List<T> res = new ArrayList<T>(puntos.length);
		for (T p: puntos) {
			res.add(p);
		}
		return res;
	}

	public static Punto punto(int x, int y) {
		return new Punto(x, y);
	}

	public static List<Punto> listaPuntos2() {
		return lista(
				punto(1,1),
				punto(2,3),
				punto(-3, 4),
				punto(5, 5),
				punto(8, 8),
				punto(-1, 9),
				punto(-2, 6),
				punto(0, -1),
				punto(1, 4),
				punto(-3, -5),
				punto(18, 14),
				punto(-3, -9),
				punto(12, -9),
				punto(-7, -7),
				punto(4, -4),
				punto(8, 1),
				punto(6, -3),
				punto(-5, 7),
				punto(-6, -2),
				punto(-10, -3),
				punto(2, 5),
				punto(-5,-9),
				punto(4, 9),
				punto(-8, -4),
				punto(19, -1),
				punto(-4, 9),
				punto(16, 15),
				punto(-6, -5),
				punto(-1, -5),
				punto(-10, -11),
				punto(31, -11),
				punto(-8, -6)
				);
	}
}
