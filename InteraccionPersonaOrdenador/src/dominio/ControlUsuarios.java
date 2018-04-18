package dominio;

import java.sql.ResultSet;
import java.util.ArrayList;

import persistencia.DAOUsuario;

public class ControlUsuarios {
	
	private ArrayList<Usuario> listaUsuarios;
	private DAOUsuario daoUsuario;
	
	public ControlUsuarios() {
		this.daoUsuario = new DAOUsuario();
	}

	public ArrayList<Usuario> obtenerTodosUsuarios() {
		listaUsuarios = new ArrayList<Usuario>();
		Usuario user = new Usuario();
		try {
			ResultSet resultSet = daoUsuario.obtenerUsuariosDAO();
			while(resultSet.next()) {			
				user = obtenerUsuario(resultSet.getInt(1));
				listaUsuarios.add(user);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return listaUsuarios;
	}
	
	public Usuario obtenerUsuario(int idUser) {
		Usuario user = null;		
		try{
			ResultSet resultSet = daoUsuario.obtenerUsuarioDAO(idUser);
			while (resultSet.next()) {
				user = new Usuario(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3),resultSet.getString(4),
						resultSet.getString(5),resultSet.getInt(6),resultSet.getString(7), resultSet.getString(8),
						resultSet.getString(9));
			}			
		}catch(Exception e) {
			System.out.println(e);
		}
		return user;
	}
	
	public boolean añadirUsuario(Usuario user) {		
		return daoUsuario.insertarUsuarioDAO(user.getIdUser(), user.getNombre(), user.getApellidos(), user.getEmail(), 
				user.getContraseña(), user.getTelf(), user.getRolPrincipal(), user.getConocimientos(), user.getImagen());
	}
	
	public boolean eliminnarUsuario(int idUser) {
		return daoUsuario.eliminarUsuarioDAO(idUser);
	}
	
	public boolean actualizarUsuario(Usuario user) {
		daoUsuario = new DAOUsuario();
		return daoUsuario.actualizarUsuarioDAO(user.getIdUser(), user.getNombre(), user.getApellidos(), user.getEmail(), 
				user.getContraseña(), user.getTelf(), user.getRolPrincipal(), user.getConocimientos());
	}

	//Metodos comprobar autentificacion
	public boolean comprobarIdentificacion(int idUsuario) {
		boolean comprobar = false;
		ArrayList<Usuario> lista = obtenerTodosUsuarios();
		for(int i = 0 ; i < lista.size() ; i++) {
			if(lista.get(i).getIdUser() == idUsuario) {
				comprobar = true;
			}
		}
		return comprobar;
	}
	
	public boolean comprobarPass(int idUsuario, String pass) {
		Usuario user = obtenerUsuario(idUsuario);
		return user.getContraseña().equals(pass);
	}
}
