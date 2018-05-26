package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class VentanaAjustes extends JFrame {

	private JPanel contentPane;
	private JPanel panel_principal;
	private JLabel labelIdioma;
	private JComboBox comboBox;
	private JButton btnAceptar;
	private JButton btnCancelar;

	/**
	 * Launch the application.

	/**
	 * Create the frame.
	 */
	public VentanaAjustes() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaAjustes.class.getResource("/iconos/camera-settings-cogwheel.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 289);
		setLocationRelativeTo(null);
		setTitle("Ajustes");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		{
			panel_principal = new JPanel();
			panel_principal.setBorder(new LineBorder(new Color(0, 0, 0)));
			contentPane.add(panel_principal, BorderLayout.CENTER);
			GridBagLayout gbl_panel_principal = new GridBagLayout();
			gbl_panel_principal.columnWidths = new int[]{25, 22, 32, 39, 68, 77, 52, 57, 0, 0};
			gbl_panel_principal.rowHeights = new int[]{54, 29, 45, 40, 51, 0};
			gbl_panel_principal.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			gbl_panel_principal.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			panel_principal.setLayout(gbl_panel_principal);
			{
				labelIdioma = new JLabel("Seleccione el idioma:");
				GridBagConstraints gbc_labelIdioma = new GridBagConstraints();
				gbc_labelIdioma.fill = GridBagConstraints.BOTH;
				gbc_labelIdioma.gridwidth = 3;
				gbc_labelIdioma.insets = new Insets(0, 0, 5, 5);
				gbc_labelIdioma.gridx = 2;
				gbc_labelIdioma.gridy = 2;
				panel_principal.add(labelIdioma, gbc_labelIdioma);
			}
			{
				comboBox = new JComboBox();
				comboBox.setModel(new DefaultComboBoxModel(new String[] {"Español", "Inglés"}));
				GridBagConstraints gbc_comboBox = new GridBagConstraints();
				gbc_comboBox.gridwidth = 3;
				gbc_comboBox.insets = new Insets(0, 0, 5, 5);
				gbc_comboBox.fill = GridBagConstraints.BOTH;
				gbc_comboBox.gridx = 5;
				gbc_comboBox.gridy = 2;
				panel_principal.add(comboBox, gbc_comboBox);
			}
			{
				btnCancelar = new JButton("Cancelar");
				btnCancelar.addActionListener(new BtnCancelarActionListener());
				GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
				gbc_btnCancelar.fill = GridBagConstraints.BOTH;
				gbc_btnCancelar.gridwidth = 4;
				gbc_btnCancelar.insets = new Insets(0, 0, 0, 5);
				gbc_btnCancelar.gridx = 1;
				gbc_btnCancelar.gridy = 4;
				panel_principal.add(btnCancelar, gbc_btnCancelar);
			}
			{
				btnAceptar = new JButton("Aceptar");
				GridBagConstraints gbc_btnAceptar = new GridBagConstraints();
				gbc_btnAceptar.fill = GridBagConstraints.BOTH;
				gbc_btnAceptar.gridwidth = 3;
				gbc_btnAceptar.insets = new Insets(0, 0, 0, 5);
				gbc_btnAceptar.gridx = 5;
				gbc_btnAceptar.gridy = 4;
				panel_principal.add(btnAceptar, gbc_btnAceptar);
			}
		}
	}

	private class BtnCancelarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			dispose();
		}
	}
}
