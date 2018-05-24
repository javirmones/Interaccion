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
import javax.swing.SwingConstants;

public class VentanaAyuda extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_1;
	private JLabel lblNewLabel;
	private JLabel lblEnlaceAUna;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public VentanaAyuda() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaAyuda.class.getResource("/iconos/rate-star-button.png")));
		setResizable(false);
		setTitle("Ayuda");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 460, 324);
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
			contentPane.add(panel_1, BorderLayout.CENTER);
			GridBagLayout gbl_panel_1 = new GridBagLayout();
			gbl_panel_1.columnWidths = new int[]{32, 393, 0, 0};
			gbl_panel_1.rowHeights = new int[]{61, 38, 54, 65, 0};
			gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
			gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			panel_1.setLayout(gbl_panel_1);
			{
				lblNewLabel = new JLabel("Ayuda");
				lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
				GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
				gbc_lblNewLabel.fill = GridBagConstraints.VERTICAL;
				gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
				gbc_lblNewLabel.gridx = 1;
				gbc_lblNewLabel.gridy = 1;
				panel_1.add(lblNewLabel, gbc_lblNewLabel);
			}
			{
				lblEnlaceAUna = new JLabel("www.vaporware.com/GPProfesional/manualusuario");
				lblEnlaceAUna.setHorizontalAlignment(SwingConstants.CENTER);
				lblEnlaceAUna.setForeground(Color.CYAN);
				GridBagConstraints gbc_lblEnlaceAUna = new GridBagConstraints();
				gbc_lblEnlaceAUna.insets = new Insets(0, 0, 0, 5);
				gbc_lblEnlaceAUna.fill = GridBagConstraints.BOTH;
				gbc_lblEnlaceAUna.gridx = 1;
				gbc_lblEnlaceAUna.gridy = 3;
				panel_1.add(lblEnlaceAUna, gbc_lblEnlaceAUna);
			}
		}
	}
}
