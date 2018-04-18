package presentacion;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import dominio.Usuario;

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

public class VentanaRegistro extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_1;
	private JLabel label;
	private JLabel label_1;
	private JTextField testnombre;
	private JLabel label_2;
	private JLabel label_3;
	private JTextField textapellidos;
	private JLabel label_4;
	private JFormattedTextField textDNI;
	private JLabel label_5;
	private JTextField textcontra;
	private JLabel label_6;
	private JTextField textemail;
	private JLabel label_8;
	private JFormattedTextField textfecha;
	private MaskFormatter fecha;
	private MaskFormatter DNI;
	private JLabel label_9;
	private JButton button;
	private JButton button_1;
	private JTextField textusuario;

	public VentanaRegistro() {
		setTitle("Registrarse");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 511, 440);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[] { 92, 126, 147, 0, 0, 0 };
		gbl_panel_1.rowHeights = new int[] { 27, 20, 20, 20, 20, 20, 20, 20, 14, 0, 0, 0, 0, 0, 0 };
		gbl_panel_1.columnWeights = new double[] { 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panel_1.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		panel_1.setLayout(gbl_panel_1);

		label = new JLabel("\u00A1Bienvenido al sistema!");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.gridwidth = 5;
		gbc_label.anchor = GridBagConstraints.NORTH;
		gbc_label.insets = new Insets(0, 0, 5, 0);
		gbc_label.gridx = 0;
		gbc_label.gridy = 1;
		panel_1.add(label, gbc_label);

		label_1 = new JLabel("Por favor para registrarte introduce tus datos personales");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.gridwidth = 5;
		gbc_label_1.anchor = GridBagConstraints.SOUTH;
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 0;
		gbc_label_1.gridy = 2;
		panel_1.add(label_1, gbc_label_1);

		label_2 = new JLabel("Usuario");
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.gridwidth = 2;
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.gridx = 0;
		gbc_label_2.gridy = 4;
		panel_1.add(label_2, gbc_label_2);

		textusuario = new JTextField();
		textusuario.setColumns(10);
		GridBagConstraints gbc_textusuario = new GridBagConstraints();
		gbc_textusuario.insets = new Insets(0, 0, 5, 5);
		gbc_textusuario.fill = GridBagConstraints.HORIZONTAL;
		gbc_textusuario.gridx = 2;
		gbc_textusuario.gridy = 4;
		panel_1.add(textusuario, gbc_textusuario);

		label_3 = new JLabel("Nombre");
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.gridwidth = 2;
		gbc_label_3.insets = new Insets(0, 0, 5, 5);
		gbc_label_3.gridx = 0;
		gbc_label_3.gridy = 5;
		panel_1.add(label_3, gbc_label_3);

		testnombre = new JTextField();
		testnombre.setColumns(10);
		GridBagConstraints gbc_testnombre = new GridBagConstraints();
		gbc_testnombre.anchor = GridBagConstraints.NORTH;
		gbc_testnombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_testnombre.insets = new Insets(0, 0, 5, 5);
		gbc_testnombre.gridx = 2;
		gbc_testnombre.gridy = 5;
		panel_1.add(testnombre, gbc_testnombre);

		label_4 = new JLabel("Apellidos");
		GridBagConstraints gbc_label_4 = new GridBagConstraints();
		gbc_label_4.gridwidth = 2;
		gbc_label_4.insets = new Insets(0, 0, 5, 5);
		gbc_label_4.gridx = 0;
		gbc_label_4.gridy = 6;
		panel_1.add(label_4, gbc_label_4);

		textapellidos = new JTextField();
		textapellidos.setColumns(10);
		GridBagConstraints gbc_textapellidos = new GridBagConstraints();
		gbc_textapellidos.anchor = GridBagConstraints.NORTH;
		gbc_textapellidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_textapellidos.insets = new Insets(0, 0, 5, 5);
		gbc_textapellidos.gridx = 2;
		gbc_textapellidos.gridy = 6;
		panel_1.add(textapellidos, gbc_textapellidos);

		label_5 = new JLabel("DNI");
		GridBagConstraints gbc_label_5 = new GridBagConstraints();
		gbc_label_5.gridwidth = 2;
		gbc_label_5.insets = new Insets(0, 0, 5, 5);
		gbc_label_5.gridx = 0;
		gbc_label_5.gridy = 7;
		panel_1.add(label_5, gbc_label_5);

		textDNI = new JFormattedTextField();
		try {
			DNI = new MaskFormatter("########'-U");
			// fecha.setPlaceholderCharacter('X');
			textDNI = new JFormattedTextField(DNI);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		textDNI.setColumns(10);
		GridBagConstraints gbc_textDNI = new GridBagConstraints();
		gbc_textDNI.anchor = GridBagConstraints.NORTH;
		gbc_textDNI.fill = GridBagConstraints.HORIZONTAL;
		gbc_textDNI.insets = new Insets(0, 0, 5, 5);
		gbc_textDNI.gridx = 2;
		gbc_textDNI.gridy = 7;
		panel_1.add(textDNI, gbc_textDNI);

		label_6 = new JLabel("Contrase\u00F1a");
		GridBagConstraints gbc_label_6 = new GridBagConstraints();
		gbc_label_6.gridwidth = 2;
		gbc_label_6.insets = new Insets(0, 0, 5, 5);
		gbc_label_6.gridx = 0;
		gbc_label_6.gridy = 8;
		panel_1.add(label_6, gbc_label_6);

		textcontra = new JTextField();
		textcontra.setColumns(10);
		GridBagConstraints gbc_textcontra = new GridBagConstraints();
		gbc_textcontra.anchor = GridBagConstraints.NORTH;
		gbc_textcontra.fill = GridBagConstraints.HORIZONTAL;
		gbc_textcontra.insets = new Insets(0, 0, 5, 5);
		gbc_textcontra.gridx = 2;
		gbc_textcontra.gridy = 8;
		panel_1.add(textcontra, gbc_textcontra);

		label_8 = new JLabel("Email");
		GridBagConstraints gbc_label_8 = new GridBagConstraints();
		gbc_label_8.gridwidth = 2;
		gbc_label_8.insets = new Insets(0, 0, 5, 5);
		gbc_label_8.gridx = 0;
		gbc_label_8.gridy = 9;
		panel_1.add(label_8, gbc_label_8);

		textemail = new JTextField();
		textemail.setColumns(10);
		GridBagConstraints gbc_textemail = new GridBagConstraints();
		gbc_textemail.anchor = GridBagConstraints.NORTH;
		gbc_textemail.fill = GridBagConstraints.HORIZONTAL;
		gbc_textemail.insets = new Insets(0, 0, 5, 5);
		gbc_textemail.gridx = 2;
		gbc_textemail.gridy = 9;
		panel_1.add(textemail, gbc_textemail);

		label_9 = new JLabel("Fecha Nacimiento");
		GridBagConstraints gbc_label_9 = new GridBagConstraints();
		gbc_label_9.anchor = GridBagConstraints.NORTH;
		gbc_label_9.insets = new Insets(0, 0, 5, 5);
		gbc_label_9.gridwidth = 2;
		gbc_label_9.gridx = 0;
		gbc_label_9.gridy = 10;
		panel_1.add(label_9, gbc_label_9);

		textfecha = new JFormattedTextField();
		try {
			fecha = new MaskFormatter("##-##-####");
			// fecha.setPlaceholderCharacter('X');
			textfecha = new JFormattedTextField(fecha);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		textfecha.setColumns(10);
		GridBagConstraints gbc_textfecha = new GridBagConstraints();
		gbc_textfecha.anchor = GridBagConstraints.NORTH;
		gbc_textfecha.fill = GridBagConstraints.HORIZONTAL;
		gbc_textfecha.insets = new Insets(0, 0, 5, 5);
		gbc_textfecha.gridx = 2;
		gbc_textfecha.gridy = 10;
		panel_1.add(textfecha, gbc_textfecha);

		button_1 = new JButton("Registrarse");
		button_1.addActionListener(new Button_1ActionListener());

		button = new JButton("Cancelar");
		button.addActionListener(new ButtonActionListener());
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.anchor = GridBagConstraints.NORTH;
		gbc_button.fill = GridBagConstraints.HORIZONTAL;
		gbc_button.insets = new Insets(0, 0, 5, 5);
		gbc_button.gridx = 1;
		gbc_button.gridy = 12;
		panel_1.add(button, gbc_button);
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.insets = new Insets(0, 0, 5, 5);
		gbc_button_1.anchor = GridBagConstraints.NORTH;
		gbc_button_1.gridx = 2;
		gbc_button_1.gridy = 12;
		panel_1.add(button_1, gbc_button_1);

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

		}
	}
}
