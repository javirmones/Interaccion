package presentacion.paneles;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.border.TitledBorder;

import dominio.Usuario;

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
import java.awt.CardLayout;

public class PanelInicial extends JPanel {
	private JPanel panel;
	private JLabel label_nombre;
	private JTextField txtNombre;
	private JLabel label_Apellidos;
	private JTextField txtApellidos;
	private JLabel lblDireccion;
	private JTextField txtDireccion;
	private JLabel label_Email;
	private JTextField txtEmail;
	private JLabel label_Telefono;
	private JTextField txtTelefono;
	private JLabel label_Rol;
	private JTextField txtRol;
	private JLabel label_Comentarios;
	private JScrollPane spcComentarios;
	private JTextArea textAreaComentarios;
	private JScrollPane scrollPane_1;
	private JLabel labelFoto;

	/**
	 * Create the panel.
	 */
	public PanelInicial(Usuario u) {
		setLayout(new CardLayout(0, 0));
		{
			panel = new JPanel();
			add(panel, "panel_inicial");
			GridBagLayout gbl_panel = new GridBagLayout();
			gbl_panel.columnWidths = new int[]{62, 84, 0, 0, 0, 0, 55, 0, 0, 126, 386, 0, 0, 0};
			gbl_panel.rowHeights = new int[]{40, 171, 47, 54, 46, 40, 44, 32, 40, 0, 42, 33, 42, 60, 34, 45, 0, 0, 0};
			gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
			panel.setLayout(gbl_panel);
			{
				
				scrollPane_1 = new JScrollPane();
				GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
				gbc_scrollPane_1.gridheight = 3;
				gbc_scrollPane_1.gridwidth = 6;
				gbc_scrollPane_1.insets = new Insets(0, 0, 5, 5);
				gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
				gbc_scrollPane_1.gridx = 1;
				gbc_scrollPane_1.gridy = 1;
				panel.add(scrollPane_1, gbc_scrollPane_1);
				{
					labelFoto = new JLabel("");
					labelFoto.setBorder(new TitledBorder(null, "Foto", TitledBorder.LEADING, TitledBorder.TOP, null, null));
					labelFoto.setIcon(new ImageIcon(PanelInicial.class.getResource("/iconos/stalin.jpg")));
					scrollPane_1.setViewportView(labelFoto);
				}
			}
			{
				label_nombre = new JLabel("Nombre");
				label_nombre.setFont(new Font("Arial", Font.PLAIN, 20));
				GridBagConstraints gbc_label_nombre = new GridBagConstraints();
				gbc_label_nombre.anchor = GridBagConstraints.SOUTH;
				gbc_label_nombre.insets = new Insets(0, 0, 5, 5);
				gbc_label_nombre.gridx = 7;
				gbc_label_nombre.gridy = 1;
				panel.add(label_nombre, gbc_label_nombre);
			}
			{
				txtNombre = new JTextField();
				txtNombre.setEditable(false);
				txtNombre.setColumns(10);
				GridBagConstraints gbc_txtNombre = new GridBagConstraints();
				gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtNombre.anchor = GridBagConstraints.SOUTH;
				gbc_txtNombre.gridwidth = 2;
				gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
				gbc_txtNombre.gridx = 9;
				gbc_txtNombre.gridy = 1;
				panel.add(txtNombre, gbc_txtNombre);
			}
			{
				label_Apellidos = new JLabel("Apellidos");
				label_Apellidos.setFont(new Font("Arial", Font.PLAIN, 20));
				GridBagConstraints gbc_label_Apellidos = new GridBagConstraints();
				gbc_label_Apellidos.insets = new Insets(0, 0, 5, 5);
				gbc_label_Apellidos.gridx = 7;
				gbc_label_Apellidos.gridy = 3;
				panel.add(label_Apellidos, gbc_label_Apellidos);
			}
			{
				txtApellidos = new JTextField();
				txtApellidos.setEditable(false);
				txtApellidos.setColumns(10);
				GridBagConstraints gbc_txtApellidos = new GridBagConstraints();
				gbc_txtApellidos.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtApellidos.gridwidth = 2;
				gbc_txtApellidos.insets = new Insets(0, 0, 5, 5);
				gbc_txtApellidos.gridx = 9;
				gbc_txtApellidos.gridy = 3;
				panel.add(txtApellidos, gbc_txtApellidos);
			}
			{
				lblDireccion = new JLabel("Direccion");
				lblDireccion.setFont(new Font("Arial", Font.PLAIN, 20));
				GridBagConstraints gbc_lblDireccion = new GridBagConstraints();
				gbc_lblDireccion.insets = new Insets(0, 0, 5, 5);
				gbc_lblDireccion.gridx = 7;
				gbc_lblDireccion.gridy = 5;
				panel.add(lblDireccion, gbc_lblDireccion);
			}
			{
				txtDireccion = new JTextField();
				txtDireccion.setEditable(false);
				txtDireccion.setColumns(10);
				GridBagConstraints gbc_txtDireccion = new GridBagConstraints();
				gbc_txtDireccion.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtDireccion.gridwidth = 2;
				gbc_txtDireccion.insets = new Insets(0, 0, 5, 5);
				gbc_txtDireccion.gridx = 9;
				gbc_txtDireccion.gridy = 5;
				panel.add(txtDireccion, gbc_txtDireccion);
			}
			{
				label_Email = new JLabel("Email");
				label_Email.setFont(new Font("Arial", Font.PLAIN, 20));
				GridBagConstraints gbc_label_Email = new GridBagConstraints();
				gbc_label_Email.insets = new Insets(0, 0, 5, 5);
				gbc_label_Email.gridx = 7;
				gbc_label_Email.gridy = 7;
				panel.add(label_Email, gbc_label_Email);
			}
			{
				txtEmail = new JTextField();
				txtEmail.setEditable(false);
				txtEmail.setColumns(10);
				GridBagConstraints gbc_txtEmail = new GridBagConstraints();
				gbc_txtEmail.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtEmail.gridwidth = 2;
				gbc_txtEmail.insets = new Insets(0, 0, 5, 5);
				gbc_txtEmail.gridx = 9;
				gbc_txtEmail.gridy = 7;
				panel.add(txtEmail, gbc_txtEmail);
			}
			{
				label_Telefono = new JLabel("Telefono");
				label_Telefono.setFont(new Font("Arial", Font.PLAIN, 20));
				GridBagConstraints gbc_label_Telefono = new GridBagConstraints();
				gbc_label_Telefono.insets = new Insets(0, 0, 5, 5);
				gbc_label_Telefono.gridx = 7;
				gbc_label_Telefono.gridy = 9;
				panel.add(label_Telefono, gbc_label_Telefono);
			}
			{
				txtTelefono = new JTextField();
				txtTelefono.setEditable(false);
				txtTelefono.setColumns(10);
				GridBagConstraints gbc_txtTelefono = new GridBagConstraints();
				gbc_txtTelefono.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtTelefono.gridwidth = 2;
				gbc_txtTelefono.insets = new Insets(0, 0, 5, 5);
				gbc_txtTelefono.gridx = 9;
				gbc_txtTelefono.gridy = 9;
				panel.add(txtTelefono, gbc_txtTelefono);
			}
			{
				label_Rol = new JLabel("Rol");
				label_Rol.setFont(new Font("Arial", Font.PLAIN, 20));
				GridBagConstraints gbc_label_Rol = new GridBagConstraints();
				gbc_label_Rol.insets = new Insets(0, 0, 5, 5);
				gbc_label_Rol.gridx = 7;
				gbc_label_Rol.gridy = 11;
				panel.add(label_Rol, gbc_label_Rol);
			}
			{
				txtRol = new JTextField();
				txtRol.setEditable(false);
				txtRol.setColumns(10);
				GridBagConstraints gbc_txtRol = new GridBagConstraints();
				gbc_txtRol.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtRol.gridwidth = 2;
				gbc_txtRol.insets = new Insets(0, 0, 5, 5);
				gbc_txtRol.gridx = 9;
				gbc_txtRol.gridy = 11;
				panel.add(txtRol, gbc_txtRol);
			}
			{
				label_Comentarios = new JLabel("Comentarios");
				label_Comentarios.setFont(new Font("Arial", Font.PLAIN, 20));
				GridBagConstraints gbc_label_Comentarios = new GridBagConstraints();
				gbc_label_Comentarios.anchor = GridBagConstraints.NORTH;
				gbc_label_Comentarios.insets = new Insets(0, 0, 5, 5);
				gbc_label_Comentarios.gridx = 7;
				gbc_label_Comentarios.gridy = 13;
				panel.add(label_Comentarios, gbc_label_Comentarios);
			}
			{
				spcComentarios = new JScrollPane();
				GridBagConstraints gbc_spcComentarios = new GridBagConstraints();
				gbc_spcComentarios.fill = GridBagConstraints.BOTH;
				gbc_spcComentarios.gridheight = 2;
				gbc_spcComentarios.gridwidth = 2;
				gbc_spcComentarios.insets = new Insets(0, 0, 5, 5);
				gbc_spcComentarios.gridx = 9;
				gbc_spcComentarios.gridy = 13;
				panel.add(spcComentarios, gbc_spcComentarios);
				{
					textAreaComentarios = new JTextArea();
					textAreaComentarios.setEditable(false);
					spcComentarios.setViewportView(textAreaComentarios);
				}
			}
			
			
			rellenar(u);
			
			
			
		}
		

	}
	public void rellenar(Usuario u) {
	
			txtNombre.setText(u.getNombre());
			txtApellidos.setText(u.getApellidos());
			txtDireccion.setText(u.getContraseña());
			txtEmail.setText(u.getEmail());
			txtTelefono.setText(String.valueOf(u.getTelf()));
			txtRol.setText(u.getRolPrincipal());
			labelFoto.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(u.getImagen()))
					.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
			textAreaComentarios.setText(u.getConocimientos());
			
		}
	}

