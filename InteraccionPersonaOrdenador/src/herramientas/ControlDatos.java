package herramientas;

import java.util.ArrayList;
import java.util.LinkedList;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

import dominio.Proyecto;
import dominio.Tarea;
import persistencia.GestorProyectos;

public class ControlDatos {

	public static DefaultTreeModel generateProjectTreeModel(int idUser) {

		ArrayList<Proyecto> p = GestorProyectos.getLista();

		DefaultMutableTreeNode dmtn = new DefaultMutableTreeNode("Proyectos");
		DefaultMutableTreeNode nodoAuxiliar = new DefaultMutableTreeNode("");
		DefaultMutableTreeNode nodoAuxiliar2 = new DefaultMutableTreeNode("");
		DefaultMutableTreeNode nodoAuxiliar3 = new DefaultMutableTreeNode("");

		for (Proyecto prj : p) {

			if (idUser == -1) {

				nodoAuxiliar = new DefaultMutableTreeNode(prj.getNombre());

				// ArrayList<Task> projectTasks = findTasksById_array(prj.getTasks());

				ArrayList<Tarea> tareasProyecto = null;
				for (Tarea tsk : tareasProyecto) {

					if (tsk != null && (idUser == -1)) {

						nodoAuxiliar2 = new DefaultMutableTreeNode(tsk.getNombre());

						ArrayList<Tarea> tareasSubTareas = null;
						for (Tarea subtsk : tareasSubTareas) {

							if (subtsk != null && (idUser == -1)) {

								nodoAuxiliar3 = new DefaultMutableTreeNode(subtsk.getNombre());
								nodoAuxiliar2.add(nodoAuxiliar3);

							}

						}
						nodoAuxiliar.add(nodoAuxiliar2);
					}

				}
				dmtn.add(nodoAuxiliar);
			}

		}

		return new DefaultTreeModel(dmtn);
	}

}
