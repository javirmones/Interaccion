package presentacion;

import java.awt.EventQueue;

import persistencia.GestorTareas;
import persistencia.GestorUsuarios;


public class Main {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					
					//VentanaBbdd vb = new VentanaBbdd();
					//vb.setVisible(true);
					GestorUsuarios u=new GestorUsuarios();
					u.Inicializacion();
					GestorTareas t = new GestorTareas();
					t.Inicializacion();
					
					VentanaLogin v=new VentanaLogin();
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


}
