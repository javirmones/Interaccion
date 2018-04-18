package dominio;

import java.sql.ResultSet;
import java.util.ArrayList;

import persistencia.DAOProyecto;

public class ControlProyectos {
	
	private ArrayList<Proyecto> listaProyectos;
	private DAOProyecto daoProyecto;
	
	public ControlProyectos() {
		this.daoProyecto = new DAOProyecto();
	}
	
	public ArrayList<Proyecto> obtenerTodosProyectos() {
		listaProyectos = new ArrayList<Proyecto>();
		Proyecto project = new Proyecto();
		try {
			ResultSet resultSet = daoProyecto.obtenerProyectosDAO();
			while(resultSet.next()) {			
				project = obtenerProyecto(resultSet.getInt(1));
				listaProyectos.add(project);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return listaProyectos;
	}
	
	public Proyecto obtenerProyecto(int idProyecto) {
		Proyecto project = null;		
		try{
			ResultSet resultSet = daoProyecto.obtenerProyectoDAO(idProyecto);
			while (resultSet.next()) {
				project = new Proyecto(resultSet.getInt(1), resultSet.getString(2), resultSet.getDate(3),resultSet.getInt(4),
						resultSet.getString(5));
			}			
		}catch(Exception e) {
			System.out.println(e);
		}
		return project;
	}
	
	public boolean añadirProyecto(Proyecto project) {
		return daoProyecto.insertarProyectoDAO(project.getNombre(), project.getFechaCreacion(), 
				project.getResponsable(), project.getDesripcion());
	}
	
	public boolean eliminarProyecto(int idProject) {
		return daoProyecto.eliminarProyectoDAO(idProject);
	}
	
	public boolean actualizarProyecto(Proyecto project) {
		return daoProyecto.actualizarProyectoDAO(project.getIdProyecto(), project.getNombre(), project.getFechaCreacion(), 
		project.getResponsable(), project.getDesripcion());
	}
}
