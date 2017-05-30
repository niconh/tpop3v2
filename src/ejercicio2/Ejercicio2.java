package ejercicio2;

import java.util.*;


public class Ejercicio2 {
	
	public List<Tarea> crearTareas(){
	
		List<Tarea> tareas = new ArrayList<Tarea>();

		tareas.add(new Tarea(0,5));
		tareas.add(new Tarea(2,7));
		tareas.add(new Tarea(8,9));
		tareas.add(new Tarea(10,11));
		tareas.add(new Tarea(12,14));
		tareas.add(new Tarea(11,15));
		tareas.add(new Tarea(9,11));
		tareas.add(new Tarea(14,17));
		tareas.add(new Tarea(15,18));
		tareas.add(new Tarea(17,18));
		tareas.add(new Tarea(22,24));
		tareas.add(new Tarea(23,24));
		tareas.add(new Tarea(5,7));
		tareas.add(new Tarea(21,23));
		tareas.add(new Tarea(10,12));
		tareas.add(new Tarea(5,6));
		tareas.add(new Tarea(18,21));
		tareas.add(new Tarea(15,21));
		tareas.add(new Tarea(19,21));
		tareas.add(new Tarea(15,16));
		
		//tareas.add(new Tarea(10,19));
		//tareas.add(new Tarea(15,20));
		//tareas.add(new Tarea(15,17));
		
		return tareas;
	}
	
	public void ordenarTareas(List<Tarea> tareas){
		Collections.sort(tareas, new Comparator<Tarea>(){

			public int compare(Tarea t1, Tarea t2) {
				return new Integer(t1.duracionTarea()).compareTo(new Integer(t2.duracionTarea()));
			}
		});
	}
	
	public void ordenarTareasPorInicio(List<Tarea> tareas){
		Collections.sort(tareas, new Comparator<Tarea>(){

			public int compare(Tarea t1, Tarea t2) {
				return new Integer(t1.getInicio()).compareTo(new Integer(t2.getInicio()));
			}
		});
	}
	
	public void listarDuracionTareas(List<Tarea> tareas){
		
		int cant = 0;
		for(Tarea tarea: tareas){
			System.out.println(tarea.duracionTarea());
			cant++;
		}
		System.out.println(cant);
		
	}
	
	public void listarTareas(List<Tarea> tareas){
		int cant = 0;
		for(Tarea tarea: tareas){
			System.out.println(tarea.getInicio()+"-"+tarea.getFin());
			cant++;
		}
		System.out.println("Total tareas:"+cant);
	}
	
	public boolean VerificarNoSuperposicion(List<Tarea> tareasRealizadas, Tarea tareaPosible){
		boolean res = true; 
		
		for(Tarea tarea: tareasRealizadas){
			
			if(tarea.getInicio() < tareaPosible.getFin() && tarea.getFin() > tareaPosible.getInicio())
				res = false;
		}

		return res;
	}

	public List<Tarea> cantidadMaximaDeTareas(List<Tarea> tareas){
		
		ordenarTareas(tareas);
		
		int cantidadTareas = 0;
		
		List<Tarea> listaDeTareas = new ArrayList<Tarea>();
		
		for(Tarea tarea: tareas){
			if(VerificarNoSuperposicion(listaDeTareas,tarea)){
				listaDeTareas.add(tarea);
				cantidadTareas++;
			}
		}
		
		return listaDeTareas;
	}
	
}
