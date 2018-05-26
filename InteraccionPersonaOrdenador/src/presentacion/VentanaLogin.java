package presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import static javax.swing.UIManager.setLookAndFeel;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

import org.pushingpixels.substance.api.SubstanceLookAndFeel;
import org.pushingpixels.substance.api.skin.SubstanceCeruleanLookAndFeel;
import org.pushingpixels.substance.api.skin.SubstanceCremeCoffeeLookAndFeel;
import org.pushingpixels.substance.api.skin.SubstanceCremeLookAndFeel;
import org.pushingpixels.substance.api.skin.SubstanceDustLookAndFeel;
import org.pushingpixels.substance.api.skin.SubstanceEmeraldDuskLookAndFeel;
import org.pushingpixels.substance.api.skin.SubstanceGeminiLookAndFeel;
import org.pushingpixels.substance.api.skin.SubstanceGraphiteLookAndFeel;
import org.pushingpixels.substance.api.skin.SubstanceMagellanLookAndFeel;
import org.pushingpixels.substance.api.skin.SubstanceMarinerLookAndFeel;
import org.pushingpixels.substance.api.skin.SubstanceMistAquaLookAndFeel;
import org.pushingpixels.substance.api.skin.SubstanceModerateLookAndFeel;
import org.pushingpixels.substance.api.skin.SubstanceNebulaBrickWallLookAndFeel;
import org.pushingpixels.substance.api.skin.SubstanceOfficeBlue2007LookAndFeel;
import org.pushingpixels.substance.api.skin.SubstanceRavenLookAndFeel;
import org.pushingpixels.substance.api.skin.SubstanceSaharaLookAndFeel;
import org.pushingpixels.substance.api.skin.SubstanceTwilightLookAndFeel;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.JPasswordField;
import java.awt.Dimension;

import dominio.Usuario;
import persistencia.GestorUsuarios;

import java.util.*;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Toolkit;

public class VentanaLogin {

	private JFrame frLogin;
	private JPanel panel;
	private JButton btnLimpiar;
	private JButton btnEntrar;
	private JTextField txtUsuario;
	private JLabel lblUsuario;
	private JLabel lblContrasea;
	private JLabel lblaunNoTienes;
	private JLabel lblRegistrarse;
	private JLabel lblNewLabel;
	private JPasswordField txtContrasenia;
	private JLabel label;
	private String usuario = "";
	private String contra = "";
	private GestorUsuarios usuarios = new GestorUsuarios();

	public VentanaLogin() {
		// JFrame.setDefaultLookAndFeelDecorated(true);
		// SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.DustSkin");
		initialize();
		frLogin.setVisible(true);

	}

	private void initialize() {
		usuarios.Inicializacion();
		try {
			setLookAndFeel(new SubstanceTwilightLookAndFeel());
		} catch (Exception e) {
			e.printStackTrace();
		}
		frLogin = new JFrame();
		frLogin.setIconImage(
				Toolkit.getDefaultToolkit().getImage(VentanaLogin.class.getResource("/iconos/rate-star-button.png")));
		frLogin.setTitle("Gestion de Proyectos");
		frLogin.addWindowListener(new FrLoginWindowListener());
		frLogin.setResizable(false);
		frLogin.setLocationRelativeTo(null);
		frLogin.setBounds(700, 200, 492, 415);
		frLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();
		frLogin.getContentPane().add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 50, 92, 77, 38, 50, 0, 89, 42, 53, 0 };
		gbl_panel.rowHeights = new int[] { 20, 159, 26, 26, 49, 54, 0, 0, 0, 0 };
		gbl_panel.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		txtUsuario = new JTextField();
		txtUsuario.addMouseListener(new TxtUsuarioMouseListener());

