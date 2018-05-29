package presentacion.paneles;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class PanelBotones extends JPanel {
	private JButton btnNuevo;
	private JButton btnEditar;
	private JButton btnEliminar;

	/**
	 * Create the panel.
	 */
	public PanelBotones(String opcion) {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{188, 197, 205, 0};
		gridBagLayout.rowHeights = new int[]{58, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		{
			btnNuevo = new JButton("Nuevo");
			btnNuevo.setIcon(new ImageIcon(PanelBotones.class.getResource("/iconos/add-filled-cross-sign.png")));
			btnNuevo.addActionListener(new BtnNuevoActionListener());
			GridBagConstraints gbc_btnNuevo = new GridBagConstraints();
			gbc_btnNuevo.fill = GridBagConstraints.BOTH;
			gbc_btnNuevo.insets = new Insets(0, 0, 0, 5);
			gbc_btnNuevo.gridx = 0;
			gbc_btnNuevo.gridy = 0;
			add(btnNuevo, gbc_btnNuevo);
		}
		{
			btnEditar = new JButton("Editar");
			btnEditar.setIcon(new ImageIcon(PanelBotones.class.getResource("/iconos/edit-draw-pencil.png")));
			btnEditar.addActionListener(new BtnEditarActionListener());
			GridBagConstraints gbc_btnEditar = new GridBagConstraints();
			gbc_btnEditar.fill = GridBagConstraints.BOTH;
			gbc_btnEditar.insets = new Insets(0, 0, 0, 5);
			gbc_btnEditar.gridx = 1;
			gbc_btnEditar.gridy = 0;
			add(btnEditar, gbc_btnEditar);
		}
		{
			btnEliminar = new JButton("Eliminar");
			btnEliminar.setIcon(new ImageIcon(PanelBotones.class.getResource("/iconos/waste-bin.png")));
			btnEliminar.addActionListener(new BtnEliminarActionListener());
			GridBagConstraints gbc_btnEliminar = new GridBagConstraints();
			gbc_btnEliminar.fill = GridBagConstraints.BOTH;
			gbc_btnEliminar.gridx = 2;
			gbc_btnEliminar.gridy = 0;
			add(btnEliminar, gbc_btnEliminar);
		}

	}

	private class BtnNuevoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			
		}
	}
	private class BtnEditarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class BtnEliminarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
		}
	}
}
