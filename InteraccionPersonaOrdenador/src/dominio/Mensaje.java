package dominio;

import java.util.Arrays;
import java.util.Date;
import javax.swing.ImageIcon;

public class Mensaje implements Comparable<Mensaje> {

	public static final int P3 = -1;
	public static final int P2 = 1;
	public static final int P1 = 0;

	private int idMensaje;
	private String emisor;
	private String receptor;
	private String asunto;
	private String texto;
	private ImageIcon[] adjunto;
	private Date fecha;
	private int tipo;

	public Mensaje(int idMensaje, String emisor, String receptor, String asunto, String texto, ImageIcon[] adjunto,
			Date fecha, int tipo) {

		this.idMensaje = idMensaje;
		this.emisor = emisor;
		this.receptor = receptor;
		this.asunto = asunto;
		this.texto = texto;
		this.adjunto = adjunto;
		this.fecha = fecha;
		this.tipo = tipo;
	}

	public int getIdMensaje() {
		return idMensaje;
	}

	public void setIdMensaje(int idMensaje) {
		this.idMensaje = idMensaje;
	}

	public String getEmisor() {
		return emisor;
	}

	public void setEmisor(String emisor) {
		this.emisor = emisor;
	}

	public String getReceptor() {
		return receptor;
	}

	public void setReceptor(String receptor) {
		this.receptor = receptor;
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public ImageIcon[] getAdjunto() {
		return adjunto;
	}

	public void setAdjunto(ImageIcon[] adjunto) {
		this.adjunto = adjunto;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Mensaje [idMensaje=" + idMensaje + ", emisor=" + emisor + ", receptor=" + receptor + ", asunto="
				+ asunto + ", texto=" + texto + ", adjunto=" + Arrays.toString(adjunto) + ", fecha=" + fecha + ", tipo="
				+ tipo + "]";
	}

	@Override
	public int compareTo(Mensaje o) {
		return fecha.compareTo(o.getFecha());
	}

}
