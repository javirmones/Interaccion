package presentacion.paneles;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionListener;

import dominio.Usuario;
import herramientas.ControlDatos;
import persistencia.GestorUsuarios;
import presentacion.VentanaMensaje;
import presentacion.personalizado.ArbolRenderizado;
import presentacion.personalizado.ImageFilter;

import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.TextArea;

import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTree;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JSplitPane;
import javax.swing.JButton;
import javax.swing.JFileChooser;
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
import java.io.File;

public class PanelUsuario extends JPanel {
	private JTextField textNombre;
	private JTextField textApellidos;
	private JTextField textContraseña;
	private JTextField textEmail;
	private JTextField textTelefono;
	private JTextField textRol;
	JTextArea textAreaComentarios;
	private GestorUsuarios u = new GestorUsuarios();
	private JLabel lblfoto;
	private Usuario user1;

	/**
	 * Create the panel.
	 */
	public PanelUsuario(Usuario user) {
		setLayout(new GridLayout(1, 0, 0, 0));

		JSplitPane splitPane = new JSplitPane();
		add(splitPane);

		JPanel panel_personas = new JPanel();
		splitPane.setLeftComponent(panel_personas);
		panel_personas.setLayout(new BorderLayout(0, 0));

		JList<Usuario> listUsuarios = new JList();
		listUsuarios.setBorder(new TitledBorder(null, "Personas", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		listUsuarios.setFont(new Font("Arial Narrow", Font.PLAIN, 30));

		JSplitPane splitPane_division = new JSplitPane();
		splitPane.setRightComponent(splitPane_division);

		JTree tree_proyectos = new JTree();
		tree_proyectos.setShowsRootHandles(true);
		tree_proyectos.setRootVisible(false);
		tree_proyectos.setModel(ControlDatos.generateProjectTreeModel());
		for(int i=0;i<tree_proyectos.getRowCount(); i++) {
			tree_proyectos.expandRow(i);
		}
		tree_proyectos.setCellRenderer(new ArbolRenderizado());
		tree_proyectos.setFont(new Font("Arial Narrow", Font.PLAIN, 20));
		tree_proyectos
				.setBorder(new TitledBorder(null, "Proyectos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		splitPane_division.setRightComponent(tree_proyectos);

		JPanel panel_principal = new JPanel();
		splitPane_division.setLeftComponent(panel_principal);
		GridBagLayout gbl_panel_principal = new GridBagLayout();
		gbl_panel_principal.columnWidths = new int[] { 62, 84, 0, 0, 53, 0, 106, 0, 0, 126, 386, 0, 0 };
		gbl_panel_principal.rowHeights = new int[] { 40, 0, 0, 134, 42, 38, 39, 38, 37, 34, 46, 32, 33, 42, 33, 32, 35, 42, 0, 23, 23,
				40, 46, 0, 22, 0 };
		gbl_panel_principal.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0,
				Double.MIN_VALUE };
		gbl_panel_principal.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel_principal.setLayout(gbl_panel_principal);

		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridheight = 8;
		gbc_scrollPane.gridwidth = 5;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 0;
		panel_principal.add(scrollPane, gbc_scrollPane);

		lblfoto = new JLabel("");
		lblfoto.setBorder(new TitledBorder(null, "Foto", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		scrollPane.setViewportView(lblfoto);
		lblfoto.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/x.png")).getImage()
				.getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
		lblfoto.setHorizontalTextPosition(SwingConstants.CENTER);
		lblfoto.setHorizontalAlignment(SwingConstants.CENTER);

		JButton btnAñadir = new JButton("Añadir");
		btnAñadir.setIcon(new ImageIcon(PanelUsuario.class.getResource("/iconos/add-filled-cross-sign.png")));
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

					}
				}
				if (nEncontrado) {
					Usuario x = new Usuario(textNombre.getText(), textApellidos.getText(), textEmail.getText(),
							textContraseña.getText(), Integer.parseInt(textTelefono.getText()), textRol.getText(),
							textAreaComentarios.getText(), "");
					u.ActualizarList(x);
					emailInvalido = false;
				}
				if (emailInvalido) {
					JOptionPane.showMessageDialog(null, "Usuario ya existente");

				}
			}
		});
				
						JLabel lblNewLabel_1 = new JLabel("Nombre");
						lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 20));
						GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
						gbc_lblNewLabel_1.anchor = GridBagConstraints.SOUTH;
						gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
						gbc_lblNewLabel_1.gridx = 7;
						gbc_lblNewLabel_1.gridy = 3;
						panel_principal.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
				JButton btnSubirImg = new JButton("Subir imagen");
				btnSubirImg.setIcon(new ImageIcon(PanelUsuario.class.getResource("/iconos/file-in-folder.png")));
				btnSubirImg.addActionListener(new BtnNewButtonActionListener());
				
						textNombre = new JTextField();
						GridBagConstraints gbc_textNombre = new GridBagConstraints();
						gbc_textNombre.anchor = GridBagConstraints.SOUTH;
						gbc_textNombre.gridwidth = 2;
						gbc_textNombre.insets = new Insets(0, 0, 5, 5);
						gbc_textNombre.fill = GridBagConstraints.HORIZONTAL;
						gbc_textNombre.gridx = 9;
						gbc_textNombre.gridy = 3;
						panel_principal.add(textNombre, gbc_textNombre);
						textNombre.setColumns(10);
				
						JLabel lblApellidos = new JLabel("Apellidos");
						lblApellidos.setFont(new Font("Arial", Font.PLAIN, 20));
						GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
						gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
						gbc_lblApellidos.gridx = 7;
						gbc_lblApellidos.gridy = 5;
						panel_principal.add(lblApellidos, gbc_lblApellidos);
				
						textApellidos = new JTextField();
						GridBagConstraints gbc_textApellidos = new GridBagConstraints();
						gbc_textApellidos.gridwidth = 2;
						gbc_textApellidos.insets = new Insets(0, 0, 5, 5);
						gbc_textApellidos.fill = GridBagConstraints.HORIZONTAL;
						gbc_textApellidos.gridx = 9;
						gbc_textApellidos.gridy = 5;
						panel_principal.add(textApellidos, gbc_textApellidos);
						textApellidos.setColumns(10);
				
						JLabel lblContra = new JLabel("Contraseña");
						lblContra.setFont(new Font("Arial", Font.PLAIN, 20));
						GridBagConstraints gbc_lblContra = new GridBagConstraints();
						gbc_lblContra.insets = new Insets(0, 0, 5, 5);
						gbc_lblContra.gridx = 7;
						gbc_lblContra.gridy = 7;
						panel_principal.add(lblContra, gbc_lblContra);
				
						textContraseña = new JTextField();
						GridBagConstraints gbc_textContraseña = new GridBagConstraints();
						gbc_textContraseña.gridwidth = 2;
						gbc_textContraseña.insets = new Insets(0, 0, 5, 5);
						gbc_textContraseña.fill = GridBagConstraints.HORIZONTAL;
						gbc_textContraseña.gridx = 9;
						gbc_textContraseña.gridy = 7;
						panel_principal.add(textContraseña, gbc_textContraseña);
						textContraseña.setColumns(10);
				btnSubirImg.setFont(new Font("Arial Black", Font.BOLD, 20));
				GridBagConstraints gbc_btnSubirImg = new GridBagConstraints();
				gbc_btnSubirImg.fill = GridBagConstraints.BOTH;
				gbc_btnSubirImg.gridwidth = 5;
				gbc_btnSubirImg.insets = new Insets(0, 0, 5, 5);
				gbc_btnSubirImg.gridx = 1;
				gbc_btnSubirImg.gridy = 8;
				panel_principal.add(btnSubirImg, gbc_btnSubirImg);
		
				JLabel lblEmail = new JLabel("Email");
				lblEmail.setFont(new Font("Arial", Font.PLAIN, 20));
				GridBagConstraints gbc_lblEmail = new GridBagConstraints();
				gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
				gbc_lblEmail.gridx = 7;
				gbc_lblEmail.gridy = 9;
				panel_principal.add(lblEmail, gbc_lblEmail);
		
				textEmail = new JTextField();
				GridBagConstraints gbc_textEmail = new GridBagConstraints();
				gbc_textEmail.gridwidth = 2;
				gbc_textEmail.insets = new Insets(0, 0, 5, 5);
				gbc_textEmail.fill = GridBagConstraints.HORIZONTAL;
				gbc_textEmail.gridx = 9;
				gbc_textEmail.gridy = 9;
				panel_principal.add(textEmail, gbc_textEmail);
				textEmail.setColumns(10);
		GridBagConstraints gbc_btnAñadir = new GridBagConstraints();
		gbc_btnAñadir.gridwidth = 5;
		gbc_btnAñadir.gridheight = 2;
		gbc_btnAñadir.fill = GridBagConstraints.BOTH;
		gbc_btnAñadir.insets = new Insets(0, 0, 5, 5);
		gbc_btnAñadir.gridx = 1;
		gbc_btnAñadir.gridy = 10;
		panel_principal.add(btnAñadir, gbc_btnAñadir);

		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setIcon(new ImageIcon(PanelUsuario.class.getResource("/iconos/waste-bin.png")));
		btnEliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Usuario x = listUsuarios.getSelectedValue();
				DefaultListModel<Usuario> users = u.getLista();
				users.removeElement(x);

			}
		});
		
				JLabel lblTlf = new JLabel("Telefono");
				lblTlf.setFont(new Font("Arial", Font.PLAIN, 20));
				GridBagConstraints gbc_lblTlf = new GridBagConstraints();
				gbc_lblTlf.insets = new Insets(0, 0, 5, 5);
				gbc_lblTlf.gridx = 7;
				gbc_lblTlf.gridy = 11;
				panel_principal.add(lblTlf, gbc_lblTlf);
		
				textTelefono = new JTextField();
				GridBagConstraints gbc_textTelefono = new GridBagConstraints();
				gbc_textTelefono.gridwidth = 2;
				gbc_textTelefono.insets = new Insets(0, 0, 5, 5);
				gbc_textTelefono.fill = GridBagConstraints.HORIZONTAL;
				gbc_textTelefono.gridx = 9;
				gbc_textTelefono.gridy = 11;
				panel_principal.add(textTelefono, gbc_textTelefono);
				textTelefono.setColumns(10);
		btnEliminar.setToolTipText("Eliminar una persona");
		btnEliminar.setFont(new Font("Arial Black", Font.PLAIN, 20));
		GridBagConstraints gbc_btnEliminar = new GridBagConstraints();
		gbc_btnEliminar.gridheight = 2;
		gbc_btnEliminar.gridwidth = 5;
		gbc_btnEliminar.fill = GridBagConstraints.BOTH;
		gbc_btnEliminar.insets = new Insets(0, 0, 5, 5);
		gbc_btnEliminar.gridx = 1;
		gbc_btnEliminar.gridy = 13;
		panel_principal.add(btnEliminar, gbc_btnEliminar);

		JButton btnModificar = new JButton("Modificar");
		btnModificar.setIcon(new ImageIcon(PanelUsuario.class.getResource("/iconos/edit-draw-pencil.png")));
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
				// u.setConocimientos(textComentarios.getText());

			}
		});
		
				JLabel lblRol = new JLabel("Rol");
				lblRol.setFont(new Font("Arial", Font.PLAIN, 20));
				GridBagConstraints gbc_lblRol = new GridBagConstraints();
				gbc_lblRol.insets = new Insets(0, 0, 5, 5);
				gbc_lblRol.gridx = 7;
				gbc_lblRol.gridy = 13;
				panel_principal.add(lblRol, gbc_lblRol);
		
				textRol = new JTextField();
				GridBagConstraints gbc_textRol = new GridBagConstraints();
				gbc_textRol.gridwidth = 2;
				gbc_textRol.insets = new Insets(0, 0, 5, 5);
				gbc_textRol.fill = GridBagConstraints.HORIZONTAL;
				gbc_textRol.gridx = 9;
				gbc_textRol.gridy = 13;
				panel_principal.add(textRol, gbc_textRol);
				textRol.setColumns(10);
		
				JLabel lblNewLabel_7 = new JLabel("Comentarios");
				lblNewLabel_7.setFont(new Font("Arial", Font.PLAIN, 20));
				GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
				gbc_lblNewLabel_7.anchor = GridBagConstraints.NORTH;
				gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
				gbc_lblNewLabel_7.gridx = 7;
				gbc_lblNewLabel_7.gridy = 15;
				panel_principal.add(lblNewLabel_7, gbc_lblNewLabel_7);
		btnModificar.setToolTipText("Modificar una persona");
		btnModificar.setFont(new Font("Arial Black", Font.PLAIN, 20));
		GridBagConstraints gbc_btnModificar = new GridBagConstraints();
		gbc_btnModificar.gridheight = 2;
		gbc_btnModificar.gridwidth = 5;
		gbc_btnModificar.fill = GridBagConstraints.BOTH;
		gbc_btnModificar.insets = new Insets(0, 0, 5, 5);
		gbc_btnModificar.gridx = 1;
		gbc_btnModificar.gridy = 16;
		panel_principal.add(btnModificar, gbc_btnModificar);

		JScrollPane scrollPane_cm = new JScrollPane();
		GridBagConstraints gbc_scrollPane_cm = new GridBagConstraints();
		gbc_scrollPane_cm.gridheight = 7;
		gbc_scrollPane_cm.gridwidth = 2;
		gbc_scrollPane_cm.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane_cm.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_cm.gridx = 9;
		gbc_scrollPane_cm.gridy = 15;
		panel_principal.add(scrollPane_cm, gbc_scrollPane_cm);

		textAreaComentarios = new JTextArea();
		scrollPane_cm.setViewportView(textAreaComentarios);

		JButton btnEnviarMensaje = new JButton("Enviar mensaje");
		btnEnviarMensaje.setIcon(new ImageIcon(PanelUsuario.class.getResource("/iconos/letter(1).png")));
		btnEnviarMensaje.addActionListener(new BtnEnviarMensajeActionListener());
		btnEnviarMensaje.setFont(new Font("Arial Black", Font.PLAIN, 20));
		GridBagConstraints gbc_btnEnviarMensaje = new GridBagConstraints();
		gbc_btnEnviarMensaje.fill = GridBagConstraints.BOTH;
		gbc_btnEnviarMensaje.gridwidth = 5;
		gbc_btnEnviarMensaje.gridheight = 2;
		gbc_btnEnviarMensaje.insets = new Insets(0, 0, 5, 5);
		gbc_btnEnviarMensaje.gridx = 1;
		gbc_btnEnviarMensaje.gridy = 20;
		panel_principal.add(btnEnviarMensaje, gbc_btnEnviarMensaje);
		splitPane_division.setDividerLocation(1300);
		splitPane.setDividerLocation(300);

		listUsuarios.setModel(u.getLista());
		panel_personas.add(listUsuarios, BorderLayout.CENTER);
		listUsuarios.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				Usuario u = listUsuarios.getSelectedValue();
				if (u != null) {
					textNombre.setText(u.getNombre());
					textApellidos.setText(u.getApellidos());
					textContraseña.setText(u.getContraseña());
					textEmail.setText(u.getEmail());
					textTelefono.setText(String.valueOf(u.getTelf()));
					textRol.setText(u.getRolPrincipal());
					lblfoto.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(u.getImagen()))
							.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
					textAreaComentarios.setText(u.getConocimientos());

				} else {
					textNombre.setText("");
					textApellidos.setText("");
					textContraseña.setText("");
					textEmail.setText("");
					textTelefono.setText("");
					textRol.setText("");
					lblfoto.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/x.png"))
							.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
					textAreaComentarios.setText("");
				}

			}
		});
		this.user1 = user;
	}

	private class BtnNewButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JFileChooser fcAbrir = new JFileChooser();
			fcAbrir.setFileFilter(new ImageFilter());
			fcAbrir.setDialogTitle("Selecciona una imagen");

			int valorDevuelto = fcAbrir.showOpenDialog(null);
			if (valorDevuelto == JFileChooser.APPROVE_OPTION) {
				File file = fcAbrir.getSelectedFile();

				if (file == null) {
					JOptionPane.showMessageDialog(null, "Debes de seleccionar alguna imagen.", "No hubo seleccion",
							JOptionPane.ERROR_MESSAGE);
				} else {
					/*
					  lblfoto.setIcon(new ImageIcon(new
					  javax.swing.ImageIcon(getClass().getResource(file.getPath()))
					  .getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
					 
					user1.setImagen(file.getPath());*/
				}

			}
		}
	}

	private class BtnEnviarMensajeActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			VentanaMensaje vm = new VentanaMensaje();
			vm.setVisible(true);

		}
	}
}
