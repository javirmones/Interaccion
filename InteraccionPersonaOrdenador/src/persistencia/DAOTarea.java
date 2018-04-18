package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

public class DAOTarea {
	
	private Connection con;
	private PreparedStatement pst;
	
	public DAOTarea() {
		con = Agente.getConexion();
	}
	
	public ResultSet obtenerTareasDAO() {
		ResultSet rs = null;
		try {
			String sql = "select idTareas from tareas";
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();

		} catch (Exception e) {
			System.out.println("Error al obtener tareas");
		}
		return rs;
	}
	
	public ResultSet obtenerTareaDAO(int idProyecto)throws Exception {
		ResultSet rs = null;
		try {			
			String sql = "select * from tareas where idTareas = ?";
			pst = con.prepareStatement(sql);
			pst.setInt(1, idProyecto);
			rs = pst.executeQuery();
		} catch (Exception e) {
			System.out.println("Error al obtener tarea");
		}
		return rs;
	}
	
	public boolean insertarTareaDAO(String nombre, Date fechaInicio, Date fechaFin, String estado, 
			int prioridad, int encargado, String comentarios) {
		boolean realizado;
		int idTarea = idAutogenerado();
		try {
			realizado = true;			
			con.createStatement();
			String sql = "insert into tareas values(?,?,?,?,?,?,?,?)";			
			pst = con.prepareStatement(sql);
			pst.setInt(1, idTarea);
			pst.setString(2, nombre);
			pst.setObject(3, fechaInicio);
			pst.setObject(4, fechaFin);
			pst.setString(5, estado);
			pst.setInt(6, prioridad);
			pst.setInt(7, encargado);
			pst.setString(8, comentarios);
			pst.executeUpdate();
		} catch (Exception e) {
			System.out.println("Error al insertar proyecto en la base de datos.");
			realizado = false;
		}
		return realizado;
	}
	
	public boolean eliminarTareaDAO(int idTask) {
		boolean realizado;
		try {
			realizado = true;			
			con.createStatement();
			String sql = "delete from tareas where idTareas = " + idTask;
			pst = con.prepareStatement(sql);
			pst.executeUpdate();
		} catch (Exception e) {
			System.out.println("Error al eliminar tarea en la base de datos");
			realizado = false;
		}
		return realizado;
	}
	
	public boolean actualizarTareaDAO(int idTarea, String nombre, Date fechaInicio, Date fechaFin, String estado, 
			int prioridad, int encargado, String comentarios) {
		boolean realizado;
		try {
			realizado = true;			
			con.createStatement();
			final String sql = "update usuarios set nombre = '" + nombre + "', fechaIni = " + fechaInicio + 
					", fechaFin = " + fechaFin + ", estado = '" + estado + "', prioridad = " + prioridad + 
					", encargado = '" + encargado + "', comentarios = '" + comentarios + "' where idTareas = " + idTarea;
			pst = con.prepareStatement(sql);
			pst.executeUpdate();
		} catch (Exception e) {
			System.out.println("Error al actualizar proyecto en la base de datos");
			realizado = false;
		}
		return realizado;
	}

	//Saca el id proximo que se puede insertar
	public int idAutogenerado() {
		ResultSet rs = null;
		int id = 0;
		try {			
			String sql = "select MAX(idTareas) from tareas";
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			if (rs.next()) {
				id = rs.getInt(1);
			}
		} catch (Exception e) {
			System.out.println("Error al obtener proyecto");
		}
		return id+1;
	}
}