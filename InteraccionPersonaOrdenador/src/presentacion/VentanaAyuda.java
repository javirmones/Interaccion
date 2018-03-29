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

public class VentanaAyuda extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JTextArea textArea;
	private JButton btnCerrar;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 519, 473);
		contentPane = new JPanel();
		contentPane.setFocusable(false);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		{
			panel = new JPanel();
			contentPane.add(panel, BorderLayout.SOUTH);
			GridBagLayout gbl_panel = new GridBagLayout();
			gbl_panel.columnWidths = new int[]{164, 0, 0, 68, 0, 0, 129, 0};
			gbl_panel.rowHeights = new int[]{0, 54, 72, 63, 69, 63, 57, 0};
			gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			gbl_panel.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			panel.setLayout(gbl_panel);
			{
				textArea = new JTextArea();
				GridBagConstraints gbc_textArea = new GridBagConstraints();
				gbc_textArea.gridwidth = 7;
				gbc_textArea.gridheight = 6;
				gbc_textArea.insets = new Insets(0, 0, 5, 0);
				gbc_textArea.fill = GridBagConstraints.BOTH;
				gbc_textArea.gridx = 0;
				gbc_textArea.gridy = 0;
				panel.add(textArea, gbc_textArea);
			}
			{
				btnCerrar = new JButton("Cerrar");
				btnCerrar.addActionListener(new BtnCerrarActionListener());
				GridBagConstraints gbc_btnCerrar = new GridBagConstraints();
				gbc_btnCerrar.gridwidth = 3;
				gbc_btnCerrar.insets = new Insets(0, 0, 0, 5);
				gbc_btnCerrar.gridx = 1;
				gbc_btnCerrar.gridy = 6;
				panel.add(btnCerrar, gbc_btnCerrar);
			}
		}
	}

	private class BtnCerrarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
		}
	}
}
