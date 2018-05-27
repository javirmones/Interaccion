package dominio;

public class Mensaje {

	private int idMensaje;
	private String emisor;
	private String receptor;
	private String asunto;
	private String texto;



	public Mensaje(int idMensaje, String emisor, String receptor, String asunto, String texto) {

		this.idMensaje = idMensaje;
		this.emisor = emisor;
		this.receptor = receptor;
		this.asunto = asunto;
		this.texto = texto;
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

	@Override
	public String toString() {
		return "Mensaje [idMensaje=" + idMensaje + ", emisor=" + emisor + ", receptor=" + receptor + ", asunto="
				+ asunto + ", texto=" + texto + ", adjunto=";
	}

}
