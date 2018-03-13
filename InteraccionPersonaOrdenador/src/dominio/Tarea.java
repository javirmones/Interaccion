package dominio;


import java.util.Arrays;
import java.util.Date;
import javax.swing.ImageIcon;

public class Tarea extends Proyecto {
	
	private String[] etiquetas;
	private String estado;
	private int prioridad;
	private ImageIcon[] imagenes;
	
	public Tarea(String[] etiquetas, String estado, int prioridad, ImageIcon[] imagenes, int idProyecto, String nombre, Date fechaInicio, Date fechaFin, String descripcion, int manager,
			int[] personal, int[] tareas, ImageIcon icono) {
		
		this.etiquetas = etiquetas;
		this.estado = estado;
		this.prioridad = prioridad;
		this.imagenes = imagenes;
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

