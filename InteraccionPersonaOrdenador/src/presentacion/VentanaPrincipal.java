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
import com.toedter.calendar.JCalendar;

import presentacion.paneles.PanelCalendario;
import presentacion.paneles.PanelUsuario;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.FlowLayout;
import javax.swing.Box;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.JRadioButtonMenuItem;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;
	private JPanel panelCard;
	private JMenuBar menuBar;
	private JMenuItem mntmAcercaDe;
	private String fechaActual = "";
	private JMenuBar menuBar_1;
	private JMenu mnProyectos;
	private JMenu mnPersonas;
	private JMenu mnMensajes;
	private JMenu mnAyuda;
	private JPanel panel_1;
	private JMenuItem mntmVerAyuda;
	private JPanel panel_3;
	private Component horizontalStrut;
	private JLabel lblHola;
	private Component horizontalStrut_1;
	private Component horizontalStrut_2;
	private JPanel panel_4;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JSplitPane splitPane;
	private JPanel panel;
	private JPanel panel_6;
	private JSplitPane splitPane_1;
	private JPanel panel_5;
	private JPanel panel_7;
	private JButton btnNewButton_2;
	private JMenuItem mntmIrAProyectos;
	private JMenuItem mntmNuevoProyecto;
	private JRadioButtonMenuItem rdbtnmntmEditarProyecto;
	private JMenuItem mntmEliminarProyecto;
	private JMenuItem mntmIrAPersonas;
	private JMenuItem mntmEnviarMensaje;
	private JMenu mnInformacin;
	private JMenuItem mntmACercaDe;
	private JPanel panel_card;

	public VentanaPrincipal() {
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(VentanaPrincipal.class.getResource("/iconos/rate-star-button.png")));
		setTitle("Gestion de proyectos");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1155, 706);
		{
			menuBar_1 = new JMenuBar();
			setJMenuBar(menuBar_1);
			{
				mnProyectos = new JMenu("Proyectos");
				menuBar_1.add(mnProyectos);
				{
					mntmIrAProyectos = new JMenuItem("Ir a proyectos...");
					mnProyectos.add(mntmIrAProyectos);
				}
				{
					mntmNuevoProyecto = new JMenuItem("Nuevo proyecto");
					mnProyectos.add(mntmNuevoProyecto);
				}
				{
					rdbtnmntmEditarProyecto = new JRadioButtonMenuItem("Editar proyecto");
					mnProyectos.add(rdbtnmntmEditarProyecto);
				}
				{
					mntmEliminarProyecto = new JMenuItem("Eliminar proyecto");
					mnProyectos.add(mntmEliminarProyecto);
				}
			}
			{
				mnPersonas = new JMenu("Personas");
				menuBar_1.add(mnPersonas);
				{
					mntmIrAPersonas = new JMenuItem("Ir a personas...");
					mnPersonas.add(mntmIrAPersonas);
				}
			}
			{
				mnMensajes = new JMenu("Mensajes");
				menuBar_1.add(mnMensajes);
				{
					mntmEnviarMensaje = new JMenuItem("Enviar mensaje");
					mnMensajes.add(mntmEnviarMensaje);
				}
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
			{
				mnInformacin = new JMenu("Información");
				menuBar_1.add(mnInformacin);
				{
					mntmACercaDe = new JMenuItem("A cerca de...");
					mnInformacin.add(mntmACercaDe);
				}
			}
		}
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		{
			{
			}
		}
		{
			panel_3 = new JPanel();
			contentPane.add(panel_3, BorderLayout.SOUTH);
			panel_3.setLayout(new GridLayout(0, 5, 0, 0));
			{
				horizontalStrut = Box.createHorizontalStrut(20);
				panel_3.add(horizontalStrut);
			}
			{
				lblHola = new JLabel("¡Hola! Bienvenido al programa");
				panel_3.add(lblHola);
			}
			{
				horizontalStrut_1 = Box.createHorizontalStrut(20);
				panel_3.add(horizontalStrut_1);
			}
			{
				horizontalStrut_2 = Box.createHorizontalStrut(20);
				panel_3.add(horizontalStrut_2);
			}
			{
				panel_4 = new JPanel();
				panel_4.setAlignmentY(Component.BOTTOM_ALIGNMENT);
				panel_4.setAlignmentX(Component.LEFT_ALIGNMENT);
				panel_3.add(panel_4);
				panel_4.setLayout(new GridLayout(0, 2, 20, 0));
				{
					btnNewButton = new JButton("New button");
					panel_4.add(btnNewButton);
				}
				{
					btnNewButton_1 = new JButton("New button");
					panel_4.add(btnNewButton_1);
				}
			}
		}
		{
			{
				{
					panel = new JPanel();
				}
			}
		}
		{
			panel_card = new JPanel();
			contentPane.add(panel_card, BorderLayout.CENTER);
			panel_card.setLayout(new CardLayout(0, 0));
			splitPane = new JSplitPane();
			panel_card.add(splitPane, "name_8541342585746");
			{
				panel_6 = new PanelUsuario();
				splitPane.setRightComponent(panel_6);
			}
			{
				splitPane_1 = new JSplitPane();
				splitPane_1.setOrientation(JSplitPane.VERTICAL_SPLIT);
				splitPane.setLeftComponent(splitPane_1);
				{
					panel_5 = new JPanel();
					
					PanelCalendario c1 = new PanelCalendario(); 
					GridBagLayout gridBagLayout = (GridBagLayout) c1.getLayout();
					gridBagLayout.columnWidths = new int[]{0, 182, 0};
					splitPane_1.setLeftComponent(panel_5);
					panel_5.setLayout(new CardLayout(0, 0));
					{
						
						panel_5.add(c1, "name_8308654116119");
					}
				
				}
				{
					panel_7 = new JPanel();
					splitPane_1.setRightComponent(panel_7);
					panel_7.setLayout(new CardLayout(0, 0));
				}
				splitPane_1.setDividerLocation(300);
			}
			splitPane.setDividerLocation(550);
		}
	}

	private class MntmVerAyudaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			VentanaAyuda va = new VentanaAyuda();
			va.setVisible(true);
		}
	}
}
