package presentacion;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JPasswordField;
import java.awt.Dimension;

import dominio.Usuario;
import persistencia.LeerUsuario;
import java.util.*;

public class VentanaLogin {

	private JFrame frLogin;
	private JPanel panel;
	private JButton btnLimpiar;
	private JButton btnEntrar;
	private JTextField txtUsuario;
	private JLabel lblUsuario;
	private JLabel lblContrasea;
	private JLabel lblaunNoTienes;
	private JComboBox comboBox;
	private JLabel lblRegistrarse;
	private JLabel lblNewLabel;
	private JPasswordField txtContrasenia;
	private  String password = null;
	private  String user = null;
	private List<Usuario> u=null;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					VentanaLogin window = new VentanaLogin();
					window.frLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public VentanaLogin() {
		initialize();

	}

	private void initialize() {
		frLogin = new JFrame();
		frLogin.setTitle("Aplicacion");
		frLogin.addWindowListener(new FrLoginWindowListener());
		frLogin.setResizable(false);
		frLogin.setLocationRelativeTo(null);
		frLogin.setBounds(100, 100, 498, 446);
		frLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();
		frLogin.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnLimpiar.addMouseListener(new LimpiarMouseListener());
		btnLimpiar.setBounds(78, 317, 152, 41);
		panel.add(btnLimpiar);

		btnEntrar = new JButton("Entrar");
		btnEntrar.addMouseListener(new EntrarMouseListener());
		btnEntrar.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnEntrar.setBounds(256, 317, 160, 41);
		panel.add(btnEntrar);

		txtUsuario = new JTextField();
		txtUsuario.addMouseListener(new TxtUsuarioMouseListener());
		txtUsuario.setBounds(153, 211, 207, 26);
		panel.add(txtUsuario);
		txtUsuario.setColumns(10);

		lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblUsuario.setBounds(52, 216, 73, 14);
		panel.add(lblUsuario);

		lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setEnabled(false);
		lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblContrasea.setBounds(52, 251, 92, 20);
		panel.add(lblContrasea);

		lblaunNoTienes = new JLabel("\u00BFAun no tienes cuenta?");
		lblaunNoTienes.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblaunNoTienes.setBounds(111, 287, 183, 14);
		panel.add(lblaunNoTienes);

		comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 17));
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Espa\u00F1ol", "Ingles" }));
		comboBox.setMaximumRowCount(2);
		comboBox.setBounds(367, 16, 89, 20);
		panel.add(comboBox);

		lblRegistrarse = new JLabel("Registrarse");
		lblRegistrarse.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblRegistrarse.addMouseListener(new LblRegistrarseMouseListener());
		lblRegistrarse.setForeground(Color.BLUE);
		lblRegistrarse.setBounds(302, 287, 98, 14);
		panel.add(lblRegistrarse);

		lblNewLabel = new JLabel("");
		lblNewLabel.setEnabled(false);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\absit\\git\\Interaccion\\InteraccionPersonaOrdenador\\image004.png"));
		lblNewLabel.setBounds(170, 36, 152, 159);
		panel.add(lblNewLabel);
		{
			txtContrasenia = new JPasswordField();

			txtContrasenia.setEnabled(false);

			txtContrasenia.setBounds(153, 249, 207, 26);
			panel.add(txtContrasenia);
		}
	}

	private class LimpiarMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			txtContrasenia.setText("");
			txtUsuario.setText("");
			
		}
	}

	private class LblRegistrarseMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			try {
				u=LeerUsuario.leer();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			VentanaRegistro R = new VentanaRegistro(u);
			R.setVisible(true);
			System.out.println(u.size());
			//frLogin.dispose();
		}
	}

	private class EntrarMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent arg0) {
			try {
				u=LeerUsuario.leer();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for (int i=0;i<u.size();i++) {
				user=u.get(i).getIdUsuario();
				password=u.get(i).getContrasenia();
			if (String.valueOf(txtContrasenia.getPassword()).equals(password)
					&& String.valueOf(txtUsuario.getText()).equals(user)) {
				JOptionPane.showMessageDialog(frLogin, "Login correcto", "Mensaje Informativo",
						JOptionPane.INFORMATION_MESSAGE);
				VentanaPrincipal v = new VentanaPrincipal();
				v.setVisible(true);
				frLogin.dispose();

			} else {

				JOptionPane.showMessageDialog(frLogin, "Login incorrecto, introduzca la contraseña correcta.",
						"Mensaje Informativo", JOptionPane.INFORMATION_MESSAGE);

			}
			}
		}
	}

	private class FrLoginWindowListener extends WindowAdapter {
		public void windowClosing(WindowEvent arg0) {
			int dialogButton = JOptionPane.YES_NO_OPTION;
			int dialogResult = JOptionPane.showConfirmDialog(frLogin, "¿Quiere salir de la aplicación?", "Salir",
					dialogButton);
			if (dialogResult == 0) {
				frLogin.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
				JOptionPane.showMessageDialog(frLogin, "Gracias por utilizar nuestra aplicación",
						"Cerrar la aplicación", JOptionPane.PLAIN_MESSAGE);
			} else {
				frLogin.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
			}
		}
	}

	private class TxtUsuarioMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			lblContrasea.setEnabled(true);
			txtContrasenia.setEnabled(true);

		}
	}
	

}
