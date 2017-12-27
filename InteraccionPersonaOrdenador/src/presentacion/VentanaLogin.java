package presentacion;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class VentanaLogin {

	private JFrame frame;
	private int tonto;
	private JPanel panel;
	private JButton Limpiar;
	private JButton Entrar;
	private JTextField txtUsuario;
	private JTextField txtContrasea;
	private JLabel lblUsuario;
	private JLabel lblContrasea;
	private JLabel lblaunNoTienes;
	private JButton Ayuda;
	private JComboBox comboBox;
	private JLabel lblRegistrarse;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					VentanaLogin window = new VentanaLogin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 408);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		Limpiar = new JButton("Limpiar");
		Limpiar.addMouseListener(new LimpiarMouseListener());
		//Limpiar.addMouseListener(new BtnNewButtonMouseListener());
		Limpiar.setBounds(53, 279, 128, 23);
		panel.add(Limpiar);
		
		Entrar = new JButton("Entrar");
		Entrar.addMouseListener(new EntrarMouseListener());
		Entrar.addActionListener(new BtnNewButton_1ActionListener());
		Entrar.setBounds(222, 279, 135, 23);
		panel.add(Entrar);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(157, 148, 225, 20);
		panel.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtContrasea = new JTextField();
		txtContrasea.setBounds(157, 177, 225, 20);
		panel.add(txtContrasea);
		txtContrasea.setColumns(10);
		
		lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(66, 151, 73, 14);
		panel.add(lblUsuario);
		
		lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(66, 180, 64, 14);
		panel.add(lblContrasea);
		
		lblaunNoTienes = new JLabel("\u00BFAun no tienes cuenta?");
		lblaunNoTienes.setBounds(119, 236, 152, 14);
		panel.add(lblaunNoTienes);
		
		Ayuda = new JButton("Ayuda");
		Ayuda.addMouseListener(new AyudaMouseListener());
		Ayuda.addActionListener(new BtnNewButton_2ActionListener());
		Ayuda.setBounds(10, 336, 89, 23);
		panel.add(Ayuda);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Espa\u00F1ol", "Ingles"}));
		comboBox.setMaximumRowCount(2);
		comboBox.setBounds(335, 11, 89, 20);
		panel.add(comboBox);
		
		lblRegistrarse = new JLabel("Registrarse");
		lblRegistrarse.addMouseListener(new LblRegistrarseMouseListener());
		lblRegistrarse.setForeground(Color.BLUE);
		lblRegistrarse.setBounds(259, 236, 98, 14);
		panel.add(lblRegistrarse);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setEnabled(false);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(VentanaLogin.class.getResource("/Presentacion/1200px-LogoUCLM.svg.png")));
		lblNewLabel.setBounds(140, 32, 152, 100);
		panel.add(lblNewLabel);
	}
	private class BtnNewButton_1ActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
	
		}
	}
	private class BtnNewButton_2ActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
		}
	}
	private class LimpiarMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			txtContrasea.setText("");
			txtUsuario.setText("");
		}
	}
	private class AyudaMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			VentanaAyuda V =new VentanaAyuda();
			V.setVisible(true);
			
	}

	}
	private class EntrarMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			VentanaPrincipal p = new VentanaPrincipal();
			p.setVisible(true);
		
		}
	}
	private class LblRegistrarseMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			
			VentanaRegistro R =new VentanaRegistro();
			R.setVisible(true);
		}
	}

}
