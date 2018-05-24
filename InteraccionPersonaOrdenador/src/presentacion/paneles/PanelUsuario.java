package presentacion.paneles;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.border.TitledBorder;

import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JTree;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JSplitPane;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import java.awt.BorderLayout;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;

import java.awt.FlowLayout;
import java.awt.Component;
import javax.swing.Box;
import java.awt.ComponentOrientation;
import javax.swing.JTextArea;

public class PanelUsuario extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Create the panel.
	 */
	public PanelUsuario() {
		setLayout(new GridLayout(1, 0, 0, 0));
		
		JSplitPane splitPane = new JSplitPane();
		add(splitPane);
		
		JPanel panel_1 = new JPanel();
		splitPane.setLeftComponent(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JTree tree = new JTree();
		tree.setFont(new Font("Arial Narrow", Font.PLAIN, 30));
		tree.setBorder(new TitledBorder(null, "Personas", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.add(tree, BorderLayout.CENTER);
		
		JSplitPane splitPane_1 = new JSplitPane();
		splitPane.setRightComponent(splitPane_1);
		
		JTree tree_1 = new JTree();
		tree_1.setFont(new Font("Arial Narrow", Font.PLAIN, 30));
		tree_1.setBorder(new TitledBorder(null, "Proyectos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		splitPane_1.setRightComponent(tree_1);
		
		JPanel panel = new JPanel();
		splitPane_1.setLeftComponent(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{62, 84, 0, 0, 0, 0, 0, 106, 0, 0, 126, 451, 0, 0};
		gbl_panel.rowHeights = new int[]{40, 171, 42, 54, 37, 59, 37, 32, 33, 48, 33, 60, 34, 45, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblfoto = new JLabel("");
		lblfoto.setHorizontalTextPosition(SwingConstants.CENTER);
		lblfoto.setHorizontalAlignment(SwingConstants.CENTER);
		lblfoto.setIcon(
				new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/stalin.png")) //$NON-NLS-1$
						.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
		GridBagConstraints gbc_lblfoto = new GridBagConstraints();
		gbc_lblfoto.gridwidth = 2;
		gbc_lblfoto.gridheight = 2;
		gbc_lblfoto.insets = new Insets(0, 0, 5, 5);
		gbc_lblfoto.gridx = 3;
		gbc_lblfoto.gridy = 1;
		panel.add(lblfoto, gbc_lblfoto);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 20));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.SOUTH;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 8;
		gbc_lblNewLabel_1.gridy = 1;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.anchor = GridBagConstraints.SOUTH;
		gbc_textField.gridwidth = 2;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 10;
		gbc_textField.gridy = 1;
		panel.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Apellidos");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 20));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 8;
		gbc_lblNewLabel_2.gridy = 3;
		panel.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.gridwidth = 2;
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 10;
		gbc_textField_1.gridy = 3;
		panel.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JButton btnAñadir = new JButton("Añadir");
		btnAñadir.setToolTipText("Añadir una persona");
		btnAñadir.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnAñadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GridBagConstraints gbc_btnAñadir = new GridBagConstraints();
		gbc_btnAñadir.gridwidth = 2;
		gbc_btnAñadir.gridheight = 2;
		gbc_btnAñadir.fill = GridBagConstraints.BOTH;
		gbc_btnAñadir.insets = new Insets(0, 0, 5, 5);
		gbc_btnAñadir.gridx = 3;
		gbc_btnAñadir.gridy = 5;
		panel.add(btnAñadir, gbc_btnAñadir);
		
		JLabel lblNewLabel_3 = new JLabel("Contraseña");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 20));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 8;
		gbc_lblNewLabel_3.gridy = 5;
		panel.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.gridwidth = 2;
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 10;
		gbc_textField_2.gridy = 5;
		panel.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Email");
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 20));
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 8;
		gbc_lblNewLabel_4.gridy = 7;
		panel.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.gridwidth = 2;
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 10;
		gbc_textField_3.gridy = 7;
		panel.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setToolTipText("Eliminar una persona");
		btnEliminar.setFont(new Font("Arial Black", Font.PLAIN, 20));
		GridBagConstraints gbc_btnEliminar = new GridBagConstraints();
		gbc_btnEliminar.gridheight = 2;
		gbc_btnEliminar.gridwidth = 2;
		gbc_btnEliminar.fill = GridBagConstraints.BOTH;
		gbc_btnEliminar.insets = new Insets(0, 0, 5, 5);
		gbc_btnEliminar.gridx = 3;
		gbc_btnEliminar.gridy = 8;
		panel.add(btnEliminar, gbc_btnEliminar);
		
		JLabel lblNewLabel_5 = new JLabel("Telefono");
		lblNewLabel_5.setFont(new Font("Arial", Font.PLAIN, 20));
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 8;
		gbc_lblNewLabel_5.gridy = 9;
		panel.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		textField_4 = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.gridwidth = 2;
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 10;
		gbc_textField_4.gridy = 9;
		panel.add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setToolTipText("Modificar una persona");
		btnModificar.setFont(new Font("Arial Black", Font.PLAIN, 20));
		GridBagConstraints gbc_btnModificar = new GridBagConstraints();
		gbc_btnModificar.gridheight = 2;
		gbc_btnModificar.gridwidth = 2;
		gbc_btnModificar.fill = GridBagConstraints.BOTH;
		gbc_btnModificar.insets = new Insets(0, 0, 5, 5);
		gbc_btnModificar.gridx = 3;
		gbc_btnModificar.gridy = 11;
		panel.add(btnModificar, gbc_btnModificar);
		
		JLabel lblNewLabel_6 = new JLabel("Rol");
		lblNewLabel_6.setFont(new Font("Arial", Font.PLAIN, 20));
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 8;
		gbc_lblNewLabel_6.gridy = 11;
		panel.add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		textField_5 = new JTextField();
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.gridwidth = 2;
		gbc_textField_5.insets = new Insets(0, 0, 5, 5);
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 10;
		gbc_textField_5.gridy = 11;
		panel.add(textField_5, gbc_textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Comentarios");
		lblNewLabel_7.setFont(new Font("Arial", Font.PLAIN, 20));
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.anchor = GridBagConstraints.NORTH;
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.gridx = 8;
		gbc_lblNewLabel_7.gridy = 13;
		panel.add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		JTextArea textArea = new JTextArea();
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.fill = GridBagConstraints.BOTH;
		gbc_textArea.gridheight = 2;
		gbc_textArea.gridwidth = 2;
		gbc_textArea.insets = new Insets(0, 0, 0, 5);
		gbc_textArea.gridx = 10;
		gbc_textArea.gridy = 13;
		panel.add(textArea, gbc_textArea);
		splitPane_1.setDividerLocation(1300);
		splitPane.setDividerLocation(300);

	}
}
