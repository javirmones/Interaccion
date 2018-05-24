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

import presentacion.paneles.PanelCalendario;
import presentacion.paneles.PanelProyecto;
import presentacion.paneles.PanelUsuario;
import presentacion.personalizado.TablaModelo;

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
	private JMenuItem mntmEliminarProyecto;
	private JMenuItem mntmIrAPersonas;
	private JMenuItem mntmEnviarMensaje;
	private JMenu mnInformacin;
	private JMenuItem mntmACercaDe;
	private JPanel panel_card;
	private JTable table;
	private JPanel panel_2;
	private JMenu mnInicio;
	private JMenuItem mntmInicio;
	private JLabel lblNewLabel;

	public VentanaPrincipal() throws FileNotFoundException {	
		setMinimumSize(new Dimension(720, 480));	
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(VentanaPrincipal.class.getResource("/iconos/rate-star-button.png")));
		setTitle("Gestion de proyectos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		{
			menuBar_1 = new JMenuBar();
			setJMenuBar(menuBar_1);
			{
				mnInicio = new JMenu("Inicio");
				mnInicio.setToolTipText("Ventana de inicio");
				menuBar_1.add(mnInicio);
				{
					mntmInicio = new JMenuItem("Inicio");
					mntmInicio.addActionListener(new MntmInicioActionListener());
					mnInicio.add(mntmInicio);
				}
			}
			{
				mnProyectos = new JMenu("Proyectos");
				
				menuBar_1.add(mnProyectos);
				{
					mntmIrAProyectos = new JMenuItem("Ir a proyectos...");
					mntmIrAProyectos.setToolTipText("Ventana para gestionar los proyectos");
					mntmIrAProyectos.addMouseListener(new MouseAdapter() {
					
						
					});
					mntmIrAProyectos.addActionListener(new MntmIrAProyectosActionListener());
					mnProyectos.add(mntmIrAProyectos);
				}
				
			}
			{
				mnPersonas = new JMenu("Personas");
				menuBar_1.add(mnPersonas);
				{
					mntmIrAPersonas = new JMenuItem("Ir a personas...");
					mntmIrAPersonas.setToolTipText("Ventana para gestionar la plantilla");
					mntmIrAPersonas.addMouseListener(new MouseAdapter() {
						
						
					});
					mntmIrAPersonas.addActionListener(new MntmIrAPersonasActionListener());
					mnPersonas.add(mntmIrAPersonas);
				}
			}
			{
				mnMensajes = new JMenu("Mensajes");
				menuBar_1.add(mnMensajes);
				{
					mntmEnviarMensaje = new JMenuItem("Enviar mensaje");
					mntmEnviarMensaje.setToolTipText("Envio de mensajes");
					mntmEnviarMensaje.addActionListener(new MntmEnviarMensajeActionListener());
					mnMensajes.add(mntmEnviarMensaje);
				}
			}
			{
				mnAyuda = new JMenu("Ayuda");
				menuBar_1.add(mnAyuda);
				{
					mntmVerAyuda = new JMenuItem("Ver ayuda");
					mntmVerAyuda.setToolTipText("Ayuda del sistema");
					mntmVerAyuda.addActionListener(new MntmVerAyudaActionListener());
					mnAyuda.add(mntmVerAyuda);
				}
			}
			{
				mnInformacin = new JMenu("Información");
				menuBar_1.add(mnInformacin);
				{
					mntmACercaDe = new JMenuItem("A cerca de...");
					mntmACercaDe.setToolTipText("Informacion sobre los programadores");
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
				lblNewLabel = new JLabel(lecturaFichero());
				lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
				panel_3.add(lblNewLabel);
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
					btnNewButton = new JButton("Ajustes");
					panel_4.add(btnNewButton);
				}
				{
					btnNewButton_1 = new JButton("Cerrar sesión");
					btnNewButton_1.addActionListener(new BtnNewButton_1ActionListener());
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
			panel_card.add(splitPane, "panel_inicial");
			
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
						
						panel_5.add(c1, "panel_calendario");
					}
				
				}
				{
					panel_7 = new JPanel();
					splitPane_1.setRightComponent(panel_7);
					panel_7.setLayout(new CardLayout(0, 0));
					{
						TablaModelo tb= new TablaModelo();
						table = new JTable();
						//table.setModel(tb);
						
						panel_7.add(table, "name_188720639094886");
						
												
					}
			
				}
				splitPane_1.setDividerLocation(300);
			}
			splitPane.setDividerLocation(550);
			{
				panel_2 = new PanelProyecto();
				panel_card.add(panel_2, "panel_proyectos");
			}
			{
				panel_7 = new PanelUsuario();
				panel_card.add(panel_7, "panel_personas");
			}
		}
	}
	

	private class MntmVerAyudaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			VentanaAyuda va = new VentanaAyuda();
			va.setVisible(true);
		}
	}
	private class BtnNewButton_1ActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			VentanaLogin v=new VentanaLogin();
			java.util.Date fecha = new Date();
			escrituraFichero(fecha);
			
			dispose();
		}
	}

	private class MntmIrAProyectosActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			CardLayout cl = (CardLayout) (panel_card.getLayout());
			cl.show(panel_card, "panel_proyectos");

		}
	}

	private class MntmIrAPersonasActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			CardLayout cl = (CardLayout) (panel_card.getLayout());
			cl.show(panel_card, "panel_personas");

		}
	}
	private class MntmInicioActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			CardLayout cl = (CardLayout) (panel_card.getLayout());
			cl.show(panel_card, "panel_inicial");
		}
	}
	private class MntmACercaDeActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			VentanaCreditos vc = new VentanaCreditos();
			vc.setVisible(true);
		}
	}
	private class MntmEnviarMensajeActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			VentanaMensaje vm = new VentanaMensaje();
			vm.setVisible(true);
		}
	}
	
	private String lecturaFichero() throws FileNotFoundException {
		String ultimaConexion="";
		FileReader f = new FileReader("conexion.txt");
		try (BufferedReader b = new BufferedReader(f)) {
             ultimaConexion=b.readLine();
        b.close();
    }   catch(Exception e){
                e.printStackTrace();
                    }  
    return ultimaConexion;
	}
	
	private void escrituraFichero(Date dia) {
		FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
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
