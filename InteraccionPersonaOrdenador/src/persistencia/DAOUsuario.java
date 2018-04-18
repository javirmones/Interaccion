package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAOUsuario {
	
	private Connection con;
	private PreparedStatement pst;
	
	public DAOUsuario() {
		this.con = Agente.getConexion();
	}

	public ResultSet obtenerUsuariosDAO() {
		ResultSet rs = null;
		try {
			String sql = "select idUsuarios from usuarios";
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
		} catch (Exception e) {
			System.out.println("Error al obtener usuarios");
		}
		return rs;
	}
	
	public ResultSet obtenerUsuarioDAO(int idUser)throws Exception {
		ResultSet rs = null;
		try {			
			String sql = "select * from usuarios where idUsuarios = ?";
			pst = con.prepareStatement(sql);
			pst.setInt(1, idUser);
			rs = pst.executeQuery();
		} catch (Exception e) {
			System.out.println("Error al obtener usuario");
		}
		return rs;
	}
	
	public boolean insertarUsuarioDAO(int idUser, String nombre, String apellidos, String email, String contraseña, 
			int telf, String rolPrincipal, String conocimientos, String imagen) {
		boolean realizado;
		try {
			realizado = true;
			con = Agente.getConexion();
			con.createStatement();
			String sql = "insert into usuarios values(?,?,?,?,?,?,?,?,?)";
			pst = con.prepareStatement(sql);
			pst.setInt(1, idUser);
			pst.setString(2, nombre);
			pst.setString(3, apellidos);
			pst.setString(4, email);
			pst.setString(5, contraseña);
			pst.setInt(6, telf);
			pst.setString(7, rolPrincipal);
			pst.setString(8, conocimientos);
			pst.setString(9, imagen);
			pst.executeUpdate();
		} catch (Exception e) {
			System.out.println("Error al insertar usuario en la base de datos");
			realizado = false;
		}
		return realizado;
	}
	
	public boolean eliminarUsuarioDAO(int idUser) {
		boolean realizado;
		try {
			realizado = true;
			con = Agente.getConexion();
			con.createStatement();
			String sql = "delete from usuarios where idUsuarios = " + idUser;
			pst = con.prepareStatement(sql);
			pst.executeUpdate();
		} catch (Exception e) {
			System.out.println("Error al eliminar usuario en la base de datos");
			realizado = false;
		}
		return realizado;
	}
	
	public boolean actualizarUsuarioDAO(int idUser, String nombre, String apellidos, String email, String contraseña, 
			int telf, String rolPrincipal, String conocimientos) {
		boolean realizado;
		try {
			realizado = true;
			con = Agente.getConexion();
			con.createStatement();
			final String sql = "update usuarios set nombre = '" + nombre + "', apellidos = '" + apellidos + "', email = '" + email + 
					"', telefono = " + telf + ", rolPrincipal = '" + rolPrincipal + "', conocientos = '" + conocimientos + "' where idUsuarios = " + idUser;
			pst = con.prepareStatement(sql);
			pst.executeUpdate();
		} catch (Exception e) {
			System.out.println("Error al actualizar usuario en la base de datos"+e.getMessage());
			realizado = false;
		}
		return realizado;
	}	
}