package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JTextField;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.FlowLayout;
import javax.swing.border.TitledBorder;

import presentacion.personalizado.ImageFilter;

import java.awt.Toolkit;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class VentanaMensaje extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldDestinatario;
	private JTextField textFieldAsunto;
	private JTextField txtCuerpoDelMensaje;
	private JButton btnAtrs;
	private JTextField textFieldAdjuntar;

	/**
	 * Launch the application.
	 */

	public VentanaMensaje() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaMensaje.class.getResource("/iconos/letter(1).png")));
		setTitle("Mensajes");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 706, 708);
		setResizable(false);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JPanel panel_mensaje = new JPanel();
		panel_mensaje.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(panel_mensaje);
		GridBagLayout gbl_panel_mensaje = new GridBagLayout();
		gbl_panel_mensaje.columnWidths = new int[] { 114, 457, 65, 35, 0, 0 };
		gbl_panel_mensaje.rowHeights = new int[] { 193, 43, 43, 36, 36, 22, 198, 0 };
		gbl_panel_mensaje.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panel_mensaje.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel_mensaje.setLayout(gbl_panel_mensaje);

		JLabel lblfoto = new JLabel("");
		lblfoto.setHorizontalTextPosition(SwingConstants.CENTER);
		lblfoto.setHorizontalAlignment(SwingConstants.CENTER);
		lblfoto.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Message.png")) //$NON-NLS-1$
				.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
		GridBagConstraints gbc_lblfoto = new GridBagConstraints();
		gbc_lblfoto.fill = GridBagConstraints.BOTH;
		gbc_lblfoto.insets = new Insets(0, 0, 5, 5);
		gbc_lblfoto.gridx = 1;
		gbc_lblfoto.gridy = 0;
		panel_mensaje.add(lblfoto, gbc_lblfoto);

		JLabel lblDestinatario = new JLabel("Destinatario");
		GridBagConstraints gbc_lblDestinatario = new GridBagConstraints();
		gbc_lblDestinatario.anchor = GridBagConstraints.EAST;
		gbc_lblDestinatario.fill = GridBagConstraints.VERTICAL;
		gbc_lblDestinatario.insets = new Insets(0, 0, 5, 5);
		gbc_lblDestinatario.gridx = 0;
		gbc_lblDestinatario.gridy = 1;
		panel_mensaje.add(lblDestinatario, gbc_lblDestinatario);

		textFieldDestinatario = new JTextField();
		GridBagConstraints gbc_textFieldDestinatario = new GridBagConstraints();
		gbc_textFieldDestinatario.gridwidth = 4;
		gbc_textFieldDestinatario.fill = GridBagConstraints.BOTH;
		gbc_textFieldDestinatario.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldDestinatario.gridx = 1;
		gbc_textFieldDestinatario.gridy = 1;
		panel_mensaje.add(textFieldDestinatario, gbc_textFieldDestinatario);
		textFieldDestinatario.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Asunto");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 2;
		panel_mensaje.add(lblNewLabel_1, gbc_lblNewLabel_1);

		textFieldAsunto = new JTextField();
		GridBagConstraints gbc_textFieldAsunto = new GridBagConstraints();
		gbc_textFieldAsunto.gridwidth = 4;
		gbc_textFieldAsunto.fill = GridBagConstraints.BOTH;
		gbc_textFieldAsunto.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldAsunto.gridx = 1;
		gbc_textFieldAsunto.gridy = 2;
		panel_mensaje.add(textFieldAsunto, gbc_textFieldAsunto);
		textFieldAsunto.setColumns(10);

		JLabel lblAdjunto = new JLabel("Adjuntar");
		GridBagConstraints gbc_lblAdjunto = new GridBagConstraints();
		gbc_lblAdjunto.anchor = GridBagConstraints.EAST;
		gbc_lblAdjunto.fill = GridBagConstraints.VERTICAL;
		gbc_lblAdjunto.insets = new Insets(0, 0, 5, 5);
		gbc_lblAdjunto.gridx = 0;
		gbc_lblAdjunto.gridy = 3;
		panel_mensaje.add(lblAdjunto, gbc_lblAdjunto);

		textFieldAdjuntar = new JTextField();
		GridBagConstraints gbc_textFieldAdjuntar = new GridBagConstraints();
		gbc_textFieldAdjuntar.gridwidth = 2;
		gbc_textFieldAdjuntar.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldAdjuntar.fill = GridBagConstraints.BOTH;
		gbc_textFieldAdjuntar.gridx = 1;
		gbc_textFieldAdjuntar.gridy = 3;
		panel_mensaje.add(textFieldAdjuntar, gbc_textFieldAdjuntar);
		textFieldAdjuntar.setColumns(10);

		JButton btnRuta = new JButton("");
		btnRuta.addActionListener(new BtnRutaActionListener());
		btnRuta.setIcon(new ImageIcon(VentanaMensaje.class.getResource("/iconos/add-filled-cross-sign.png")));
		GridBagConstraints gbc_btnRuta = new GridBagConstraints();
		gbc_btnRuta.gridwidth = 2;
		gbc_btnRuta.fill = GridBagConstraints.BOTH;
		gbc_btnRuta.insets = new Insets(0, 0, 5, 5);
		gbc_btnRuta.gridx = 3;
		gbc_btnRuta.gridy = 3;
		panel_mensaje.add(btnRuta, gbc_btnRuta);

		JButton btnEditar = new JButton("");
		btnEditar.addActionListener(new BtnEditarActionListener());
		btnEditar.setIcon(new ImageIcon(VentanaMensaje.class.getResource("/iconos/edit-draw-pencil.png")));
		GridBagConstraints gbc_btnEditar = new GridBagConstraints();
		gbc_btnEditar.gridwidth = 2;
		gbc_btnEditar.fill = GridBagConstraints.BOTH;
		gbc_btnEditar.insets = new Insets(0, 0, 5, 5);
		gbc_btnEditar.gridx = 3;
		gbc_btnEditar.gridy = 4;
		panel_mensaje.add(btnEditar, gbc_btnEditar);

		txtCuerpoDelMensaje = new JTextField();
		txtCuerpoDelMensaje.setEditable(false);
		txtCuerpoDelMensaje.setHorizontalAlignment(SwingConstants.CENTER);
		txtCuerpoDelMensaje.setText("Cuerpo del mensaje");
		GridBagConstraints gbc_txtCuerpoDelMensaje = new GridBagConstraints();
		gbc_txtCuerpoDelMensaje.gridwidth = 5;
		gbc_txtCuerpoDelMensaje.fill = GridBagConstraints.BOTH;
		gbc_txtCuerpoDelMensaje.insets = new Insets(0, 0, 5, 5);
		gbc_txtCuerpoDelMensaje.gridx = 0;
		gbc_txtCuerpoDelMensaje.gridy = 5;
		panel_mensaje.add(txtCuerpoDelMensaje, gbc_txtCuerpoDelMensaje);
		txtCuerpoDelMensaje.setColumns(10);

		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 0, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridwidth = 5;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 6;
		panel_mensaje.add(scrollPane, gbc_scrollPane);

		JTextArea textAreaCuerpo = new JTextArea();
		scrollPane.setViewportView(textAreaCuerpo);

		btnAtrs = new JButton("Atrás");
		btnAtrs.addActionListener(new BtnAtrsActionListener());
		contentPane.add(btnAtrs);

		JButton btnEnviar = new JButton("Enviar");
		contentPane.add(btnEnviar);
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
	}

	private class BtnAtrsActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			dispose();
		}
	}

	private class BtnRutaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JFileChooser fcAbrir = new JFileChooser();
			fcAbrir.setFileFilter(new ImageFilter());
			int valorDevuelto = fcAbrir.showOpenDialog(null);
			if (valorDevuelto == JFileChooser.APPROVE_OPTION) {
				File file = fcAbrir.getSelectedFile();

			}
		}
	}

	private class BtnEditarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			VentanaEditarImagen ve = new VentanaEditarImagen();
			ve.setVisible(true);
		}
	}
}
