package dominio;

import java.util.Date;

public class Tarea {

	private int idTarea;
	private String nombre;
	private Date fechaIni;
	private Date fechaFin;
	private String estado;
	private int prioridad;
	private int encargado;
	private String comentarios;
	
	public Tarea() {

	}
	
	public Tarea(int idTarea, String nombre, Date fechaIni, Date fechaFin, String estado, int prioridad, String comentarios) {
		this.idTarea = idTarea;
		this.nombre = nombre;
		this.fechaIni = fechaIni;
		this.fechaFin = fechaFin;
		this.estado = estado;
		this.encargado = 1;
		this.prioridad = prioridad;
		this.comentarios = comentarios;
	}
	
	public Tarea(String nombre, Date fechaIni, Date fechaFin, String estado, int prioridad, String comentarios) {
		this.nombre = nombre;
		this.fechaIni = fechaIni;
		this.fechaFin = fechaFin;
		this.estado = estado;
		this.encargado = 1;
		this.prioridad = prioridad;
		this.comentarios = comentarios;
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

	public Date getFechaIni() {
		return fechaIni;
	}

	public void setFechaIni(Date fechaIni) {
		this.fechaIni = fechaIni;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}

	public int getEncargado() {
		return encargado;
	}

	public void setEncargado(int encargado) {
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
