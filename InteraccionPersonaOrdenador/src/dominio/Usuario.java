package dominio;

import java.util.Arrays;
import java.util.Date;
import javax.swing.ImageIcon;

public class Usuario {

	private int idUsuario;
	private String user;
	private String contrasenia;
	private String nombre;
	private String apellidos;
	private String email;
	private String dni;
	private Date ultimoAcceso;
	private Date fecha;
	private String telefono;
	private String rolPrincipal;
	private String[] conocimientos;
	private ImageIcon foto;

	public Usuario(int idUsuario, String user, String contrasenia, String nombre, String apellidos, String email,
			String dni, Date ultimoAcceso, Date fecha, String telefono, String rolPrincipal, String[] conocimientos,
			ImageIcon foto) {

		this.idUsuario = idUsuario;
		this.user = user;
		this.contrasenia = contrasenia;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.dni = dni;
		this.ultimoAcceso = ultimoAcceso;
		this.fecha = fecha;
		this.telefono = telefono;
		this.rolPrincipal = rolPrincipal;
		this.conocimientos = conocimientos;
		this.foto = foto;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Date getUltimoAcceso() {
		return ultimoAcceso;
	}

	public void setUltimoAcceso(Date ultimoAcceso) {
		this.ultimoAcceso = ultimoAcceso;
	}

	public ImageIcon getFoto() {
		return foto;
	}

	public void setFoto(ImageIcon foto) {
		this.foto = foto;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
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

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getRolPrincipal() {
		return rolPrincipal;
	}

	public void setRolPrincipal(String rolPrincipal) {
		this.rolPrincipal = rolPrincipal;
	}

	public String getDNI() {
		return dni;
	}

	public void setDNI(String dNI) {
		dni = dNI;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String[] getConocimientos() {
		return conocimientos;
	}

	public void setConocimientos(String[] conocimientos) {
		this.conocimientos = conocimientos;
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", user=" + user + ", contrasenia=" + contrasenia + ", nombre="
				+ nombre + ", apellidos=" + apellidos + ", email=" + email + ", dni=" + dni + ", ultimoAcceso="
				+ ultimoAcceso + ", fecha=" + fecha + ", telefono=" + telefono + ", rolPrincipal=" + rolPrincipal
				+ ", conocimientos=" + Arrays.toString(conocimientos) + ", foto=" + foto + "]";
	}

}
