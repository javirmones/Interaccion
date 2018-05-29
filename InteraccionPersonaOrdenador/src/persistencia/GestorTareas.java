package persistencia;

import java.util.ArrayList;

import javax.swing.DefaultListModel;

import dominio.Tarea;
import dominio.Usuario;

public class GestorTareas {
	public static ArrayList<Tarea> tareas = new ArrayList<>();
	public static DefaultListModel<Tarea> ta = new DefaultListModel<>();

	public GestorTareas() {
		// for (int i=0;i<2;i++) {

		// }

	}

	public static DefaultListModel<Tarea> getLista() {
		return ta;
	}

	public static ArrayList<Tarea> obtenerArrayList() {
		return tareas;
	}

	public static void Inicializacion() {
		ArrayList<Tarea> b = new ArrayList<>();
		Tarea st1 = new Tarea(2, "Consultar algo", "10/11/1940", "11/11/1940", 2, "Lenin", "-");
		b.add(st1);
		Tarea t1 = new Tarea(1, "Conquista", "10/11/1940", "11/11/1940", 1, "Stalin", "-", b);
		Tarea t2 = new Tarea(1, "Destruir muro", "10/11/1940", "11/11/1940", 1, "Stalin", "-");
		Tarea t3 = new Tarea(1, "Revolucion", "10/11/1940", "11/11/1940", 1, "Stalin", "-", b);
		tareas.add(t1);
		tareas.add(t2);
		tareas.add(t3);
		ta.addElement(t1);
		ta.addElement(t2);
		ta.addElement(t3);

	}

	public static void ActualizarList(Tarea u) {
		ta.addElement(u);
	}

}
