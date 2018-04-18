package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

public class DAOProyecto {
	
	private Connection con;
	private PreparedStatement pst;
	
	public DAOProyecto() {
		con = Agente.getConexion();
	}
	
	public ResultSet obtenerProyectosDAO() {
		ResultSet rs = null;
		try {
			String sql = "select idProyecto from proyectos";
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();

		} catch (Exception e) {
			System.out.println("Error al obtener proyectos");
		}
		return rs;
	}
	
	public ResultSet obtenerProyectoDAO(int idProyecto)throws Exception {
		ResultSet rs = null;
		try {			
			String sql = "select * from proyectos where idProyecto = ?";
			pst = con.prepareStatement(sql);
			pst.setInt(1, idProyecto);
			rs = pst.executeQuery();
		} catch (Exception e) {
			System.out.println("Error al obtener proyecto");
		}
		return rs;
	}
	
	public boolean insertarProyectoDAO(String nombre, Date fechaCreacion, int responsable, String descripcion) {
		boolean realizado;
		int idProyecto = idAutogenerado();
		try {
			realizado = true;			
			con.createStatement();
			String sql = "insert into proyectos values(?,?,?,?,?)";			
			pst = con.prepareStatement(sql);
			pst.setInt(1, idProyecto);
			pst.setString(2, nombre);
			pst.setObject(3, fechaCreacion);
			pst.setInt(4, responsable);
			pst.setString(5, descripcion);			
			pst.executeUpdate();
		} catch (Exception e) {
			System.out.println("Error al insertar proyecto en la base de datos.");
			realizado = false;
		}
		return realizado;
	}
	
	public boolean eliminarProyectoDAO(int idProject) {
		boolean realizado;
		try {
			realizado = true;			
			con.createStatement();
			String sql = "delete from proyectos where idProyecto = " + idProject;
			pst = con.prepareStatement(sql);
			pst.executeUpdate();
		} catch (Exception e) {
			System.out.println("Error al eliminar proyecto en la base de datos");
			realizado = false;
		}
		return realizado;
	}
	
	public boolean actualizarProyectoDAO(int idProject, String nombre, Date fechaCreacion, int responsable, String descripcion) {
		boolean realizado;
		try {
			realizado = true;			
			con.createStatement();
			final String sql = "update usuarios set nombre = '" + nombre + "', fechaCreacion = " + fechaCreacion + 
					", responsable = " + responsable + ", descripcion = '" + descripcion + "' where idProyecto = " + idProject;
			pst = con.prepareStatement(sql);
			pst.executeUpdate();
		} catch (Exception e) {
			System.out.println("Error al actualizar proyecto en la base de datos");
			realizado = false;
		}
		return realizado;
	}
	
	public int idAutogenerado() {
		ResultSet rs = null;
		int id = 0;
		try {			
			String sql = "select MAX(idProyecto) from proyectos";
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