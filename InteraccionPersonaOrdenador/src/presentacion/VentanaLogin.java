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
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JPasswordField;
import java.awt.Dimension;

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
	private final String password = "ipo1";
	private final String user = "javi";

	/**
	 * Launch the application.
	 */
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
		frLogin = new JFrame();
		frLogin.setResizable(false);
		frLogin.setBounds(100, 100, 498, 446);
		frLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();
		frLogin.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnLimpiar.addMouseListener(new LimpiarMouseListener());
		// Limpiar.addMouseListener(new BtnNewButtonMouseListener());
		btnLimpiar.setBounds(93, 249, 152, 41);
		panel.add(btnLimpiar);

		btnEntrar = new JButton("Entrar");
		btnEntrar.addMouseListener(new EntrarMouseListener());
		btnEntrar.setFont(new Font("Tahoma", Font.PLAIN, 17));
		// Entrar.addMouseListener(new EntrarMouseListener());
		// Entrar.addActionListener(new BtnNewButton_1ActionListener());
		btnEntrar.setBounds(257, 249, 160, 41);
		panel.add(btnEntrar);

		txtUsuario = new JTextField();
		txtUsuario.addMouseListener(new TxtUsuarioMouseListener());
		txtUsuario.setBounds(157, 142, 207, 26);
		panel.add(txtUsuario);
		txtUsuario.setColumns(10);

		lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblUsuario.setBounds(50, 151, 73, 14);
		panel.add(lblUsuario);

		lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setEnabled(false);
		lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblContrasea.setBounds(50, 177, 92, 20);
		panel.add(lblContrasea);

		lblaunNoTienes = new JLabel("\u00BFAun no tienes cuenta?");
		lblaunNoTienes.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblaunNoTienes.setBounds(123, 213, 183, 14);
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
		lblRegistrarse.setBounds(298, 213, 98, 14);
		panel.add(lblRegistrarse);

		lblNewLabel = new JLabel("");
		lblNewLabel.setEnabled(false);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(VentanaLogin.class.getResource("/Presentacion/1200px-LogoUCLM.svg.png")));
		lblNewLabel.setBounds(170, 29, 152, 100);
		panel.add(lblNewLabel);
		{
			txtContrasenia = new JPasswordField();

			txtContrasenia.setEnabled(false);

			txtContrasenia.setBounds(157, 175, 207, 26);
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

			VentanaRegistro R = new VentanaRegistro();
			R.setVisible(true);
		}
	}

	private class EntrarMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent arg0) {

			if (String.valueOf(txtContrasenia.getPassword()).equals(password)
					&& String.valueOf(txtUsuario.getText()).equals(user)) {
				JOptionPane.showMessageDialog(null, "Login correcto", "Mensaje Informativo",
						JOptionPane.INFORMATION_MESSAGE);
				VentanaPrincipal v = new VentanaPrincipal();
				v.setVisible(true);
				frLogin.dispose();

			} else {

				JOptionPane.showMessageDialog(null, "Login incorrecto, introduzca la contraseña correcta.",
						"Mensaje Informativo", JOptionPane.INFORMATION_MESSAGE);

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
