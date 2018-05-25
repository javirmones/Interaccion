package presentacion.paneles;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionListener;

import dominio.Usuario;
import persistencia.GestorUsuarios;

import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;
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
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;

import java.awt.FlowLayout;
import java.awt.Component;
import javax.swing.Box;
import java.awt.ComponentOrientation;
import javax.swing.JTextArea;
import javax.swing.event.ListSelectionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelUsuario extends JPanel {
	private JTextField textNombre;
	private JTextField textApellidos;
	private JTextField textContraseña;
	private JTextField textEmail;
	private JTextField textTelefono;
	private JTextField textRol;
	private GestorUsuarios u = new GestorUsuarios();
	private JLabel lblfoto;
	JTextArea textComentarios;

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

		JList<Usuario> listUsuarios = new JList();
		listUsuarios.setFont(new Font("Arial", Font.PLAIN, 20));
		listUsuarios.setModel(u.getLista());
		panel_1.add(listUsuarios, BorderLayout.CENTER);
		listUsuarios.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				Usuario u = listUsuarios.getSelectedValue();
				if (u!=null) {
				textNombre.setText(u.getNombre());
				textApellidos.setText(u.getApellidos());
				textContraseña.setText(u.getContraseña());
				textEmail.setText(u.getEmail());
				textTelefono.setText(String.valueOf(u.getTelf()));
				textRol.setText(u.getRolPrincipal());
				lblfoto.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(u.getImagen()))
						.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
				}else {
					textNombre.setText("");
					textApellidos.setText("");
					textContraseña.setText("");
					textEmail.setText("");
					textTelefono.setText("");
					textRol.setText("");
					lblfoto.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/x.png"))
							.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
				}

			}
		});

		JSplitPane splitPane_1 = new JSplitPane();
		splitPane.setRightComponent(splitPane_1);

		JTree tree_1 = new JTree();
		tree_1.setFont(new Font("Arial Narrow", Font.PLAIN, 30));
		tree_1.setBorder(new TitledBorder(null, "Proyectos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		splitPane_1.setRightComponent(tree_1);

		JPanel panel = new JPanel();
		splitPane_1.setLeftComponent(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 62, 84, 0, 0, 0, 0, 0, 106, 0, 0, 126, 451, 0, 0 };
		gbl_panel.rowHeights = new int[] { 40, 171, 42, 54, 37, 59, 37, 32, 33, 48, 33, 60, 34, 45, 0, 0 };
		gbl_panel.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0,
				Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		lblfoto = new JLabel("");
		lblfoto.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/x.png")).getImage()
				.getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
		lblfoto.setHorizontalTextPosition(SwingConstants.CENTER);
		lblfoto.setHorizontalAlignment(SwingConstants.CENTER);

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

		textNombre = new JTextField();
		GridBagConstraints gbc_textNombre = new GridBagConstraints();
		gbc_textNombre.anchor = GridBagConstraints.SOUTH;
		gbc_textNombre.gridwidth = 2;
		gbc_textNombre.insets = new Insets(0, 0, 5, 5);
		gbc_textNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNombre.gridx = 10;
		gbc_textNombre.gridy = 1;
		panel.add(textNombre, gbc_textNombre);
		textNombre.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Apellidos");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 20));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 8;
		gbc_lblNewLabel_2.gridy = 3;
		panel.add(lblNewLabel_2, gbc_lblNewLabel_2);

		textApellidos = new JTextField();
		GridBagConstraints gbc_textApellidos = new GridBagConstraints();
		gbc_textApellidos.gridwidth = 2;
		gbc_textApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_textApellidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_textApellidos.gridx = 10;
		gbc_textApellidos.gridy = 3;
		panel.add(textApellidos, gbc_textApellidos);
		textApellidos.setColumns(10);

		JButton btnAñadir = new JButton("Añadir");
		btnAñadir.setToolTipText("Añadir una persona");
		btnAñadir.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnAñadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean emailInvalido = true;
				boolean nEncontrado = true;
				DefaultListModel<Usuario> users = u.getLista();
				for (int i = 0; i < users.size(); i++) {
					if (textEmail.getText().equals(users.getElementAt(i).getEmail())) {
							nEncontrado = false;
					
				}}
				if (nEncontrado) {
					Usuario x = new Usuario( textNombre.getText(), textApellidos.getText(), textEmail.getText(),
							textContraseña.getText(), Integer.parseInt(textTelefono.getText()), textRol.getText(),
							textComentarios.getText(), "");
					u.ActualizarList(x);
					emailInvalido = false;
				}
				if (emailInvalido) {
					JOptionPane.showMessageDialog(null, "Usuario ya existente");

				}
				}
			}
		);
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

		textContraseña = new JTextField();
		GridBagConstraints gbc_textContraseña = new GridBagConstraints();
		gbc_textContraseña.gridwidth = 2;
		gbc_textContraseña.insets = new Insets(0, 0, 5, 5);
		gbc_textContraseña.fill = GridBagConstraints.HORIZONTAL;
		gbc_textContraseña.gridx = 10;
		gbc_textContraseña.gridy = 5;
		panel.add(textContraseña, gbc_textContraseña);
		textContraseña.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("Email");
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 20));
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 8;
		gbc_lblNewLabel_4.gridy = 7;
		panel.add(lblNewLabel_4, gbc_lblNewLabel_4);

		textEmail = new JTextField();
		GridBagConstraints gbc_textEmail = new GridBagConstraints();
		gbc_textEmail.gridwidth = 2;
		gbc_textEmail.insets = new Insets(0, 0, 5, 5);
		gbc_textEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_textEmail.gridx = 10;
		gbc_textEmail.gridy = 7;
		panel.add(textEmail, gbc_textEmail);
		textEmail.setColumns(10);

		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Usuario x = listUsuarios.getSelectedValue();
				DefaultListModel<Usuario> users = u.getLista();
				users.removeElement(x);		

			}
		});
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

		textTelefono = new JTextField();
		GridBagConstraints gbc_textTelefono = new GridBagConstraints();
		gbc_textTelefono.gridwidth = 2;
		gbc_textTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_textTelefono.fill = GridBagConstraints.HORIZONTAL;
		gbc_textTelefono.gridx = 10;
		gbc_textTelefono.gridy = 9;
		panel.add(textTelefono, gbc_textTelefono);
		textTelefono.setColumns(10);

		JButton btnModificar = new JButton("Modificar");
		btnModificar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Usuario u = listUsuarios.getSelectedValue();
				u.setNombre(textNombre.getText());
				u.setApellidos(textApellidos.getText());
				u.setEmail(textEmail.getText());
				u.setContraseña(textContraseña.getText());
				u.setTelf(Integer.parseInt(textTelefono.getText()));
				u.setRolPrincipal(textRol.getText());
				u.setConocimientos(textComentarios.getText());
				
			}
		});
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

		textRol = new JTextField();
		GridBagConstraints gbc_textRol = new GridBagConstraints();
		gbc_textRol.gridwidth = 2;
		gbc_textRol.insets = new Insets(0, 0, 5, 5);
		gbc_textRol.fill = GridBagConstraints.HORIZONTAL;
		gbc_textRol.gridx = 10;
		gbc_textRol.gridy = 11;
		panel.add(textRol, gbc_textRol);
		textRol.setColumns(10);

		JLabel lblNewLabel_7 = new JLabel("Comentarios");
		lblNewLabel_7.setFont(new Font("Arial", Font.PLAIN, 20));
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.anchor = GridBagConstraints.NORTH;
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.gridx = 8;
		gbc_lblNewLabel_7.gridy = 13;
		panel.add(lblNewLabel_7, gbc_lblNewLabel_7);

		textComentarios = new JTextArea();
		GridBagConstraints gbc_textComentarios = new GridBagConstraints();
		gbc_textComentarios.fill = GridBagConstraints.BOTH;
		gbc_textComentarios.gridheight = 2;
		gbc_textComentarios.gridwidth = 2;
		gbc_textComentarios.insets = new Insets(0, 0, 0, 5);
		gbc_textComentarios.gridx = 10;
		gbc_textComentarios.gridy = 13;
		panel.add(textComentarios, gbc_textComentarios);
		splitPane_1.setDividerLocation(1300);
		splitPane.setDividerLocation(300);

	}
}
