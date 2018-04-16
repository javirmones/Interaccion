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
import javax.swing.JMenu;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//import com.toedter.calendar.JCalendar;
import java.awt.Font;
import java.awt.Toolkit;

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
	private JLabel lblNombre;
	private JLabel lblApellidos;
	private JButton btnA;
	private JMenuBar menuBar_1;
	private JMenu mnArchivo;
	private JMenu mnProyectos;
	private JMenu mnPersonas;
	private JMenu mnMensajes;
	private JMenu mnAyuda;
	private JPanel panel_1;
	private JMenuItem mntmVerAyuda;
	private JPanel panel_2;
	//private JCalendar calendar;
	private JSplitPane splitPane;
	private JTree tree;
	private JScrollPane scrollPane;
	private JButton btnA_1;
	private JPanel panel_3;

	public VentanaPrincipal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaPrincipal.class.getResource("/iconos/rate-star-button.png")));
		setTitle("Gestion de proyectos");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1155, 706);
		{
			menuBar_1 = new JMenuBar();
			setJMenuBar(menuBar_1);
			{
				mnArchivo = new JMenu("Archivo");
				menuBar_1.add(mnArchivo);
			}
			{
				mnProyectos = new JMenu("Proyectos");
				menuBar_1.add(mnProyectos);
			}
			{
				mnPersonas = new JMenu("Personas");
				menuBar_1.add(mnPersonas);
			}
			{
				mnMensajes = new JMenu("Mensajes");
				menuBar_1.add(mnMensajes);
			}
			{
				mnAyuda = new JMenu("Ayuda");
				menuBar_1.add(mnAyuda);
				{
					mntmVerAyuda = new JMenuItem("Ver ayuda");
					mntmVerAyuda.addActionListener(new MntmVerAyudaActionListener());
					mnAyuda.add(mntmVerAyuda);
				}
			}
		}
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
			gbl_panel.columnWidths = new int[] { 103, 87, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 33, 0, 0, 0, 0, 0 };
			gbl_panel.rowHeights = new int[] { 57, 47, 48, 0 };
			gbl_panel.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
					0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 7.0, Double.MIN_VALUE };
			gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
			panel.setLayout(gbl_panel);
			{
				lblH = new JLabel("");
				lblH.setBorder(new TitledBorder(null, "Foto", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				GridBagConstraints gbc_lblH = new GridBagConstraints();
				gbc_lblH.gridwidth = 2;
				gbc_lblH.gridheight = 3;
				gbc_lblH.fill = GridBagConstraints.BOTH;
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
				gbc_lblholaBienvenidoA.gridx = 3;
				gbc_lblholaBienvenidoA.gridy = 0;
				panel.add(lblholaBienvenidoA, gbc_lblholaBienvenidoA);
			}
			{
				lblltimaConexin = new JLabel("Última conexión");
				GridBagConstraints gbc_lblltimaConexin = new GridBagConstraints();
				gbc_lblltimaConexin.gridwidth = 6;
				gbc_lblltimaConexin.insets = new Insets(0, 0, 5, 5);
				gbc_lblltimaConexin.gridx = 15;
				gbc_lblltimaConexin.gridy = 0;
				panel.add(lblltimaConexin, gbc_lblltimaConexin);
			}
			{
				lblNombre = new JLabel("Nombre");
				GridBagConstraints gbc_lblNombre = new GridBagConstraints();
				gbc_lblNombre.gridwidth = 2;
				gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
				gbc_lblNombre.gridx = 5;
				gbc_lblNombre.gridy = 1;
				panel.add(lblNombre, gbc_lblNombre);
			}
			{
			}
			{
				btnA_1 = new JButton("Ajustes");
				btnA_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
				btnA_1.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/iconos/camera-settings-cogwheel.png")));
				GridBagConstraints gbc_btnA_1 = new GridBagConstraints();
				gbc_btnA_1.insets = new Insets(0, 0, 5, 5);
				gbc_btnA_1.gridx = 25;
				gbc_btnA_1.gridy = 1;
				panel.add(btnA_1, gbc_btnA_1);
			}
			btnA = new JButton("Salir");
			btnA.setFont(new Font("Tahoma", Font.PLAIN, 18));
			btnA.addActionListener(new BtnAActionListener());
			btnA.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/iconos/shut-down-icon.png")));
			GridBagConstraints gbc_btnA = new GridBagConstraints();
			gbc_btnA.gridwidth = 2;
			gbc_btnA.insets = new Insets(0, 0, 5, 5);
			gbc_btnA.gridx = 27;
			gbc_btnA.gridy = 1;
			panel.add(btnA, gbc_btnA);
			{
				lblApellidos = new JLabel("Apellidos");
				GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
				gbc_lblApellidos.gridwidth = 4;
				gbc_lblApellidos.insets = new Insets(0, 0, 0, 5);
				gbc_lblApellidos.gridx = 4;
				gbc_lblApellidos.gridy = 2;
				panel.add(lblApellidos, gbc_lblApellidos);
			}
	
			panel_2 = new JPanel();
			contentPane.add(panel_2, BorderLayout.EAST);
			{
				//calendar = new JCalendar();
				//panel_2.add(calendar);
			}
		}
		{
			splitPane = new JSplitPane();
			contentPane.add(splitPane, BorderLayout.CENTER);
			{
				tree = new JTree();
				splitPane.setLeftComponent(tree);
			}
			{
				scrollPane = new JScrollPane();
				splitPane.setRightComponent(scrollPane);
			}
		}
		{
			panel_3 = new JPanel();
			contentPane.add(panel_3, BorderLayout.SOUTH);
		}
	}

	private class BtnAActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
		}
	}
	private class MntmVerAyudaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			VentanaAyuda va=new VentanaAyuda();
			va.setVisible(true);
		}
	}
}
