package presentacion;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaRegistro extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_1;
	private JLabel label;
	private JLabel label_1;
	private JTextField textField;
	private JLabel label_2;
	private JLabel label_3;
	private JTextField textField_1;
	private JLabel label_4;
	private JTextField textField_2;
	private JLabel label_5;
	private JTextField textField_3;
	private JLabel label_6;
	private JTextField textField_4;
	private JLabel label_7;
	private JTextField textField_5;
	private JLabel label_8;
	private JTextField textField_6;
	private JLabel label_9;
	private JButton button;
	private JButton button_1;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public VentanaRegistro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 364, 466);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);

		label = new JLabel("\u00A1Bienvenido al sistema!");
		label.setBounds(82, 11, 155, 14);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label);

		label_1 = new JLabel("Por favor para registrarte introduce tus datos personales");
		label_1.setBounds(32, 24, 275, 14);
		panel_1.add(label_1);

		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(160, 63, 147, 20);
		panel_1.add(textField);

		label_2 = new JLabel("Usuario");
		label_2.setBounds(32, 66, 46, 14);
		panel_1.add(label_2);

		label_3 = new JLabel("Nombre");
		label_3.setBounds(32, 104, 46, 14);
		panel_1.add(label_3);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(160, 101, 147, 20);
		panel_1.add(textField_1);

		label_4 = new JLabel("Apellidos");
		label_4.setBounds(32, 139, 46, 14);
		panel_1.add(label_4);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(160, 136, 147, 20);
		panel_1.add(textField_2);

		label_5 = new JLabel("DNI");
		label_5.setBounds(32, 180, 46, 14);
		panel_1.add(label_5);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(160, 177, 147, 20);
		panel_1.add(textField_3);

		label_6 = new JLabel("Contrase\u00F1a");
		label_6.setBounds(32, 222, 46, 14);
		panel_1.add(label_6);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(160, 219, 147, 20);
		panel_1.add(textField_4);

		label_7 = new JLabel("Conf Contrase\u00F1a");
		label_7.setBounds(32, 269, 94, 14);
		panel_1.add(label_7);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(160, 266, 147, 20);
		panel_1.add(textField_5);

		label_8 = new JLabel("Email");
		label_8.setBounds(32, 307, 46, 14);
		panel_1.add(label_8);

		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(160, 304, 147, 20);
		panel_1.add(textField_6);

		label_9 = new JLabel("Fecha Nacimiento");
		label_9.setBounds(32, 345, 94, 14);
		panel_1.add(label_9);

		button = new JButton("Cancelar");
		button.addActionListener(new ButtonActionListener());
		button.setBounds(32, 382, 118, 23);
		panel_1.add(button);

		button_1 = new JButton("Registrarse");
		button_1.addActionListener(new Button_1ActionListener());
		button_1.setBounds(196, 382, 111, 23);
		panel_1.add(button_1);

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
			dispose();
		}
	}
}
