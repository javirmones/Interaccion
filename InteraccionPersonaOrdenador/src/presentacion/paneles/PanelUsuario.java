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

public class PanelUsuario extends JPanel {
	private JLabel lblId;
	private JLabel lblNewLabel;
	private JLabel lblApellidos;
	private JLabel lblTelefono;
	private JLabel lblUltimaConexion;
	private JLabel lblDireccion;
	private JLabel lblEmail;
	private JScrollPane scrollPane_1;
	private JTextField tfID;
	private JTextField tfNombre;
	private JTextField tfApellidos;
	private JTextField tfTelefono;
	private JTextField tfConexion;
	private JScrollPane scrollPane_2;
	private JTextField tfDireccion;
	private JTextField tfEmail;
	private JTree tree;
	private JLabel lblNewLabel_1;
	private JScrollPane scrollPane;
	private JList list;

	/**
	 * Create the panel.
	 */
	public PanelUsuario() {
		setBorder(new TitledBorder(null, "Informacion personal", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{167, 247, 183, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 100, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		{
			lblId = new JLabel("ID:");
			GridBagConstraints gbc_lblId = new GridBagConstraints();
			gbc_lblId.anchor = GridBagConstraints.EAST;
			gbc_lblId.insets = new Insets(0, 0, 5, 5);
			gbc_lblId.gridx = 0;
			gbc_lblId.gridy = 0;
			add(lblId, gbc_lblId);
		}
		{
			tfID = new JTextField();
			GridBagConstraints gbc_tfID = new GridBagConstraints();
			gbc_tfID.insets = new Insets(0, 0, 5, 5);
			gbc_tfID.fill = GridBagConstraints.HORIZONTAL;
			gbc_tfID.gridx = 1;
			gbc_tfID.gridy = 0;
			add(tfID, gbc_tfID);
			tfID.setColumns(10);
		}
		{
			lblNewLabel = new JLabel("Nombre:");
			GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
			gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
			gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel.gridx = 0;
			gbc_lblNewLabel.gridy = 1;
			add(lblNewLabel, gbc_lblNewLabel);
		}
		{
			tfNombre = new JTextField();
			GridBagConstraints gbc_tfNombre = new GridBagConstraints();
			gbc_tfNombre.anchor = GridBagConstraints.NORTH;
			gbc_tfNombre.insets = new Insets(0, 0, 5, 5);
			gbc_tfNombre.fill = GridBagConstraints.HORIZONTAL;
			gbc_tfNombre.gridx = 1;
			gbc_tfNombre.gridy = 1;
			add(tfNombre, gbc_tfNombre);
			tfNombre.setColumns(10);
		}
		{
			scrollPane_2 = new JScrollPane();
			GridBagConstraints gbc_scrollPane_2 = new GridBagConstraints();
			gbc_scrollPane_2.gridheight = 5;
			gbc_scrollPane_2.insets = new Insets(0, 0, 5, 0);
			gbc_scrollPane_2.fill = GridBagConstraints.BOTH;
			gbc_scrollPane_2.gridx = 2;
			gbc_scrollPane_2.gridy = 0;
			add(scrollPane_2, gbc_scrollPane_2);
			{
				lblNewLabel_1 = new JLabel("");
				lblNewLabel_1.setBorder(new TitledBorder(null, "Foto", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				scrollPane_2.setViewportView(lblNewLabel_1);
			}
		}
		{
			lblApellidos = new JLabel("Apellidos:");
			GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
			gbc_lblApellidos.anchor = GridBagConstraints.EAST;
			gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
			gbc_lblApellidos.gridx = 0;
			gbc_lblApellidos.gridy = 2;
			add(lblApellidos, gbc_lblApellidos);
		}
		{
			tfApellidos = new JTextField();
			GridBagConstraints gbc_tfApellidos = new GridBagConstraints();
			gbc_tfApellidos.anchor = GridBagConstraints.NORTH;
			gbc_tfApellidos.insets = new Insets(0, 0, 5, 5);
			gbc_tfApellidos.fill = GridBagConstraints.HORIZONTAL;
			gbc_tfApellidos.gridx = 1;
			gbc_tfApellidos.gridy = 2;
			add(tfApellidos, gbc_tfApellidos);
			tfApellidos.setColumns(10);
		}
		{
			lblTelefono = new JLabel("Telefono:");
			GridBagConstraints gbc_lblTelefono = new GridBagConstraints();
			gbc_lblTelefono.anchor = GridBagConstraints.EAST;
			gbc_lblTelefono.insets = new Insets(0, 0, 5, 5);
			gbc_lblTelefono.gridx = 0;
			gbc_lblTelefono.gridy = 3;
			add(lblTelefono, gbc_lblTelefono);
		}
		{
			tfTelefono = new JTextField();
			GridBagConstraints gbc_tfTelefono = new GridBagConstraints();
			gbc_tfTelefono.anchor = GridBagConstraints.NORTH;
			gbc_tfTelefono.insets = new Insets(0, 0, 5, 5);
			gbc_tfTelefono.fill = GridBagConstraints.HORIZONTAL;
			gbc_tfTelefono.gridx = 1;
			gbc_tfTelefono.gridy = 3;
			add(tfTelefono, gbc_tfTelefono);
			tfTelefono.setColumns(10);
		}
		{
			lblUltimaConexion = new JLabel("Última conexion:");
			GridBagConstraints gbc_lblUltimaConexion = new GridBagConstraints();
			gbc_lblUltimaConexion.anchor = GridBagConstraints.EAST;
			gbc_lblUltimaConexion.insets = new Insets(0, 0, 5, 5);
			gbc_lblUltimaConexion.gridx = 0;
			gbc_lblUltimaConexion.gridy = 4;
			add(lblUltimaConexion, gbc_lblUltimaConexion);
		}
		{
			tfConexion = new JTextField();
			GridBagConstraints gbc_tfConexion = new GridBagConstraints();
			gbc_tfConexion.insets = new Insets(0, 0, 5, 5);
			gbc_tfConexion.fill = GridBagConstraints.HORIZONTAL;
			gbc_tfConexion.gridx = 1;
			gbc_tfConexion.gridy = 4;
			add(tfConexion, gbc_tfConexion);
			tfConexion.setColumns(10);
		}
		{
			lblDireccion = new JLabel("Direccion:");
			GridBagConstraints gbc_lblDireccion = new GridBagConstraints();
			gbc_lblDireccion.anchor = GridBagConstraints.EAST;
			gbc_lblDireccion.insets = new Insets(0, 0, 5, 5);
			gbc_lblDireccion.gridx = 0;
			gbc_lblDireccion.gridy = 5;
			add(lblDireccion, gbc_lblDireccion);
		}
		{
			tfDireccion = new JTextField();
			GridBagConstraints gbc_tfDireccion = new GridBagConstraints();
			gbc_tfDireccion.gridwidth = 2;
			gbc_tfDireccion.insets = new Insets(0, 0, 5, 0);
			gbc_tfDireccion.fill = GridBagConstraints.HORIZONTAL;
			gbc_tfDireccion.gridx = 1;
			gbc_tfDireccion.gridy = 5;
			add(tfDireccion, gbc_tfDireccion);
			tfDireccion.setColumns(10);
		}
		{
			lblEmail = new JLabel("Email:");
			GridBagConstraints gbc_lblEmail = new GridBagConstraints();
			gbc_lblEmail.anchor = GridBagConstraints.EAST;
			gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
			gbc_lblEmail.gridx = 0;
			gbc_lblEmail.gridy = 6;
			add(lblEmail, gbc_lblEmail);
		}
		{
			tfEmail = new JTextField();
			GridBagConstraints gbc_tfEmail = new GridBagConstraints();
			gbc_tfEmail.gridwidth = 2;
			gbc_tfEmail.anchor = GridBagConstraints.NORTH;
			gbc_tfEmail.insets = new Insets(0, 0, 5, 0);
			gbc_tfEmail.fill = GridBagConstraints.HORIZONTAL;
			gbc_tfEmail.gridx = 1;
			gbc_tfEmail.gridy = 6;
			add(tfEmail, gbc_tfEmail);
			tfEmail.setColumns(10);
		}
		{
			scrollPane = new JScrollPane();
			GridBagConstraints gbc_scrollPane = new GridBagConstraints();
			gbc_scrollPane.gridwidth = 2;
			gbc_scrollPane.insets = new Insets(0, 0, 0, 5);
			gbc_scrollPane.fill = GridBagConstraints.BOTH;
			gbc_scrollPane.gridx = 0;
			gbc_scrollPane.gridy = 7;
			add(scrollPane, gbc_scrollPane);
			{
				list = new JList();
				list.setBorder(new TitledBorder(null, "Habilidades", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				scrollPane.setViewportView(list);
			}
		}
		{
			scrollPane_1 = new JScrollPane();
			GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
			gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
			gbc_scrollPane_1.gridx = 2;
			gbc_scrollPane_1.gridy = 7;
			add(scrollPane_1, gbc_scrollPane_1);
			{
				tree = new JTree();
				tree.setBorder(new TitledBorder(null, "Proyectos/Tareas", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				scrollPane_1.setViewportView(tree);
			}
		}

	}

}
