package presentacion.paneles;

import javax.swing.JPanel;
import javax.swing.JSplitPane;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.JTree;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.border.TitledBorder;

import dominio.Proyecto;
import dominio.Usuario;
import persistencia.GestorProyectos;
import persistencia.GestorTareas;
import presentacion.VentanaPrincipal;

import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JSpinner;
import javax.swing.UIManager;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

public class PanelProyecto extends JPanel {
	private JScrollPane scrollPane;
	private JScrollPane scrollPaneTareas;
	private JList listTareas;
	private JPanel panelBotones;
	private JLabel lblNombre;
	private JLabel lblFecha;
	private JLabel lblEncargado;
	private JLabel lblEstado;
	private JTextField textNombre;
	private JTextField txtFecha;
	private JTextField textEncargado;
	private JTextField txtEstado;
	private JScrollPane scrollPaneDescripcion;
	private JTextArea textAreaDescripcion;
	private JList<Proyecto> listaProyectos;
	private GestorProyectos gp= new GestorProyectos();
	private GestorTareas gt= new GestorTareas();
	private JButton btnAniadirTarea;
	private JButton btnSubtarea;
	private JPanel panelCard;
	private String prt = "proyecto";


	/**
	 * Create the panel.
	 */
	public PanelProyecto(JPanel p) {
		setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 55, 0, 74, 57, 0, 176, 49, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 42, 0, 0, 0, 0, 0, 0, 0, 0, 38, 73, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		{
			scrollPane = new JScrollPane();
			GridBagConstraints gbc_scrollPane = new GridBagConstraints();
			gbc_scrollPane.gridheight = 7;
			gbc_scrollPane.gridwidth = 9;
			gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
			gbc_scrollPane.fill = GridBagConstraints.BOTH;
			gbc_scrollPane.gridx = 0;
			gbc_scrollPane.gridy = 0;
			add(scrollPane, gbc_scrollPane);
			{
				listaProyectos = new JList();
				listaProyectos.addListSelectionListener(new ListaProyectosListSelectionListener());
				listaProyectos.setBorder(new TitledBorder(null, "Proyectos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				listaProyectos.setModel(gp.etLista());
				listaProyectos.addListSelectionListener(new ListaProyectosListSelectionListener());
				scrollPane.setViewportView(listaProyectos);
			}
		}
		{
			lblNombre = new JLabel("Nombre");
			GridBagConstraints gbc_lblNombre = new GridBagConstraints();
			gbc_lblNombre.fill = GridBagConstraints.HORIZONTAL;
			gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
			gbc_lblNombre.gridx = 10;
			gbc_lblNombre.gridy = 1;
			add(lblNombre, gbc_lblNombre);
		}
		{
			textNombre = new JTextField();
			GridBagConstraints gbc_textNombre = new GridBagConstraints();
			gbc_textNombre.gridwidth = 4;
			gbc_textNombre.insets = new Insets(0, 0, 5, 5);
			gbc_textNombre.fill = GridBagConstraints.HORIZONTAL;
			gbc_textNombre.gridx = 11;
			gbc_textNombre.gridy = 1;
			add(textNombre, gbc_textNombre);
			textNombre.setColumns(10);
		}
		{
			lblFecha = new JLabel("Fecha creacion");
			GridBagConstraints gbc_lblFecha = new GridBagConstraints();
			gbc_lblFecha.fill = GridBagConstraints.HORIZONTAL;
			gbc_lblFecha.insets = new Insets(0, 0, 5, 5);
			gbc_lblFecha.gridx = 10;
			gbc_lblFecha.gridy = 2;
			add(lblFecha, gbc_lblFecha);
		}
		{
			txtFecha = new JTextField();
			GridBagConstraints gbc_txtFecha = new GridBagConstraints();
			gbc_txtFecha.gridwidth = 4;
			gbc_txtFecha.insets = new Insets(0, 0, 5, 5);
			gbc_txtFecha.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtFecha.gridx = 11;
			gbc_txtFecha.gridy = 2;
			add(txtFecha, gbc_txtFecha);
			txtFecha.setColumns(10);
		}
		{
			lblEncargado = new JLabel("Encargado");
			GridBagConstraints gbc_lblEncargado = new GridBagConstraints();
			gbc_lblEncargado.fill = GridBagConstraints.HORIZONTAL;
			gbc_lblEncargado.insets = new Insets(0, 0, 5, 5);
			gbc_lblEncargado.gridx = 10;
			gbc_lblEncargado.gridy = 3;
			add(lblEncargado, gbc_lblEncargado);
		}
		{
			textEncargado = new JTextField();
			GridBagConstraints gbc_textEncargado = new GridBagConstraints();
			gbc_textEncargado.gridwidth = 4;
			gbc_textEncargado.insets = new Insets(0, 0, 5, 5);
			gbc_textEncargado.fill = GridBagConstraints.HORIZONTAL;
			gbc_textEncargado.gridx = 11;
			gbc_textEncargado.gridy = 3;
			add(textEncargado, gbc_textEncargado);
			textEncargado.setColumns(10);
		}
		{
			lblEstado = new JLabel("Estado");
			GridBagConstraints gbc_lblEstado = new GridBagConstraints();
			gbc_lblEstado.fill = GridBagConstraints.HORIZONTAL;
			gbc_lblEstado.insets = new Insets(0, 0, 5, 5);
			gbc_lblEstado.gridx = 10;
			gbc_lblEstado.gridy = 4;
			add(lblEstado, gbc_lblEstado);
		}
		{
			txtEstado = new JTextField();
			GridBagConstraints gbc_txtEstado = new GridBagConstraints();
			gbc_txtEstado.gridwidth = 4;
			gbc_txtEstado.insets = new Insets(0, 0, 5, 5);
			gbc_txtEstado.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtEstado.gridx = 11;
			gbc_txtEstado.gridy = 4;
			add(txtEstado, gbc_txtEstado);
			txtEstado.setColumns(10);
		}
		{
			scrollPaneTareas = new JScrollPane();
			GridBagConstraints gbc_scrollPaneTareas = new GridBagConstraints();
			gbc_scrollPaneTareas.gridwidth = 9;
			gbc_scrollPaneTareas.gridheight = 8;
			gbc_scrollPaneTareas.insets = new Insets(0, 0, 0, 5);
			gbc_scrollPaneTareas.fill = GridBagConstraints.BOTH;
			gbc_scrollPaneTareas.gridx = 0;
			gbc_scrollPaneTareas.gridy = 7;
			add(scrollPaneTareas, gbc_scrollPaneTareas);
			{
				listTareas = new JList();
				listTareas.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Tareas", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
				listTareas.setModel(gt.getLista());
				scrollPaneTareas.setViewportView(listTareas);
				
			}
		}
		{
			scrollPaneDescripcion = new JScrollPane();
			GridBagConstraints gbc_scrollPaneDescripcion = new GridBagConstraints();
			gbc_scrollPaneDescripcion.gridwidth = 5;
			gbc_scrollPaneDescripcion.gridheight = 6;
			gbc_scrollPaneDescripcion.insets = new Insets(0, 0, 5, 5);
			gbc_scrollPaneDescripcion.fill = GridBagConstraints.BOTH;
			gbc_scrollPaneDescripcion.gridx = 10;
			gbc_scrollPaneDescripcion.gridy = 6;
			add(scrollPaneDescripcion, gbc_scrollPaneDescripcion);
			{
				textAreaDescripcion = new JTextArea();
				textAreaDescripcion.setBorder(new TitledBorder(null, "Descripcion", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				textAreaDescripcion.setEditable(false);
				scrollPaneDescripcion.setViewportView(textAreaDescripcion);
			}
		}
		{
			btnAniadirTarea = new JButton("AñadirTarea");
			btnAniadirTarea.setIcon(new ImageIcon(PanelProyecto.class.getResource("/iconos/edit-document.png")));
			btnAniadirTarea.addActionListener(new BtnAniadirTareaActionListener());
			GridBagConstraints gbc_btnAniadirTarea = new GridBagConstraints();
			gbc_btnAniadirTarea.fill = GridBagConstraints.BOTH;
			gbc_btnAniadirTarea.gridheight = 2;
			gbc_btnAniadirTarea.gridwidth = 4;
			gbc_btnAniadirTarea.insets = new Insets(0, 0, 5, 5);
			gbc_btnAniadirTarea.gridx = 9;
			gbc_btnAniadirTarea.gridy = 12;
			add(btnAniadirTarea, gbc_btnAniadirTarea);
		}
		{
			btnSubtarea = new JButton("Añadir Subtarea");
			btnSubtarea.setIcon(new ImageIcon(PanelProyecto.class.getResource("/iconos/text-documents.png")));
			btnSubtarea.addActionListener(new BtnNewButtonActionListener());
			GridBagConstraints gbc_btnSubtarea = new GridBagConstraints();
			gbc_btnSubtarea.fill = GridBagConstraints.BOTH;
			gbc_btnSubtarea.gridwidth = 3;
			gbc_btnSubtarea.gridheight = 2;
			gbc_btnSubtarea.insets = new Insets(0, 0, 5, 5);
			gbc_btnSubtarea.gridx = 13;
			gbc_btnSubtarea.gridy = 12;
			add(btnSubtarea, gbc_btnSubtarea);
		}
		{
			panelBotones = new PanelBotones(prt);
			GridBagConstraints gbc_panelBotones = new GridBagConstraints();
			gbc_panelBotones.gridwidth = 7;
			gbc_panelBotones.fill = GridBagConstraints.BOTH;
			gbc_panelBotones.gridx = 9;
			gbc_panelBotones.gridy = 14;
			add(panelBotones, gbc_panelBotones);
		}
		panelCard=p;
	}

	private class BtnAniadirTareaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			boolean enable = true;
		    CardLayout cl = (CardLayout) (panelCard.getLayout());
			cl.show(panelCard, "panel_tareas");
		}
	}
	private class BtnNewButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			 CardLayout cl = (CardLayout) (panelCard.getLayout());
				cl.show(panelCard, "panel_subtareas");
		}
	}
	private class ListaProyectosListSelectionListener implements ListSelectionListener {
		public void valueChanged(ListSelectionEvent arg0) {
			Proyecto p= listaProyectos.getSelectedValue();
			if (p != null) {
				textNombre.setText(p.getNombre());
				txtFecha.setText(p.getFechaCreacion());
				textEncargado.setText(p.getEncargado());
				textAreaDescripcion.setText(p.getDescripcion());
				txtEstado.setText(p.getEstado());

			} else {
				textNombre.setText("");
				txtFecha.setText("");
				textEncargado.setText("");
				textAreaDescripcion.setText("");
				txtEstado.setText("");
				
			}
		}
	}
}
