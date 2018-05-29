package dominio;

public class Usuario {
	
	private static int idUser=0;
	private String nombre;
	private String apellidos;
	private String email;
	private String contraseña;
	private String direccion;
	private int telf;
	private String rolPrincipal;
	private String comentarios;
	private String imagen;
	
	public Usuario() {
		
	}
	
	public Usuario(String nombre, String apellidos, String email, String contraseña, int telefono, String imagen) {
		this.idUser = ++idUser;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.contraseña = contraseña;
		this.telf = telefono;
		this.rolPrincipal = "";
		this.comentarios = "";
		this.imagen = imagen;
	}
	
	public Usuario( String nombre, String apellidos, String email, String contraseña, int telefono,
			String rolPrincipal, String comentarios, String imagen) {
		this.idUser = ++idUser;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.contraseña = contraseña;
		this.telf = telefono;
		this.rolPrincipal = rolPrincipal;
		this.comentarios = comentarios;
		this.imagen = imagen;
	}
	
	
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
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
		return comentarios;
	}

	public void setConocimientos(String conocimientos) {
		this.comentarios = conocimientos;
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
