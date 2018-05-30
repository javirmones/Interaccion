package presentacion;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import dominio.Usuario;
import persistencia.GestorUsuarios;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;

import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.border.TitledBorder;
import java.awt.Toolkit;
import java.awt.Component;
import javax.swing.Box;

public class VentanaRegistro extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_registrarse;
	private JLabel labelBienvenido;
	private JLabel labelPorfavor;
	private JTextField textnombre;
	private JLabel labelNombre;
	private JTextField textapellidos;
	private JLabel labelApellido;
	private JFormattedTextField textDNI;
	private JFormattedTextField texttelefono;
	private JLabel lblTelefono;
	private JTextField textcontra;
	private JLabel labelContraseña;
	private JTextField textemail;
	private JLabel labelEmail;
	private JFormattedTextField textfecha;
	private MaskFormatter fecha;
	private MaskFormatter DNI;
	private JButton btnCancelar;
	private JButton btnRegistrarse;
	private GestorUsuarios usuarios = new GestorUsuarios();
	private Component horizontalStrut;

	public VentanaRegistro() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaRegistro.class.getResource("/iconos/edit-draw-pencil.png")));
		setTitle("Registrarse");
		setResizable(false);

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 607, 464);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		panel_registrarse = new JPanel();
		panel_registrarse.setBorder(new TitledBorder(null, "GestionProyectos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel_registrarse, BorderLayout.CENTER);
		GridBagLayout gbl_panel_registrarse = new GridBagLayout();
		gbl_panel_registrarse.columnWidths = new int[] { 31, 21, 126, 328, 30, 0 };
		gbl_panel_registrarse.rowHeights = new int[] { 27, 20, 20, 20, 0, 20, 20, 14, 20, 0, 0, 52, 0, 0 };
		gbl_panel_registrarse.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panel_registrarse.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		panel_registrarse.setLayout(gbl_panel_registrarse);

		labelBienvenido = new JLabel("\u00A1Bienvenido al sistema!");
		labelBienvenido.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_labelBienvenido = new GridBagConstraints();
		gbc_labelBienvenido.gridwidth = 5;
		gbc_labelBienvenido.anchor = GridBagConstraints.NORTH;
		gbc_labelBienvenido.insets = new Insets(0, 0, 5, 0);
		gbc_labelBienvenido.gridx = 0;
		gbc_labelBienvenido.gridy = 1;
		panel_registrarse.add(labelBienvenido, gbc_labelBienvenido);

		labelPorfavor = new JLabel("Por favor para registrarte introduce tus datos personales");
		GridBagConstraints gbc_labelPorfavor = new GridBagConstraints();
		gbc_labelPorfavor.gridwidth = 5;
		gbc_labelPorfavor.anchor = GridBagConstraints.SOUTH;
		gbc_labelPorfavor.insets = new Insets(0, 0, 5, 0);
		gbc_labelPorfavor.gridx = 0;
		gbc_labelPorfavor.gridy = 2;
		panel_registrarse.add(labelPorfavor, gbc_labelPorfavor);

		labelEmail = new JLabel("Email");
		GridBagConstraints gbc_labelEmail = new GridBagConstraints();
		gbc_labelEmail.gridwidth = 2;
		gbc_labelEmail.insets = new Insets(0, 0, 5, 5);
		gbc_labelEmail.gridx = 1;
		gbc_labelEmail.gridy = 4;
		panel_registrarse.add(labelEmail, gbc_labelEmail);

		textemail = new JTextField();
		textemail.setColumns(10);
		GridBagConstraints gbc_textemail = new GridBagConstraints();
		gbc_textemail.fill = GridBagConstraints.HORIZONTAL;
		gbc_textemail.anchor = GridBagConstraints.NORTH;
		gbc_textemail.insets = new Insets(0, 0, 5, 5);
		gbc_textemail.gridx = 3;
		gbc_textemail.gridy = 4;
		panel_registrarse.add(textemail, gbc_textemail);

		labelNombre = new JLabel("Nombre");
		GridBagConstraints gbc_labelNombre = new GridBagConstraints();
		gbc_labelNombre.gridwidth = 2;
		gbc_labelNombre.insets = new Insets(0, 0, 5, 5);
		gbc_labelNombre.gridx = 1;
		gbc_labelNombre.gridy = 5;
		panel_registrarse.add(labelNombre, gbc_labelNombre);

		textnombre = new JTextField();
		textnombre.setColumns(10);
		GridBagConstraints gbc_textnombre = new GridBagConstraints();
		gbc_textnombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_textnombre.anchor = GridBagConstraints.NORTH;
		gbc_textnombre.insets = new Insets(0, 0, 5, 5);
		gbc_textnombre.gridx = 3;
		gbc_textnombre.gridy = 5;
		panel_registrarse.add(textnombre, gbc_textnombre);

		labelApellido = new JLabel("Apellidos");
		GridBagConstraints gbc_labelApellido = new GridBagConstraints();
		gbc_labelApellido.gridwidth = 2;
		gbc_labelApellido.insets = new Insets(0, 0, 5, 5);
		gbc_labelApellido.gridx = 1;
		gbc_labelApellido.gridy = 6;
		panel_registrarse.add(labelApellido, gbc_labelApellido);

		textapellidos = new JTextField();
		textapellidos.setColumns(10);
		GridBagConstraints gbc_textapellidos = new GridBagConstraints();
		gbc_textapellidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_textapellidos.anchor = GridBagConstraints.NORTH;
		gbc_textapellidos.insets = new Insets(0, 0, 5, 5);
		gbc_textapellidos.gridx = 3;
		gbc_textapellidos.gridy = 6;
		panel_registrarse.add(textapellidos, gbc_textapellidos);

		labelContraseña = new JLabel("Contrase\u00F1a");
		GridBagConstraints gbc_labelContraseña = new GridBagConstraints();
		gbc_labelContraseña.gridwidth = 2;
		gbc_labelContraseña.insets = new Insets(0, 0, 5, 5);
		gbc_labelContraseña.gridx = 1;
		gbc_labelContraseña.gridy = 7;
		panel_registrarse.add(labelContraseña, gbc_labelContraseña);

		textcontra = new JTextField();
		textcontra.setColumns(10);
		GridBagConstraints gbc_textcontra = new GridBagConstraints();
		gbc_textcontra.fill = GridBagConstraints.HORIZONTAL;
		gbc_textcontra.anchor = GridBagConstraints.NORTH;
		gbc_textcontra.insets = new Insets(0, 0, 5, 5);
		gbc_textcontra.gridx = 3;
		gbc_textcontra.gridy = 7;
		panel_registrarse.add(textcontra, gbc_textcontra);

		lblTelefono = new JLabel("Telefono");
		GridBagConstraints gbc_lblTelefono = new GridBagConstraints();
		gbc_lblTelefono.gridwidth = 2;
		gbc_lblTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelefono.gridx = 1;
		gbc_lblTelefono.gridy = 8;
		panel_registrarse.add(lblTelefono, gbc_lblTelefono);

		textDNI = new JFormattedTextField();
		try {
			DNI = new MaskFormatter("###-###-###");
			// fecha.setPlaceholderCharacter('X');
			texttelefono = new JFormattedTextField(DNI);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		texttelefono.setColumns(10);
		GridBagConstraints gbc_texttelefono = new GridBagConstraints();
		gbc_texttelefono.fill = GridBagConstraints.HORIZONTAL;
		gbc_texttelefono.anchor = GridBagConstraints.NORTH;
		gbc_texttelefono.insets = new Insets(0, 0, 5, 5);
		gbc_texttelefono.gridx = 3;
		gbc_texttelefono.gridy = 8;
		panel_registrarse.add(texttelefono, gbc_texttelefono);

		textfecha = new JFormattedTextField();
		try {
			fecha = new MaskFormatter("##-##-####");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.addActionListener(new Button_1ActionListener());

		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ButtonActionListener());
		
		horizontalStrut = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut = new GridBagConstraints();
		gbc_horizontalStrut.gridwidth = 2;
		gbc_horizontalStrut.gridheight = 2;
		gbc_horizontalStrut.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut.gridx = 2;
		gbc_horizontalStrut.gridy = 9;
		panel_registrarse.add(horizontalStrut, gbc_horizontalStrut);
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.fill = GridBagConstraints.BOTH;
		gbc_btnCancelar.insets = new Insets(0, 0, 5, 5);
		gbc_btnCancelar.gridx = 2;
		gbc_btnCancelar.gridy = 11;
		panel_registrarse.add(btnCancelar, gbc_btnCancelar);
		GridBagConstraints gbc_btnRegistrarse = new GridBagConstraints();
		gbc_btnRegistrarse.fill = GridBagConstraints.BOTH;
		gbc_btnRegistrarse.insets = new Insets(0, 0, 5, 5);
		gbc_btnRegistrarse.gridx = 3;
		gbc_btnRegistrarse.gridy = 11;
		panel_registrarse.add(btnRegistrarse, gbc_btnRegistrarse);

	}

	private class ButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {

			dispose();

		}
	}

	private class Button_1ActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			Usuario u = new Usuario(textnombre.getText(), textapellidos.getText(), textemail.getText(),
					textcontra.getText(), 666666666, "/iconos/x.png");
			usuarios.ActualizarList(u);
			dispose();
		}
	}
}
