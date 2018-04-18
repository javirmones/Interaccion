package presentacion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class VentanaBbdd extends JFrame {

	private JPanel contentPane;
	private JLabel lblIntroduceLaBase;
	private JButton btnBuscar;
	private JButton btnIniciar;
	private JTextField rutatextField;
	private static String path;
	private JLabel lblInfo;

	public VentanaBbdd() {
		setTitle("Gestion de proyectos");
		setResizable(false);
		setIconImage(
				Toolkit.getDefaultToolkit().getImage(VentanaBbdd.class.getResource("/iconos/rate-star-button.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 551, 203);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblIntroduceLaBase = new JLabel("Seleccione la ruta para la base de datos:");
			lblIntroduceLaBase.setBounds(40, 26, 327, 20);
			contentPane.add(lblIntroduceLaBase);
		}
		{
			btnBuscar = new JButton("Buscar");
			btnBuscar.addActionListener(new BtnBuscarActionListener());
			btnBuscar.setBounds(40, 68, 103, 29);
			contentPane.add(btnBuscar);
		}
		{
			btnIniciar = new JButton("Iniciar");
			btnIniciar.setEnabled(false);
			btnIniciar.addActionListener(new BtnIniciarActionListener());
			btnIniciar.setBounds(399, 111, 115, 29);
			contentPane.add(btnIniciar);
		}
		{
			rutatextField = new JTextField();
			rutatextField.setBounds(153, 69, 361, 26);
			contentPane.add(rutatextField);
			rutatextField.setColumns(10);
		}
		{
			lblInfo = new JLabel("");
			lblInfo.setBounds(153, 115, 231, 20);
			contentPane.add(lblInfo);
		}
	}

	private class BtnBuscarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JFileChooser jfch = new JFileChooser();
			jfch.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
			jfch.setDialogTitle("Selecciona el directorio de \"bbdd_ipo\"");
			jfch.showOpenDialog(null);

			File f = jfch.getSelectedFile();
			if (f == null) {
				JOptionPane.showMessageDialog(rootPane, "Debes de seleccionar algun directorio.", "No hubo seleccion",
						JOptionPane.ERROR_MESSAGE);
			} else {

				path = jfch.getSelectedFile().getPath();
				rutatextField.setText(path);

				if (path.substring(path.lastIndexOf("\\") + 1, path.length()).equals("bbdd_ipo.sql")
						|| path.substring(path.lastIndexOf("\\") + 1, path.length()).equals("bbdd_ipo")) {
					btnIniciar.setEnabled(true);
					rutatextField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
					lblInfo.setForeground(new Color(0, 215, 0));
					lblInfo.setText("Selecciona el boton iniciar");
				} else {
					btnIniciar.setEnabled(false);
					rutatextField.setBorder(BorderFactory.createLineBorder(Color.RED));
					lblInfo.setForeground(Color.RED);
					lblInfo.setText("Directorio no valido");
				}
			}
		}
	}

	private class BtnIniciarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			VentanaLogin login = new VentanaLogin();
			dispose();
		}
	}
}
