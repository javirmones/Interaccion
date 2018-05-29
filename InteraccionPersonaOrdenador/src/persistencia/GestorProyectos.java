package persistencia;

import java.util.ArrayList;

import javax.swing.DefaultListModel;

import dominio.Proyecto;
import dominio.Tarea;

public class GestorProyectos {

	private static ArrayList<Proyecto> prt = new ArrayList<>();
	private static DefaultListModel<Proyecto> dfp = new DefaultListModel<>();
	private GestorTareas g = new GestorTareas();

	public GestorProyectos() {
		inicializar();
	}

	public void inicializar() {
		ArrayList<Tarea> t1 = new ArrayList<Tarea>();
		ArrayList<Tarea> t2 = new ArrayList<Tarea>();
		if (prt.isEmpty()) {
			t1 = g.obtenerArrayList();
			// t2=g.obtenerArrayList();
			Proyecto p1 = new Proyecto(1, "Toma de Berlin", "16/04/1945", "Stalin", "Finalizado",
					"Acabar con los nazis", t1);
			Proyecto p2 = new Proyecto(2, "Batalla de Stalingrado", "02/02/1943", "Stalin", "En progreso",
					"Tomar Stalingrado", t2);
			prt.add(p1);
			prt.add(p2);
			dfp.addElement(p1);
			dfp.addElement(p2);

		}
	}

	public ArrayList<Proyecto> actualizar(Proyecto p) {
		prt.add(p);
		return prt;
	}
	public void act(Proyecto p){
		dfp.addElement(p);
	}

	public static ArrayList<Proyecto> getLista() {
		return prt;
	}

	public static DefaultListModel<Proyecto> etLista() {
		return dfp;
	}
}
