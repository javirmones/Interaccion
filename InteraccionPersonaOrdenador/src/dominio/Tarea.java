package dominio;

import java.util.ArrayList;

public class Tarea {

	private int idTarea;
	private String nombre;
	private String fechaIni;
	private String fechaFin;
	private int prioridad;
	private String encargado;
	private String comentarios;
	private ArrayList<Tarea> subtareas;

	public Tarea() {

	}

	public Tarea(int idTarea, String nombre, String fechaIni, String fechaFin, int prioridad, String encargado,
			String comentarios, ArrayList<Tarea> t) {
		this.idTarea = idTarea;
		this.nombre = nombre;
		this.fechaIni = fechaIni;
		this.fechaFin = fechaFin;
		this.encargado = encargado;
		this.prioridad = prioridad;
		this.comentarios = comentarios;
		this.subtareas = t;
	}


	public Tarea(int idTarea, String nombre, String fechaIni, String fechaFin, int prioridad, String encargado,
			String comentarios) {
		this.idTarea = idTarea;
		this.nombre = nombre;
		this.fechaIni = fechaIni;
		this.fechaFin = fechaFin;
		this.encargado = encargado;
		this.prioridad = prioridad;
		this.comentarios = comentarios;
	}
	public ArrayList<Tarea> getSubtareas() {
		return subtareas;
	}

	public void setSubtareas(ArrayList<Tarea> subtareas) {
		this.subtareas = subtareas;
	}

	public int getIdTarea() {
		return idTarea;
	}

	public void setIdTarea(int idTarea) {
		this.idTarea = idTarea;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaIni() {
		return fechaIni;
	}

	public void setFechaIni(String fechaIni) {
		this.fechaIni = fechaIni;
	}

	public String getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}

	public int getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}

	public String getEncargado() {
		return encargado;
	}

	public void setEncargado(String encargado) {
		this.encargado = encargado;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	@Override
	public String toString() {
		return nombre;
	}
}
