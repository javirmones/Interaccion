package herramientas;

import java.util.ArrayList;
import java.util.LinkedList;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

import dominio.Proyecto;
import dominio.Tarea;
import persistencia.GestorProyectos;
import persistencia.GestorTareas;

public class ControlDatos {

	public static DefaultTreeModel generateProjectTreeModel() {

		ArrayList<Proyecto> p = GestorProyectos.getLista();

		DefaultMutableTreeNode dmtn = new DefaultMutableTreeNode("Proyectos");
		DefaultMutableTreeNode nodoAuxiliar = new DefaultMutableTreeNode("");
		DefaultMutableTreeNode nodoAuxiliar2 = new DefaultMutableTreeNode("");
		DefaultMutableTreeNode nodoAuxiliar3 = new DefaultMutableTreeNode("");

		for (Proyecto prj : p) {

			nodoAuxiliar = new DefaultMutableTreeNode(prj.getNombre());

			// ArrayList<Task> projectTasks = findTasksById_array(prj.getTasks());

			ArrayList<Tarea> tareasProyecto = GestorTareas.obtenerArrayList();
			for (Tarea tsk : tareasProyecto) {

				nodoAuxiliar2 = new DefaultMutableTreeNode(tsk.getNombre());

				ArrayList<Tarea> tareasSubTareas = GestorTareas.obtenerSubtareas();
				for (Tarea subtsk : tareasSubTareas) {

					nodoAuxiliar3 = new DefaultMutableTreeNode(subtsk.getNombre());
					nodoAuxiliar2.add(nodoAuxiliar3);

				}
				nodoAuxiliar.add(nodoAuxiliar2);

			}
			dmtn.add(nodoAuxiliar);

		}

		return new DefaultTreeModel(dmtn);
	}

}
