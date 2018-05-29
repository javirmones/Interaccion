package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.Desktop;

import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class VentanaAyuda extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_1;
	private JLabel lblNewLabel;
	private JLabel lblEnlaceAUna;
	private JLabel lblParaMsInformacin;
	private JLabel lblNewLabel_1;
	private JLabel lblCdigo;
	private JLabel lblHttpsgithubcomjavirmonesinteraccion;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public VentanaAyuda() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaAyuda.class.getResource("/iconos/question-mark.png")));
		setResizable(false);
		setTitle("Ayuda");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 552, 324);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setFocusable(false);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		{
			panel = new JPanel();
			contentPane.add(panel, BorderLayout.SOUTH);
			{
				panel.setLayout(null);
			}
		}
		{
			panel_1 = new JPanel();
			panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
			contentPane.add(panel_1, BorderLayout.CENTER);
			GridBagLayout gbl_panel_1 = new GridBagLayout();
			gbl_panel_1.columnWidths = new int[]{32, 128, 202, 13, 0, 40, 0};
			gbl_panel_1.rowHeights = new int[]{61, 38, 54, 29, 41, 33, 0};
			gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			panel_1.setLayout(gbl_panel_1);
			{
				lblNewLabel = new JLabel("Ayuda");
				lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
				GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
				gbc_lblNewLabel.gridwidth = 6;
				gbc_lblNewLabel.fill = GridBagConstraints.VERTICAL;
				gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
				gbc_lblNewLabel.gridx = 0;
				gbc_lblNewLabel.gridy = 0;
				panel_1.add(lblNewLabel, gbc_lblNewLabel);
			}
			{
				lblParaMsInformacin = new JLabel("Para más información sobre la aplicación consulte en:");
				GridBagConstraints gbc_lblParaMsInformacin = new GridBagConstraints();
				gbc_lblParaMsInformacin.gridwidth = 6;
				gbc_lblParaMsInformacin.insets = new Insets(0, 0, 5, 0);
				gbc_lblParaMsInformacin.gridx = 0;
				gbc_lblParaMsInformacin.gridy = 2;
				panel_1.add(lblParaMsInformacin, gbc_lblParaMsInformacin);
			}
			{
				lblEnlaceAUna = new JLabel("https://github.com/javirmones/Interaccion/wiki");
				lblEnlaceAUna.addMouseListener(new LblEnlaceAUnaMouseListener());
				{
					lblNewLabel_1 = new JLabel("Documentación");
					GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
					gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
					gbc_lblNewLabel_1.gridx = 1;
					gbc_lblNewLabel_1.gridy = 4;
					panel_1.add(lblNewLabel_1, gbc_lblNewLabel_1);
				}
				lblEnlaceAUna.setHorizontalAlignment(SwingConstants.CENTER);
				lblEnlaceAUna.setForeground(Color.CYAN);
				GridBagConstraints gbc_lblEnlaceAUna = new GridBagConstraints();
				gbc_lblEnlaceAUna.insets = new Insets(0, 0, 5, 0);
				gbc_lblEnlaceAUna.gridwidth = 4;
				gbc_lblEnlaceAUna.fill = GridBagConstraints.VERTICAL;
				gbc_lblEnlaceAUna.gridx = 2;
				gbc_lblEnlaceAUna.gridy = 4;
				panel_1.add(lblEnlaceAUna, gbc_lblEnlaceAUna);
			}
			{
				lblCdigo = new JLabel("Código");
				GridBagConstraints gbc_lblCdigo = new GridBagConstraints();
				gbc_lblCdigo.insets = new Insets(0, 0, 0, 5);
				gbc_lblCdigo.gridx = 1;
				gbc_lblCdigo.gridy = 5;
				panel_1.add(lblCdigo, gbc_lblCdigo);
			}
			{
				lblHttpsgithubcomjavirmonesinteraccion = new JLabel("https://github.com/javirmones/Interaccion");
				lblHttpsgithubcomjavirmonesinteraccion.addMouseListener(new LblHttpsgithubcomjavirmonesinteraccionMouseListener());
				lblHttpsgithubcomjavirmonesinteraccion.setHorizontalAlignment(SwingConstants.CENTER);
				lblHttpsgithubcomjavirmonesinteraccion.setForeground(Color.CYAN);
				GridBagConstraints gbc_lblHttpsgithubcomjavirmonesinteraccion = new GridBagConstraints();
				gbc_lblHttpsgithubcomjavirmonesinteraccion.gridwidth = 4;
				gbc_lblHttpsgithubcomjavirmonesinteraccion.insets = new Insets(0, 0, 0, 5);
				gbc_lblHttpsgithubcomjavirmonesinteraccion.gridx = 2;
				gbc_lblHttpsgithubcomjavirmonesinteraccion.gridy = 5;
				panel_1.add(lblHttpsgithubcomjavirmonesinteraccion, gbc_lblHttpsgithubcomjavirmonesinteraccion);
			}
		}
	}
	private class LblEnlaceAUnaMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent arg0) {
			if(Desktop.isDesktopSupported()) {
				Desktop desktop = Desktop.getDesktop();
				if(desktop.isSupported(Desktop.Action.BROWSE)) {
					try {
						desktop.browse(new URI("https://github.com/javirmones/Interaccion/wiki"));
					} catch (IOException | URISyntaxException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			}
		}
	}
	private class LblHttpsgithubcomjavirmonesinteraccionMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			if(Desktop.isDesktopSupported()) {
				Desktop desktop = Desktop.getDesktop();
				if(desktop.isSupported(Desktop.Action.BROWSE)) {
					try {
						desktop.browse(new URI("https://github.com/javirmones/Interaccion"));
					} catch (IOException | URISyntaxException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
			}
		}
	}
}
