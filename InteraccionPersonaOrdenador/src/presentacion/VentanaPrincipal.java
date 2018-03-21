package presentacion;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTree;
import javax.swing.border.EmptyBorder;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;
import java.awt.Component;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JScrollBar;
import java.awt.CardLayout;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;
	private JPanel panelCard;
	private JMenuBar menuBar;
	private JMenuItem mntmAcercaDe;
	private String fechaActual = "";
	private JPanel panel;
	private JLabel lblH;
	private JLabel lblholaBienvenidoA;
	private JLabel lblltimaConexin;
	private JLabel lblConexin;
	private JLabel lblNombre;
	private JLabel lblApellidos;
	private JButton btnA;

	public VentanaPrincipal() {
		setTitle("Gestion de proyectos");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1155, 706);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		{
			panel = new JPanel();
			panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
			panel.setAlignmentX(Component.RIGHT_ALIGNMENT);
			contentPane.add(panel, BorderLayout.NORTH);
			GridBagLayout gbl_panel = new GridBagLayout();
			gbl_panel.columnWidths = new int[] { 103, 87, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 147, 0, 0 };
			gbl_panel.rowHeights = new int[] { 57, 47, 0 };
			gbl_panel.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
					0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 7.0, Double.MIN_VALUE };
			gbl_panel.rowWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE };
			panel.setLayout(gbl_panel);
			{
				lblH = new JLabel("");
				lblH.setBorder(new TitledBorder(null, "Foto", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				GridBagConstraints gbc_lblH = new GridBagConstraints();
				gbc_lblH.fill = GridBagConstraints.BOTH;
				gbc_lblH.gridheight = 2;
				gbc_lblH.insets = new Insets(0, 0, 0, 5);
				gbc_lblH.gridx = 0;
				gbc_lblH.gridy = 0;
				panel.add(lblH, gbc_lblH);
			}
			{
				lblholaBienvenidoA = new JLabel("¡Hola! Bienvenido a la aplicación");
				GridBagConstraints gbc_lblholaBienvenidoA = new GridBagConstraints();
				gbc_lblholaBienvenidoA.gridwidth = 11;
				gbc_lblholaBienvenidoA.insets = new Insets(0, 0, 5, 5);
				gbc_lblholaBienvenidoA.gridx = 2;
				gbc_lblholaBienvenidoA.gridy = 0;
				panel.add(lblholaBienvenidoA, gbc_lblholaBienvenidoA);
			}
			{
				lblNombre = new JLabel("Nombre");
				GridBagConstraints gbc_lblNombre = new GridBagConstraints();
				gbc_lblNombre.gridwidth = 2;
				gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
				gbc_lblNombre.gridx = 13;
				gbc_lblNombre.gridy = 0;
				panel.add(lblNombre, gbc_lblNombre);
			}
			{
				lblApellidos = new JLabel("Apellidos");
				GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
				gbc_lblApellidos.gridwidth = 3;
				gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
				gbc_lblApellidos.gridx = 15;
				gbc_lblApellidos.gridy = 0;
				panel.add(lblApellidos, gbc_lblApellidos);
			}
			{
				btnA = new JButton("A");
				GridBagConstraints gbc_btnA = new GridBagConstraints();
				gbc_btnA.gridheight = 2;
				gbc_btnA.gridx = 28;
				gbc_btnA.gridy = 0;
				panel.add(btnA, gbc_btnA);
			}
			{
				lblltimaConexin = new JLabel("Última conexión");
				GridBagConstraints gbc_lblltimaConexin = new GridBagConstraints();
				gbc_lblltimaConexin.gridwidth = 6;
				gbc_lblltimaConexin.insets = new Insets(0, 0, 0, 5);
				gbc_lblltimaConexin.gridx = 4;
				gbc_lblltimaConexin.gridy = 1;
				panel.add(lblltimaConexin, gbc_lblltimaConexin);
			}
			{
				lblConexin = new JLabel("Conexión");
				GridBagConstraints gbc_lblConexin = new GridBagConstraints();
				gbc_lblConexin.insets = new Insets(0, 0, 0, 5);
				gbc_lblConexin.gridx = 15;
				gbc_lblConexin.gridy = 1;
				panel.add(lblConexin, gbc_lblConexin);
			}
		}
	}

}
