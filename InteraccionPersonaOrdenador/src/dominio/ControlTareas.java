package dominio;

import java.sql.ResultSet;
import java.util.ArrayList;

import persistencia.DAOProyecto;
import persistencia.DAOTarea;

public class ControlTareas {

	private ArrayList<Tarea> listaTareas;
	private DAOTarea daoTarea;
	
	public ControlTareas() {
		this.daoTarea = new DAOTarea();
	}
	
	public ArrayList<Tarea> obtenerTodosTareas() {
		listaTareas = new ArrayList<Tarea>();
		Tarea task = new Tarea();
		try {
			ResultSet resultSet = daoTarea.obtenerTareasDAO();
			while(resultSet.next()) {			
				task = obtenerTarea(resultSet.getInt(1));
				listaTareas.add(task);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return listaTareas;
	}
	
	public Tarea obtenerTarea(int idTarea) {
		Tarea task = null;		
		try{
			ResultSet resultSet = daoTarea.obtenerTareaDAO(idTarea);
			while (resultSet.next()) {
				task = new Tarea(resultSet.getInt(1), resultSet.getString(2), resultSet.getDate(3),resultSet.getDate(4),
						resultSet.getString(5),resultSet.getInt(7),resultSet.getString(8));
			}			
		}catch(Exception e) {
			System.out.println(e);
		}
		return task;
	}
	
	public boolean añadirTarea(Tarea task) {
		return daoTarea.insertarTareaDAO(task.getNombre(), task.getFechaIni(), task.getFechaFin(),
				task.getEstado(), task.getPrioridad(), task.getEncargado(), task.getComentarios());
	}
	
	public boolean eliminarTarea(int idTask) {
		return daoTarea.eliminarTareaDAO(idTask);
	}
	
	public boolean actualizarTarea(Tarea task) {
		return daoTarea.actualizarTareaDAO(task.getIdTarea(), task.getNombre(), task.getFechaIni(), task.getFechaFin(),
				task.getEstado(), task.getPrioridad(), task.getEncargado(), task.getComentarios());
	}
}
