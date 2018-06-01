package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

import dominio.Usuario;
import presentacion.paneles.MessagesSubTarea;
import presentacion.paneles.MessagesTarea;
import presentacion.paneles.MessagesUsuario;
import presentacion.paneles.MessagesVProyectos;
import presentacion.paneles.MessagesVentanaPInicial;


import java.awt.Color;

public class VentanaAjustes extends JFrame {

	private JPanel contentPane;
	private JPanel panel_principal;
	private JLabel labelIdioma;
	private JComboBox comboBox;
	private JButton btnAceptar;
	private JButton btnCancelar;
	private Usuario u;
	private JFrame ventana;

	/**
	 * Launch the application.
	 * 
	 * /** Create the frame.
	 */
	public VentanaAjustes(JFrame ventana,Usuario u) {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(VentanaAjustes.class.getResource("/iconos/camera-settings-cogwheel.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 289);
		setLocationRelativeTo(null);
		setTitle(MessagesVajustes.getString("VentanaAjustes.this.title")); //$NON-NLS-1$
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		{
			panel_principal = new JPanel();
			panel_principal.setBorder(new LineBorder(new Color(0, 0, 0)));
			contentPane.add(panel_principal, BorderLayout.CENTER);
			GridBagLayout gbl_panel_principal = new GridBagLayout();
			gbl_panel_principal.columnWidths = new int[] { 25, 22, 32, 39, 68, 77, 52, 57, 0, 0 };
			gbl_panel_principal.rowHeights = new int[] { 54, 29, 45, 40, 51, 0 };
			gbl_panel_principal.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
					Double.MIN_VALUE };
			gbl_panel_principal.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
			panel_principal.setLayout(gbl_panel_principal);
			{
				labelIdioma = new JLabel(MessagesVajustes.getString("VentanaAjustes.labelIdioma.text")); //$NON-NLS-1$
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
				comboBox.setToolTipText("Seleccione un idioma");
				GridBagConstraints gbc_comboBox = new GridBagConstraints();
				gbc_comboBox.gridwidth = 3;
				gbc_comboBox.insets = new Insets(0, 0, 5, 5);
				gbc_comboBox.fill = GridBagConstraints.BOTH;
				gbc_comboBox.gridx = 5;
				gbc_comboBox.gridy = 2;
				panel_principal.add(comboBox, gbc_comboBox);
			}
			{
				btnCancelar = new JButton(MessagesVajustes.getString("VentanaAjustes.btnCancelar.text")); //$NON-NLS-1$
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
				btnAceptar = new JButton(MessagesVajustes.getString("VentanaAjustes.btnAceptar.text")); //$NON-NLS-1$
				btnAceptar.addActionListener(new BtnAceptarActionListener());
				GridBagConstraints gbc_btnAceptar = new GridBagConstraints();
				gbc_btnAceptar.fill = GridBagConstraints.BOTH;
				gbc_btnAceptar.gridwidth = 3;
				gbc_btnAceptar.insets = new Insets(0, 0, 0, 5);
				gbc_btnAceptar.gridx = 5;
				gbc_btnAceptar.gridy = 4;
				panel_principal.add(btnAceptar, gbc_btnAceptar);
			}
		}
		this.ventana = ventana;
		this.u=u;
	}

	private class BtnCancelarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			dispose();
		}
	}

	private class BtnAceptarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			if (comboBox.getSelectedItem().equals("Inglés")) {
				MessagesVentanaAyuda.setIdioma("inglés");
				MessagesVajustes.setIdioma("inglés");
				MessagesVentanaCreditos.setIdioma("inglés");
				MessagesVentanaPrincipal.setIdioma("inglés");
				MessagesVentanaMensaje.setIdioma("inglés");
				MessagesVLogin.setIdioma("inglés");
				MessagesSubTarea.setIdioma("inglés");
				MessagesTarea.setIdioma("inglés");
				MessagesUsuario.setIdioma("inglés");
				MessagesVentanaPInicial.setIdioma("inglés");
				MessagesVProyectos.setIdioma("inglés");

				JOptionPane.showMessageDialog(rootPane, "English has been selected as default language.",
						"Changes saved", JOptionPane.INFORMATION_MESSAGE);

			} else if (comboBox.getSelectedItem().equals("Español")) {
				MessagesVentanaAyuda.setIdioma("es");
				MessagesVajustes.setIdioma("es");
				MessagesVentanaCreditos.setIdioma("es");
				MessagesVentanaPrincipal.setIdioma("es");
				MessagesVentanaMensaje.setIdioma("es");
				MessagesVLogin.setIdioma("es");
				MessagesSubTarea.setIdioma("es");
				MessagesTarea.setIdioma("es");
				MessagesUsuario.setIdioma("es");
				MessagesVentanaPInicial.setIdioma("es");
				MessagesVProyectos.setIdioma("es");
				JOptionPane.showMessageDialog(rootPane,
						"El idioma español ha sido seleccionado como lenguaje principal.", "Cambios guardados",
						JOptionPane.INFORMATION_MESSAGE);

			}
			openWindow();
		}
	}

	private void openWindow() {
		if (ventana instanceof VentanaPrincipal) {
			 try {
				VentanaPrincipal mw = new VentanaPrincipal(u);
				mw.setExtendedState(JFrame.MAXIMIZED_BOTH);
				mw.setVisible(true);
				ventana.dispose();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		} else if (ventana instanceof VentanaLogin) {
			VentanaLogin lw = new VentanaLogin();
			lw.setVisible(true);
			ventana.dispose();
		}
		dispose();
	}
}
