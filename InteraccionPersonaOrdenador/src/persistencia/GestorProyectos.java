package persistencia;

import java.util.ArrayList;

import dominio.Proyecto;

public class GestorProyectos {
	
	private static ArrayList<Proyecto> prt = new ArrayList<>();
	
	public GestorProyectos() {
		inicializar();
	}
	public void inicializar() {
		if(prt.isEmpty()) {
			Proyecto p1= new Proyecto(1,"Toma de Berlin", "16/04/1945", "Stalin","Finalizado", "Acabar con los nazis");
			Proyecto p2= new Proyecto(2,"Batalla de Stalingrado", "02/02/1943", "Stalin","En progreso", "Tomar Stalingrado");
			prt.add(p1);
			prt.add(p2);
			
		}
		
		
	}
	public ArrayList<Proyecto> actualizar(Proyecto p){
		prt.add(p);
		return prt;
	}
	public static ArrayList<Proyecto> getLista(){
		return prt;
	}
}
