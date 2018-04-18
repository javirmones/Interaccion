package presentacion;

import java.awt.EventQueue;

import persistencia.Agente;


public class Main {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					
					VentanaBbdd vb = new VentanaBbdd();
					vb.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


}
