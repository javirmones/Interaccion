package presentacion;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTree;
import javax.swing.WindowConstants;
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

import dominio.Usuario;
import presentacion.paneles.PanelInicial;
import presentacion.paneles.PanelProyecto;
import presentacion.paneles.PanelSubTarea;
import presentacion.paneles.PanelTarea;
import presentacion.paneles.PanelUsuario;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.FlowLayout;
import javax.swing.Box;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.awt.Frame;
import java.awt.Dimension;
import javax.swing.SwingConstants;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;
	private JPanel panelCard;
	private JMenuBar menuBar;
	private JMenuItem mntmAcercaDe;
	private String fechaActual = "";
	private JMenuBar barraMenu;
	private JMenu mnProyectos;
	private JMenu mnPersonas;
	private JMenu mnMensajes;
	private JMenu mnAyuda;

	private JMenuItem mntmVerAyuda;
	private JPanel panel_ajustes;
	private Component horizontalStrut;
	private JLabel lblHola;
	private Component horizontalStrut_2;
	private JPanel panel_aux;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JSplitPane splitPane_inicial;
	private JPanel panel;
	private JPanel panel_7;
	private JButton btnNewButton_2;
	private JMenuItem mntmIrAProyectos;
	private JMenuItem mntmNuevoProyecto;
	private JMenuItem mntmEliminarProyecto;
	private JMenuItem mntmIrAPersonas;
	private JMenuItem mntmEnviarMensaje;
	private JMenu mnInformacin;
	private JMenuItem mntmACercaDe;
	private JPanel panel_card;
	private JPanel panel_proyectos;
	private JMenu mnInicio;
	private JMenuItem mntmInicio;
	private JLabel lblNewLabel;
	private JPanel panel_personas;
	private JSplitPane splitPane;
	private JPanel panel_auxiliar;
	private JCalendar calendar;
	private JPanel panel_inicio;
	private JMenu mnNewMenu;
	private JMenu mnNewMenu_1;
	private JMenuItem mntmNuevo;
	private JMenuItem mntmEditarTarea;
	private JMenuItem mntmEliminarTarea;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmEliminarProyecto_1;
	private JMenu mnEdicionPersonas;
	private JMenuItem mntmNuevaPersona;
	private JMenuItem mntmEditarPersona;
	private JMenuItem mntmEliminarPersona;
	private JPanel panel_tareas;
	private JMenu mnEdicionSubtareas;
	private JMenuItem mntmNuevaSubtarea;
	private JMenuBar menuBar_1;
	private JMenuItem mntmEditarSubtarea;
	private JMenuItem mntmEliminarSubtarea;
	private JMenuItem mntmEdicion;
	private JPanel panel_subtareas;
	private JMenu mnEditarImagen;
	private Usuario u;
	private JFrame vp= this;

	public VentanaPrincipal(Usuario u) throws FileNotFoundException {
		setMinimumSize(new Dimension(720, 480));
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(VentanaPrincipal.class.getResource("/iconos/rate-star-button.png")));
		setTitle(MessagesVentanaPrincipal.getString("VentanaPrincipal.this.title")); //$NON-NLS-1$
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		{
			barraMenu = new JMenuBar();
			setJMenuBar(barraMenu);
			{
				mnInicio = new JMenu(MessagesVentanaPrincipal.getString("VentanaPrincipal.mnInicio.text")); //$NON-NLS-1$
				mnInicio.setToolTipText(MessagesVentanaPrincipal.getString("VentanaPrincipal.mnInicio.toolTipText")); //$NON-NLS-1$
				barraMenu.add(mnInicio);
				{
					mntmInicio = new JMenuItem(MessagesVentanaPrincipal.getString("VentanaPrincipal.mntmInicio.text")); //$NON-NLS-1$
					mntmInicio.setIcon(
							new ImageIcon(VentanaPrincipal.class.getResource("/iconos/home-icon-silhouette.png")));
					mntmInicio.addActionListener(new MntmInicioActionListener());
					mnInicio.add(mntmInicio);
				}
			}
			{
				mnProyectos = new JMenu(MessagesVentanaPrincipal.getString("VentanaPrincipal.mnProyectos.text")); //$NON-NLS-1$

				barraMenu.add(mnProyectos);
				{
					mntmIrAProyectos = new JMenuItem(
							MessagesVentanaPrincipal.getString("VentanaPrincipal.mntmIrAProyectos.text")); //$NON-NLS-1$
					mntmIrAProyectos
							.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/iconos/file-in-folder.png")));
					mntmIrAProyectos.setToolTipText(
							MessagesVentanaPrincipal.getString("VentanaPrincipal.mntmIrAProyectos.toolTipText")); //$NON-NLS-1$
					mntmIrAProyectos.addMouseListener(new MouseAdapter() {

					});
					mntmIrAProyectos.addActionListener(new MntmIrAProyectosActionListener());
					mnProyectos.add(mntmIrAProyectos);
				}
				{
					mnNewMenu = new JMenu(MessagesVentanaPrincipal.getString("VentanaPrincipal.mnNewMenu.text")); //$NON-NLS-1$
					mnProyectos.add(mnNewMenu);
					{
						mntmNuevo = new JMenuItem(
								MessagesVentanaPrincipal.getString("VentanaPrincipal.mntmNuevo.text")); //$NON-NLS-1$
						mntmNuevo.addActionListener(new MntmNuevoActionListener());
						mntmNuevo.setIcon(
								new ImageIcon(VentanaPrincipal.class.getResource("/iconos/add-filled-cross-sign.png")));
						mnNewMenu.add(mntmNuevo);
					}
					{
						mntmEditarTarea = new JMenuItem(
								MessagesVentanaPrincipal.getString("VentanaPrincipal.mntmEditarTarea.text")); //$NON-NLS-1$
						mntmEditarTarea.setIcon(
								new ImageIcon(VentanaPrincipal.class.getResource("/iconos/edit-draw-pencil.png")));
						mnNewMenu.add(mntmEditarTarea);
					}
					{
						mntmEliminarTarea = new JMenuItem(
								MessagesVentanaPrincipal.getString("VentanaPrincipal.mntmEliminarTarea.text")); //$NON-NLS-1$
						mntmEliminarTarea
								.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/iconos/waste-bin.png")));
						mnNewMenu.add(mntmEliminarTarea);
					}
				}
				{
					mnNewMenu_1 = new JMenu(MessagesVentanaPrincipal.getString("VentanaPrincipal.mnNewMenu_1.text")); //$NON-NLS-1$
					mnProyectos.add(mnNewMenu_1);
					{
						mntmNewMenuItem = new JMenuItem(
								MessagesVentanaPrincipal.getString("VentanaPrincipal.mntmNewMenuItem.text")); //$NON-NLS-1$
						mntmNewMenuItem.addActionListener(new MntmNewMenuItemActionListener());
						mntmNewMenuItem.setIcon(
								new ImageIcon(VentanaPrincipal.class.getResource("/iconos/add-filled-cross-sign.png")));
						mnNewMenu_1.add(mntmNewMenuItem);
					}
					{
						mntmNewMenuItem_1 = new JMenuItem(
								MessagesVentanaPrincipal.getString("VentanaPrincipal.mntmNewMenuItem_1.text")); //$NON-NLS-1$
						mntmNewMenuItem_1.addActionListener(new MntmNewMenuItem_1ActionListener());
						mntmNewMenuItem_1.setIcon(
								new ImageIcon(VentanaPrincipal.class.getResource("/iconos/edit-draw-pencil.png")));
						mnNewMenu_1.add(mntmNewMenuItem_1);
					}
					{
						mntmEliminarProyecto_1 = new JMenuItem(
								MessagesVentanaPrincipal.getString("VentanaPrincipal.mntmEliminarProyecto_1.text")); //$NON-NLS-1$
						mntmEliminarProyecto_1.addActionListener(new MntmEliminarProyecto_1ActionListener());
						mntmEliminarProyecto_1
								.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/iconos/waste-bin.png")));
						mnNewMenu_1.add(mntmEliminarProyecto_1);
					}
				}
				{
					mnEdicionSubtareas = new JMenu(
							MessagesVentanaPrincipal.getString("VentanaPrincipal.mnEdicionSubtareas.text")); //$NON-NLS-1$
					mnProyectos.add(mnEdicionSubtareas);
					{
						mntmNuevaSubtarea = new JMenuItem(
								MessagesVentanaPrincipal.getString("VentanaPrincipal.mntmNuevaSubtarea.text")); //$NON-NLS-1$
						mntmNuevaSubtarea.addActionListener(new MntmNuevaSubtareaActionListener());
						mntmNuevaSubtarea.setIcon(
								new ImageIcon(VentanaPrincipal.class.getResource("/iconos/add-filled-cross-sign.png")));
						mnEdicionSubtareas.add(mntmNuevaSubtarea);
					}
					{
						mntmEditarSubtarea = new JMenuItem(
								MessagesVentanaPrincipal.getString("VentanaPrincipal.mntmEditarSubtarea.text")); //$NON-NLS-1$
						mntmEditarSubtarea.addActionListener(new MntmEditarSubtareaActionListener());
						mntmEditarSubtarea.setIcon(
								new ImageIcon(VentanaPrincipal.class.getResource("/iconos/edit-draw-pencil.png")));
						mnEdicionSubtareas.add(mntmEditarSubtarea);
					}
					{
						mntmEliminarSubtarea = new JMenuItem(
								MessagesVentanaPrincipal.getString("VentanaPrincipal.mntmEliminarSubtarea.text")); //$NON-NLS-1$
						mntmEliminarSubtarea.addActionListener(new MntmEliminarSubtareaActionListener());
						mntmEliminarSubtarea
								.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/iconos/waste-bin.png")));
						mnEdicionSubtareas.add(mntmEliminarSubtarea);
					}
					{
						menuBar_1 = new JMenuBar();
						mnEdicionSubtareas.add(menuBar_1);
					}
				}

			}
			{
				mnPersonas = new JMenu(MessagesVentanaPrincipal.getString("VentanaPrincipal.mnPersonas.text")); //$NON-NLS-1$
				barraMenu.add(mnPersonas);
				{
					mntmIrAPersonas = new JMenuItem(
							MessagesVentanaPrincipal.getString("VentanaPrincipal.mntmIrAPersonas.text")); //$NON-NLS-1$
					mntmIrAPersonas
							.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/iconos/grid-world.png")));
					mntmIrAPersonas.setToolTipText(
							MessagesVentanaPrincipal.getString("VentanaPrincipal.mntmIrAPersonas.toolTipText")); //$NON-NLS-1$
					mntmIrAPersonas.addMouseListener(new MouseAdapter() {

					});
					mntmIrAPersonas.addActionListener(new MntmIrAPersonasActionListener());
					mnPersonas.add(mntmIrAPersonas);
				}
				{
					mnEdicionPersonas = new JMenu(
							MessagesVentanaPrincipal.getString("VentanaPrincipal.mnEdicionPersonas.text")); //$NON-NLS-1$
					mnPersonas.add(mnEdicionPersonas);
					{
						mntmNuevaPersona = new JMenuItem(
								MessagesVentanaPrincipal.getString("VentanaPrincipal.mntmNuevaPersona.text")); //$NON-NLS-1$
						mntmNuevaPersona.addActionListener(new MntmNuevaPersonaActionListener());
						mntmNuevaPersona.setIcon(
								new ImageIcon(VentanaPrincipal.class.getResource("/iconos/add-filled-cross-sign.png")));
						mnEdicionPersonas.add(mntmNuevaPersona);
					}
					{
						mntmEditarPersona = new JMenuItem(
								MessagesVentanaPrincipal.getString("VentanaPrincipal.mntmEditarPersona.text")); //$NON-NLS-1$
						mntmEditarPersona.addActionListener(new MntmEditarPersonaActionListener());
						mntmEditarPersona.setIcon(
								new ImageIcon(VentanaPrincipal.class.getResource("/iconos/edit-draw-pencil.png")));
						mnEdicionPersonas.add(mntmEditarPersona);
					}
					{
						mntmEliminarPersona = new JMenuItem(
								MessagesVentanaPrincipal.getString("VentanaPrincipal.mntmEliminarPersona.text")); //$NON-NLS-1$
						mntmEliminarPersona.addActionListener(new MntmEliminarPersonaActionListener());
						mntmEliminarPersona
								.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/iconos/waste-bin.png")));
						mnEdicionPersonas.add(mntmEliminarPersona);
					}
				}
			}

			{
				mnEditarImagen = new JMenu(MessagesVentanaPrincipal.getString("VentanaPrincipal.mnEditarImagen.text")); //$NON-NLS-1$
				barraMenu.add(mnEditarImagen);
				{
					mntmEdicion = new JMenuItem(
							MessagesVentanaPrincipal.getString("VentanaPrincipal.mntmEdicion.text")); //$NON-NLS-1$
					mntmEdicion
							.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/iconos/instagram-logo.png")));
					mntmEdicion.setToolTipText(
							MessagesVentanaPrincipal.getString("VentanaPrincipal.mntmEdicion.toolTipText")); //$NON-NLS-1$
					mntmEdicion.addActionListener(new MntmEdicionListener());
					mnEditarImagen.add(mntmEdicion);
				}

			}
			{
				mnMensajes = new JMenu(MessagesVentanaPrincipal.getString("VentanaPrincipal.mnMensajes.text")); //$NON-NLS-1$
				barraMenu.add(mnMensajes);
				{
					mntmEnviarMensaje = new JMenuItem(
							MessagesVentanaPrincipal.getString("VentanaPrincipal.mntmEnviarMensaje.text")); //$NON-NLS-1$
					mntmEnviarMensaje
							.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/iconos/letter(1).png")));
					mntmEnviarMensaje.setToolTipText(
							MessagesVentanaPrincipal.getString("VentanaPrincipal.mntmEnviarMensaje.toolTipText")); //$NON-NLS-1$
					mntmEnviarMensaje.addActionListener(new MntmEnviarMensajeActionListener());
					mnMensajes.add(mntmEnviarMensaje);
				}
			}
			{
				mnAyuda = new JMenu(MessagesVentanaPrincipal.getString("VentanaPrincipal.mnAyuda.text")); //$NON-NLS-1$
				barraMenu.add(mnAyuda);
				{
					mntmVerAyuda = new JMenuItem(
							MessagesVentanaPrincipal.getString("VentanaPrincipal.mntmVerAyuda.text")); //$NON-NLS-1$
					mntmVerAyuda
							.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/iconos/question-mark.png")));
					mntmVerAyuda.setToolTipText(
							MessagesVentanaPrincipal.getString("VentanaPrincipal.mntmVerAyuda.toolTipText")); //$NON-NLS-1$
					mntmVerAyuda.addActionListener(new MntmVerAyudaActionListener());
					mnAyuda.add(mntmVerAyuda);
				}
			}
			{
				mnInformacin = new JMenu(MessagesVentanaPrincipal.getString("VentanaPrincipal.mnInformacin.text")); //$NON-NLS-1$
				barraMenu.add(mnInformacin);
				{
					mntmACercaDe = new JMenuItem(
							MessagesVentanaPrincipal.getString("VentanaPrincipal.mntmACercaDe.text")); //$NON-NLS-1$
					mntmACercaDe
							.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/iconos/rate-star-button.png")));
					mntmACercaDe.setToolTipText(
							MessagesVentanaPrincipal.getString("VentanaPrincipal.mntmACercaDe.toolTipText")); //$NON-NLS-1$
					mntmACercaDe.addActionListener(new MntmACercaDeActionListener());
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
			panel_ajustes = new JPanel();
			contentPane.add(panel_ajustes, BorderLayout.NORTH);
			panel_ajustes.setLayout(new GridLayout(0, 5, 0, 0));
			{
				horizontalStrut = Box.createHorizontalStrut(20);
				panel_ajustes.add(horizontalStrut);
			}
			{
				lblHola = new JLabel(MessagesVentanaPrincipal.getString("VentanaPrincipal.lblHola.text")); //$NON-NLS-1$
				panel_ajustes.add(lblHola);
			}
			{
				lblNewLabel = new JLabel(lecturaFichero());
				lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
				panel_ajustes.add(lblNewLabel);
			}
			{
				horizontalStrut_2 = Box.createHorizontalStrut(20);
				panel_ajustes.add(horizontalStrut_2);
			}
			{
				panel_aux = new JPanel();
				panel_aux.setAlignmentY(Component.BOTTOM_ALIGNMENT);
				panel_aux.setAlignmentX(Component.LEFT_ALIGNMENT);
				panel_ajustes.add(panel_aux);
				panel_aux.setLayout(new GridLayout(0, 2, 20, 0));
				{
					btnNewButton = new JButton(
							MessagesVentanaPrincipal.getString("VentanaPrincipal.btnNewButton.text")); //$NON-NLS-1$
					btnNewButton.addActionListener(new BtnNewButtonActionListener());
					btnNewButton.setToolTipText("Ajustes");
					panel_aux.add(btnNewButton);
				}
				{
					btnNewButton_1 = new JButton(
							MessagesVentanaPrincipal.getString("VentanaPrincipal.btnNewButton_1.text")); //$NON-NLS-1$
					btnNewButton_1.addActionListener(new BtnNewButton_1ActionListener());
					btnNewButton_1.setToolTipText("Cierre sesión");
					panel_aux.add(btnNewButton_1);
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
			splitPane_inicial = new JSplitPane();
			panel_card.add(splitPane_inicial, "panel_inicial");
			{
				splitPane = new JSplitPane();
				splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
				splitPane_inicial.setLeftComponent(splitPane);
				{
					panel_auxiliar = new JPanel();
					splitPane.setLeftComponent(panel_auxiliar);
				}
				{
					calendar = new JCalendar();
					splitPane.setRightComponent(calendar);
				}
			}
			{
				panel_inicio = new PanelInicial(u);
				splitPane_inicial.setRightComponent(panel_inicio);
				panel_inicio.setLayout(new CardLayout(0, 0));
			}

			splitPane_inicial.setDividerLocation(900);
			{
				panel_tareas = new PanelTarea(panel_card);
				panel_card.add(panel_tareas, "panel_tareas");
			}
			{
				panel_proyectos = new PanelProyecto(panel_card);
				panel_card.add(panel_proyectos, "panel_proyectos");
			}
			{
				panel_personas = new PanelUsuario(u);
				panel_card.add(panel_personas, "panel_personas");
			}
			{
				panel_subtareas = new PanelSubTarea(panel_card);
				panel_card.add(panel_subtareas, "panel_subtareas");
			}
		}
		this.u = u;

	}

	private class MntmVerAyudaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			VentanaAyuda va = new VentanaAyuda();
			va.setVisible(true);
			lblHola.setText("Esta usted en ayuda");
		}
	}

	private class MntmEdicionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			VentanaImagen va = new VentanaImagen();
			va.setVisible(true);
			lblHola.setText("Esta usted en ayuda");
		}
	}

	private class BtnNewButton_1ActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			VentanaLogin v = new VentanaLogin();
			java.util.Date fecha = new Date();
			escrituraFichero(fecha);

			dispose();
		}
	}

	private class MntmIrAProyectosActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			CardLayout cl = (CardLayout) (panel_card.getLayout());
			cl.show(panel_card, "panel_proyectos");
			lblHola.setText("Esta usted en proyectos");

		}
	}

	private class MntmIrAPersonasActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			CardLayout cl = (CardLayout) (panel_card.getLayout());
			cl.show(panel_card, "panel_personas");
			lblHola.setText("Esta usted en personas");
		}
	}

	private class MntmInicioActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			CardLayout cl = (CardLayout) (panel_card.getLayout());
			cl.show(panel_card, "panel_inicial");
			lblHola.setText("¡Hola! Bienvenido al programa");

		}
	}

	private class MntmACercaDeActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			VentanaCreditos vc = new VentanaCreditos();
			vc.setVisible(true);
			lblHola.setText("Creditos");
		}
	}

	private class MntmEnviarMensajeActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			VentanaMensaje vm = new VentanaMensaje();
			vm.setVisible(true);
			lblHola.setText("Esta usted en mensajes");
		}
	}

	private class BtnNewButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {

			 VentanaAjustes va = new VentanaAjustes(vp,u);
			 va.setVisible(true);
			lblHola.setText("Esta usted en ajustes");
		}
	}

	private class MntmNewMenuItemActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			CardLayout cl = (CardLayout) (panel_card.getLayout());
			cl.show(panel_card, "panel_proyectos");
			lblHola.setText("Esta usted en proyectos");

		}
	}

	private class MntmNuevoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			CardLayout cl = (CardLayout) (panel_card.getLayout());
			cl.show(panel_card, "panel_tareas");
			lblHola.setText("Esta usted en tareas");
		}
	}

	private class MntmNuevaSubtareaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			CardLayout cl = (CardLayout) (panel_card.getLayout());
			cl.show(panel_card, "panel_subtareas");
			lblHola.setText("Esta usted en subtareas");

		}
	}

	private class MntmEditarSubtareaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			CardLayout cl = (CardLayout) (panel_card.getLayout());
			cl.show(panel_card, "panel_subtareas");
			lblHola.setText("Esta usted en subtareas");
		}
	}

	private class MntmEliminarSubtareaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			CardLayout cl = (CardLayout) (panel_card.getLayout());
			cl.show(panel_card, "panel_subtareas");
			lblHola.setText("Esta usted en subtareas");
		}
	}

	private class MntmNewMenuItem_1ActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			CardLayout cl = (CardLayout) (panel_card.getLayout());
			cl.show(panel_card, "panel_proyectos");
			lblHola.setText("Esta usted en proyectos");
		}
	}

	private class MntmEliminarProyecto_1ActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			CardLayout cl = (CardLayout) (panel_card.getLayout());
			cl.show(panel_card, "panel_proyectos");
			lblHola.setText("Esta usted en proyectos");
		}
	}

	private class MntmNuevaPersonaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			CardLayout cl = (CardLayout) (panel_card.getLayout());
			cl.show(panel_card, "panel_personas");
			lblHola.setText("Esta usted en personas");

		}
	}

	private class MntmEditarPersonaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			CardLayout cl = (CardLayout) (panel_card.getLayout());
			cl.show(panel_card, "panel_personas");
			lblHola.setText("Esta usted en personas");
		}
	}

	private class MntmEliminarPersonaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			CardLayout cl = (CardLayout) (panel_card.getLayout());
			cl.show(panel_card, "panel_personas");
			lblHola.setText("Esta usted en personas");
		}
	}

	private String lecturaFichero() throws FileNotFoundException {
		String ultimaConexion = "";
		FileReader f = new FileReader("conexion.txt");
		try (BufferedReader b = new BufferedReader(f)) {
			ultimaConexion = b.readLine();
			b.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ultimaConexion;
	}

	private void escrituraFichero(Date dia) {
		FileWriter fichero = null;
		PrintWriter pw = null;
		try {
			fichero = new FileWriter("conexion.txt");
			pw = new PrintWriter(fichero);
			pw.println(dia);

		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			fichero.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
