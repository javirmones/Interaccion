package dominio.graficos;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JLabel;

@SuppressWarnings("serial")

public class AreaDibujo extends JLabel {

	private ArrayList<PGraficos> list = new ArrayList<>();

	public AreaDibujo() {

	}

	public void addNote(PGraficos n) {
		list.add(n);
	}

	public void paint(Graphics g) {
		super.paint(g);
		for (int i = 0; i < list.size(); i++) {
			PGraficos ng = list.get(i);
			g.drawString(ng.getN(), ng.getX(), ng.getY());
		}

	}
}
