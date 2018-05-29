package dominio;

import java.util.ArrayList;

public class Proyecto {

	private int idProyecto;
	private String nombre;
	private String fechaCreacion;
	private String encargado;
	private String descripcion;
	private String estado;
	private ArrayList<Tarea> tareas;

	public Proyecto() {
	}

	public Proyecto(int idProyecto, String nombre, String fechaCreacion, String responsable, String estado,
			String descripcion, ArrayList<Tarea> t) {
		this.idProyecto = idProyecto;
		this.nombre = nombre;
		this.fechaCreacion = fechaCreacion;
		this.encargado = responsable;
		this.estado = estado;
		this.descripcion = descripcion;
		this.tareas = t;
	}
	public Proyecto( String nombre, String fechaCreacion, String responsable, String estado,
			String descripcion) {
		this.idProyecto=++idProyecto;
		this.idProyecto = idProyecto;
		this.nombre = nombre;
		this.fechaCreacion = fechaCreacion;
		this.encargado = responsable;
		this.estado = estado;
		this.descripcion = descripcion;
	}

	public ArrayList<Tarea> getTareas() {
		return tareas;
	}

	public void setTareas(ArrayList<Tarea> tareas) {
		this.tareas = tareas;
	}

	public String getEncargado() {
		return encargado;
	}

	public void setEncargado(String encargado) {
		this.encargado = encargado;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
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

	public String getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(String fechaCrecion) {
		this.fechaCreacion = fechaCrecion;
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
