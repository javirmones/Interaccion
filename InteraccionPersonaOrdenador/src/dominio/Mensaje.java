package dominio;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import persistencia.GestorMensaje;

public class Mensaje {

	private int idMensaje;
	private String emisor;
	private String receptor;
	private String asunto;
	private String texto;
	private Date fecha;
	private GestorMensaje gMensaje;

	public Mensaje(int idMensaje, String emisor, String receptor, String asunto, String texto, Date fecha, int tipo) {

		this.idMensaje = idMensaje;
		this.emisor = emisor;
		this.receptor = receptor;
		this.asunto = asunto;
		this.texto = texto;
		this.fecha = fecha;
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

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String obtenerMensaje() {
		ResultSet rs = gMensaje.ConsultarMensajes(asunto, receptor);
		String m = "";
		try {
			while (rs.next()) {
				m = rs.getString("Mensaje");
			}
			rs.close();
		} catch (SQLException e) {
		}
		return m;
	}

	@Override
	public String toString() {
		return "Mensaje [idMensaje=" + idMensaje + ", emisor=" + emisor + ", receptor=" + receptor + ", asunto="
				+ asunto + ", texto=" + texto + ", adjunto=" + ", fecha=" + fecha + "";
	}

}
