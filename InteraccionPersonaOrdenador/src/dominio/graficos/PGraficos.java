package dominio.graficos;

public class PGraficos {

	private int x, y;
	private String n;

	public PGraficos(int x, int y, String n) {
		this.x = x;
		this.y = y;
		this.n = n;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getN() {
		return n;
	}

	public void setN(String n) {
		this.n = n;
	}

}