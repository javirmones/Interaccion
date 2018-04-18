package dominio;

public class Usuario {
	
	private int idUser;
	private String nombre;
	private String apellidos;
	private String email;
	private String contraseña;
	private int telf;
	private String rolPrincipal;
	private String conocimientos;
	private String imagen;
	
	public Usuario() {
		
	}
	
	public Usuario(int idUser, String nombre, String apellidos, String email, String contraseña, int telefono, String imagen) {
		this.idUser = idUser;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.contraseña = contraseña;
		this.telf = telefono;
		this.rolPrincipal = "";
		this.conocimientos = "";
		this.imagen = imagen;
	}
	
	public Usuario(int idUser, String nombre, String apellidos, String email, String contraseña, int telefono,
			String rolPrincipal, String conocimientos, String imagen) {
		this.idUser = idUser;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.contraseña = contraseña;
		this.telf = telefono;
		this.rolPrincipal = rolPrincipal;
		this.conocimientos = conocimientos;
		this.imagen = imagen;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public int getTelf() {
		return telf;
	}

	public void setTelf(int telf) {
		this.telf = telf;
	}

	public String getRolPrincipal() {
		return rolPrincipal;
	}

	public void setRolPrincipal(String rolPrincipal) {
		this.rolPrincipal = rolPrincipal;
	}

	public String getConocimientos() {
		return conocimientos;
	}

	public void setConocimientos(String conocimientos) {
		this.conocimientos = conocimientos;
	}
	
	public String getImagen() {
		return this.imagen;
	}
	
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	
	@Override
	public String toString() {
		return nombre;
	}
	
}
