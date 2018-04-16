package dominio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import javax.swing.ImageIcon;

public class Tarea extends Proyecto {
	private String nombre;
	private Usuario encargado;
	private Date fechaInicio;
	private Date fechaFin;
	private String[] etiquetas;
	private String estado;
	private ArrayList<Tarea> subtareas;
	private String comentarios;
	private int prioridad;
	private ImageIcon[] imagenes;

	

	public Tarea(int idProyecto, String nombre, Date fechaInicio, Date fechaFin, String descripcion, int manager,
			int[] personal, int[] tareas, ImageIcon icono, String nombre2, Usuario encargado, Date fechaInicio2,
			Date fechaFin2, String[] etiquetas, String estado, ArrayList<Tarea> subtareas, String comentarios,
			int prioridad, ImageIcon[] imagenes) {
		super(idProyecto, nombre, fechaInicio, fechaFin, descripcion, manager, personal, tareas, icono);
		nombre = nombre2;
		this.encargado = encargado;
		fechaInicio = fechaInicio2;
		fechaFin = fechaFin2;
		this.etiquetas = etiquetas;
		this.estado = estado;
		this.subtareas = subtareas;
		this.comentarios = comentarios;
		this.prioridad = prioridad;
		this.imagenes = imagenes;
	}

	

	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public Usuario getEncargado() {
		return encargado;
	}



	public void setEncargado(Usuario encargado) {
		this.encargado = encargado;
	}



	public Date getFechaInicio() {
		return fechaInicio;
	}



	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}



	public Date getFechaFin() {
		return fechaFin;
	}



	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}



	public String[] getEtiquetas() {
		return etiquetas;
	}



	public void setEtiquetas(String[] etiquetas) {
		this.etiquetas = etiquetas;
	}



	public String getEstado() {
		return estado;
	}



	public void setEstado(String estado) {
		this.estado = estado;
	}



	public ArrayList<Tarea> getSubtareas() {
		return subtareas;
	}



	public void setSubtareas(ArrayList<Tarea> subtareas) {
		this.subtareas = subtareas;
	}



	public String getComentarios() {
		return comentarios;
	}



	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}



	public int getPrioridad() {
		return prioridad;
	}



	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}



	public ImageIcon[] getImagenes() {
		return imagenes;
	}



	public void setImagenes(ImageIcon[] imagenes) {
		this.imagenes = imagenes;
	}



	@Override
	public String toString() {
		return "Tarea [etiquetas=" + Arrays.toString(etiquetas) + ", estado=" + estado + ", prioridad=" + prioridad
				+ ", imagenes=" + Arrays.toString(imagenes) + "]";
	}

}
