package dominio;

import javax.swing.ImageIcon;
import java.util.Date;


public class Proyecto{

	private int idProyecto;
	private String nombre;
	private Date fechaInicio;
	private Date fechaFin;
	private String descripcion;
	private int manager;
	private int[] personal;
	private int[] tareas;
	private ImageIcon icono;

	public Proyecto(int idProyecto, String nombre, Date fechaInicio, Date fechaFin, String descripcion, int manager,
			int[] personal, int[] tareas, ImageIcon icono) {
		
		this.idProyecto = idProyecto;
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.descripcion = descripcion;
		this.manager = manager;
		this.personal = personal;
		this.tareas = tareas;
		this.icono = icono;
	}

	public Proyecto() {
		
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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getManager() {
		return manager;
	}

	public void setManager(int manager) {
		this.manager = manager;
	}

	public int[] getPersonal() {
		return personal;
	}

	public void setPersonal(int[] personal) {
		this.personal = personal;
	}

	public int[] getTareas() {
		return tareas;
	}

	public void setTareas(int[] tareas) {
		this.tareas = tareas;
	}

	public ImageIcon getIcono() {
		return icono;
	}

	public void setIcono(ImageIcon icono) {
		this.icono = icono;
	}
        
      
        
        
}
