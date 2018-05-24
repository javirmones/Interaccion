package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JTextField;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class VentanaMensaje extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtCuerpoDelMensaje;
	private JButton btnAtrs;

	/**
	 * Launch the application.
	 */
	
	 
	public VentanaMensaje() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 706, 708);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 690, 618);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblDestinatario = new JLabel("Destinatario");
		lblDestinatario.setBounds(12, 222, 89, 16);
		panel.add(lblDestinatario);
		
		textField = new JTextField();
		textField.setBounds(107, 219, 571, 22);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Asunto");
		lblNewLabel_1.setBounds(12, 257, 89, 16);
		panel.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(107, 254, 571, 22);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		txtCuerpoDelMensaje = new JTextField();
		txtCuerpoDelMensaje.setEditable(false);
		txtCuerpoDelMensaje.setHorizontalAlignment(SwingConstants.CENTER);
		txtCuerpoDelMensaje.setText("Cuerpo del mensaje");
		txtCuerpoDelMensaje.setBounds(0, 289, 690, 22);
		panel.add(txtCuerpoDelMensaje);
		txtCuerpoDelMensaje.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 312, 690, 306);
		panel.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JLabel lblfoto = new JLabel("");
		lblfoto.setBounds(239, 26, 214, 144);
		lblfoto.setHorizontalTextPosition(SwingConstants.CENTER);
		lblfoto.setHorizontalAlignment(SwingConstants.CENTER);
		lblfoto.setIcon(
				new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Message.png")) //$NON-NLS-1$
						.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
		panel.add(lblfoto);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setBounds(361, 636, 128, 25);
		contentPane.add(btnEnviar);
		
		btnAtrs = new JButton("Atrás");
		btnAtrs.setBounds(223, 636, 128, 25);
		contentPane.add(btnAtrs);
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
	}
}
