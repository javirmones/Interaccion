package presentacion;

import java.awt.EventQueue;

public class Main {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					VentanaLogin window = new VentanaLogin();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


}