		lblNewLabel = new JLabel("");
		lblNewLabel.setEnabled(false);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(VentanaLogin.class.getResource("/iconos/image004.png")));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridwidth = 7;
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 1;
		panel.add(lblNewLabel, gbc_lblNewLabel);

		lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 17));
		GridBagConstraints gbc_lblUsuario = new GridBagConstraints();
		gbc_lblUsuario.anchor = GridBagConstraints.WEST;
		gbc_lblUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsuario.gridx = 1;
		gbc_lblUsuario.gridy = 2;
		panel.add(lblUsuario, gbc_lblUsuario);
		GridBagConstraints gbc_txtUsuario = new GridBagConstraints();
		gbc_txtUsuario.anchor = GridBagConstraints.NORTH;
		gbc_txtUsuario.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_txtUsuario.gridwidth = 5;
		gbc_txtUsuario.gridx = 2;
		gbc_txtUsuario.gridy = 2;
		panel.add(txtUsuario, gbc_txtUsuario);
		txtUsuario.setColumns(10);

		lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setEnabled(false);
		lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 17));
		GridBagConstraints gbc_lblContrasea = new GridBagConstraints();
		gbc_lblContrasea.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblContrasea.insets = new Insets(0, 0, 5, 5);
		gbc_lblContrasea.gridx = 1;
		gbc_lblContrasea.gridy = 3;
		panel.add(lblContrasea, gbc_lblContrasea);
		{
			txtContrasenia = new JPasswordField();

			txtContrasenia.setEnabled(false);
			GridBagConstraints gbc_txtContrasenia = new GridBagConstraints();
			gbc_txtContrasenia.anchor = GridBagConstraints.NORTH;
			gbc_txtContrasenia.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtContrasenia.insets = new Insets(0, 0, 5, 5);
			gbc_txtContrasenia.gridwidth = 5;
			gbc_txtContrasenia.gridx = 2;
			gbc_txtContrasenia.gridy = 3;
			panel.add(txtContrasenia, gbc_txtContrasenia);
		}

		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnLimpiar.addMouseListener(new LimpiarMouseListener());

		lblaunNoTienes = new JLabel("\u00BFAun no tienes cuenta?");
		lblaunNoTienes.setFont(new Font("Tahoma", Font.PLAIN, 17));
		GridBagConstraints gbc_lblaunNoTienes = new GridBagConstraints();
		gbc_lblaunNoTienes.anchor = GridBagConstraints.EAST;
		gbc_lblaunNoTienes.fill = GridBagConstraints.VERTICAL;
		gbc_lblaunNoTienes.insets = new Insets(0, 0, 5, 5);
		gbc_lblaunNoTienes.gridwidth = 3;
		gbc_lblaunNoTienes.gridx = 1;
		gbc_lblaunNoTienes.gridy = 4;
		panel.add(lblaunNoTienes, gbc_lblaunNoTienes);

		lblRegistrarse = new JLabel("Registrarse");
		lblRegistrarse.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblRegistrarse.addMouseListener(new LblRegistrarseMouseListener());
		lblRegistrarse.setForeground(Color.BLUE);
		GridBagConstraints gbc_lblRegistrarse = new GridBagConstraints();
		gbc_lblRegistrarse.anchor = GridBagConstraints.WEST;
		gbc_lblRegistrarse.fill = GridBagConstraints.VERTICAL;
		gbc_lblRegistrarse.insets = new Insets(0, 0, 5, 5);
		gbc_lblRegistrarse.gridwidth = 2;
		gbc_lblRegistrarse.gridx = 5;
		gbc_lblRegistrarse.gridy = 4;
		panel.add(lblRegistrarse, gbc_lblRegistrarse);
		GridBagConstraints gbc_btnLimpiar = new GridBagConstraints();
		gbc_btnLimpiar.fill = GridBagConstraints.BOTH;
		gbc_btnLimpiar.insets = new Insets(0, 0, 5, 5);
		gbc_btnLimpiar.gridwidth = 2;
		gbc_btnLimpiar.gridx = 1;
		gbc_btnLimpiar.gridy = 5;
		panel.add(btnLimpiar, gbc_btnLimpiar);

		btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new BtnEntrarActionListener());

		btnEntrar.setFont(new Font("Tahoma", Font.PLAIN, 17));
		GridBagConstraints gbc_btnEntrar = new GridBagConstraints();
		gbc_btnEntrar.insets = new Insets(0, 0, 5, 5);
		gbc_btnEntrar.fill = GridBagConstraints.BOTH;
		gbc_btnEntrar.gridwidth = 4;
		gbc_btnEntrar.gridx = 4;
		gbc_btnEntrar.gridy = 5;
		panel.add(btnEntrar, gbc_btnEntrar);

		label = new JLabel("");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 4;
		gbc_label.gridy = 7;
		panel.add(label, gbc_label);
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

			VentanaRegistro r = new VentanaRegistro();
			r.setVisible(true);

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

	private class BtnEntrarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			usuario = txtUsuario.getText();
			contra = String.valueOf(txtContrasenia.getPassword());
			VentanaPrincipal vp;
			DefaultListModel<Usuario> listaUsuarios = usuarios.getLista();
			boolean correcto = false;
			for (int i = 0; i < listaUsuarios.size(); i++) {
				if (listaUsuarios.getElementAt(i).getNombre().equals(usuario)
						&& listaUsuarios.getElementAt(i).getContraseña().equals(contra)) {
					correcto = true;
				}
			}

			if (correcto) {
				JOptionPane.showMessageDialog(frLogin, "Login correcto", "Mensaje Informativo",
						JOptionPane.INFORMATION_MESSAGE);
				try {
					vp = new VentanaPrincipal();
					vp.setExtendedState(Frame.MAXIMIZED_BOTH);
					vp.setVisible(true);
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				frLogin.dispose();

			} else {
				JOptionPane.showMessageDialog(frLogin, "Login incorrecto, introduzca la		 contraseña correcta.",
						"Mensaje Informativo", JOptionPane.INFORMATION_MESSAGE);

			}

		}
	}

	public void comprobarUsuario() {

	}

}
