package dominio;

import java.util.Date;


public class Proyecto {
	
	private int idProyecto;
	private String nombre;
	private Date fechaCreacion;
	private int responsable;
	private String descripcion;
	
	public Proyecto() {
	}
	
	public Proyecto(int idProyecto, String nombre, Date fechaCreacion, int responsable, String descripcion) {
		this.idProyecto = idProyecto;
		this.nombre = nombre;
		this.fechaCreacion = fechaCreacion; 
		this.responsable = responsable;
		this.descripcion = descripcion;
	}
	
	public Proyecto(String nombre, Date fechaCreacion, int responsable, String descripcion) {		
		this.nombre = nombre;
		this.fechaCreacion = fechaCreacion; 
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
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCrecion) {
		this.fechaCreacion = fechaCrecion;
	}
	public int getResponsable() {
		return responsable;
	}
	public void setResponsable(int responsable) {
		this.responsable = responsable;
	}
	public String getDesripcion() {
		return descripcion;
	}
	public void setDesripcion(String desripcion) {
		this.descripcion = desripcion;
	}
	
	@Override
	public String toString() {
		return nombre;
	}
}
