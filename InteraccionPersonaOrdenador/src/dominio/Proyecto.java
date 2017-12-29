package dominio;

public class Proyecto {

	private int idProyecto;
	private String nombre;
	private String fechaCrecion;
	private int responsable;
	private String descripcion;

	public Proyecto(int idProyecto, String nombre, String fechaCrecion, int responsable, String descripcion) {

		this.idProyecto = idProyecto;
		this.nombre = nombre;
		this.fechaCrecion = fechaCrecion;
		this.responsable = responsable;
		this.descripcion = descripcion;
	}

	public int getIdProyecto() {
		return idProyecto;
	}

	public void setIdProyecto(int idProyecto) {
		this.idProyecto = idProyecto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaCrecion() {
		return fechaCrecion;
	}

	public void setFechaCrecion(String fechaCrecion) {
		this.fechaCrecion = fechaCrecion;
	}

	public int getResponsable() {
		return responsable;
	}

	public void setResponsable(int responsable) {
		this.responsable = responsable;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Proyecto [idProyecto=" + idProyecto + ", nombre=" + nombre + ", fechaCrecion=" + fechaCrecion
				+ ", responsable=" + responsable + ", descripcion=" + descripcion + "]";
	}

}
