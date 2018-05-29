package presentacion.paneles;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JScrollPane;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.CardLayout;
import javax.swing.JList;
import javax.swing.border.TitledBorder;

import persistencia.GestorTareas;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.event.ListSelectionListener;

import dominio.Tarea;

import javax.swing.event.ListSelectionEvent;

public class PanelTarea extends JPanel {
	private JPanel panelcontenido;
	private JScrollPane scrollPaneTareas;
	private JList<Tarea> listTareas;
	private JScrollPane scrollPane_subtareas;
	private JList<Tarea> SubTareas;
	private JLabel lblNombre;
	private JLabel lblFechaInicio;
	private JLabel lblFechaFin;
	private JLabel lblPrioridad;
	private JTextField txtNombre;
	private JTextField txtFechaInicio;
	private JTextField txtFechaFin;
	private JScrollPane scrollPaneComentarios;
	private JPanel panelbotones;
	private JTextArea textArea;
	private JButton btnAniadirSubtarea;
	private JPanel panelCard;
	private String subtarea="subtarea";
	private JSpinner spnPrioridad;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private GestorTareas gt = new GestorTareas();
	private Tarea t;

	/**
	 * Create the panel.
	 */
	
	public PanelTarea(JPanel p) {
		setLayout(new CardLayout(0, 0));
		{
			panelcontenido = new JPanel();
			add(panelcontenido, "name_328803660633333");
			GridBagLayout gbl_panelcontenido = new GridBagLayout();
			gbl_panelcontenido.columnWidths = new int[]{64, 73, 106, 60, 85, 48, 57, 51, 45, 60, 50, 64, 86, 0, 48, 0, 0, 0};
			gbl_panelcontenido.rowHeights = new int[]{34, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 33, 0, 38, 14, 60, 27, 0, 0};
			gbl_panelcontenido.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
			gbl_panelcontenido.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			panelcontenido.setLayout(gbl_panelcontenido);
			{
				scrollPaneTareas = new JScrollPane();
				GridBagConstraints gbc_scrollPaneTareas = new GridBagConstraints();
				gbc_scrollPaneTareas.gridwidth = 3;
				gbc_scrollPaneTareas.gridheight = 9;
				gbc_scrollPaneTareas.insets = new Insets(0, 0, 5, 5);
				gbc_scrollPaneTareas.fill = GridBagConstraints.BOTH;
				gbc_scrollPaneTareas.gridx = 0;
				gbc_scrollPaneTareas.gridy = 0;
				panelcontenido.add(scrollPaneTareas, gbc_scrollPaneTareas);
				{
					listTareas = new JList();
					listTareas.addListSelectionListener(new ListTareasListSelectionListener());
					listTareas.setBorder(new TitledBorder(null, "Tareas", TitledBorder.LEADING, TitledBorder.TOP, null, null));
					listTareas.setModel(gt.getLista());
					listTareas.addListSelectionListener(new ListTareasListSelectionListener());
					scrollPaneTareas.setViewportView(listTareas);
				}
			}
			{
				lblNombre = new JLabel("Nombre");
				lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 16));
				GridBagConstraints gbc_lblNombre = new GridBagConstraints();
				gbc_lblNombre.fill = GridBagConstraints.HORIZONTAL;
				gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
				gbc_lblNombre.gridx = 4;
				gbc_lblNombre.gridy = 1;
				panelcontenido.add(lblNombre, gbc_lblNombre);
			}
			{
				txtNombre = new JTextField();
				GridBagConstraints gbc_txtNombre = new GridBagConstraints();
				gbc_txtNombre.gridwidth = 11;
				gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
				gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtNombre.gridx = 5;
				gbc_txtNombre.gridy = 1;
				panelcontenido.add(txtNombre, gbc_txtNombre);
				txtNombre.setColumns(10);
			}
			{
				lblFechaInicio = new JLabel("Fecha inicio");
				lblFechaInicio.setFont(new Font("Tahoma", Font.PLAIN, 16));
				GridBagConstraints gbc_lblFechaInicio = new GridBagConstraints();
				gbc_lblFechaInicio.fill = GridBagConstraints.HORIZONTAL;
				gbc_lblFechaInicio.insets = new Insets(0, 0, 5, 5);
				gbc_lblFechaInicio.gridx = 4;
				gbc_lblFechaInicio.gridy = 3;
				panelcontenido.add(lblFechaInicio, gbc_lblFechaInicio);
			}
			{
				txtFechaInicio = new JTextField();
				GridBagConstraints gbc_txtFechaInicio = new GridBagConstraints();
				gbc_txtFechaInicio.gridwidth = 11;
				gbc_txtFechaInicio.insets = new Insets(0, 0, 5, 5);
				gbc_txtFechaInicio.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtFechaInicio.gridx = 5;
				gbc_txtFechaInicio.gridy = 3;
				panelcontenido.add(txtFechaInicio, gbc_txtFechaInicio);
				txtFechaInicio.setColumns(10);
			}
			{
				lblFechaFin = new JLabel("Fecha fin");
				lblFechaFin.setFont(new Font("Tahoma", Font.PLAIN, 16));
				GridBagConstraints gbc_lblFechaFin = new GridBagConstraints();
				gbc_lblFechaFin.fill = GridBagConstraints.HORIZONTAL;
				gbc_lblFechaFin.insets = new Insets(0, 0, 5, 5);
				gbc_lblFechaFin.gridx = 4;
				gbc_lblFechaFin.gridy = 5;
				panelcontenido.add(lblFechaFin, gbc_lblFechaFin);
			}
			{
				txtFechaFin = new JTextField();
				GridBagConstraints gbc_txtFechaFin = new GridBagConstraints();
				gbc_txtFechaFin.gridwidth = 11;
				gbc_txtFechaFin.insets = new Insets(0, 0, 5, 5);
				gbc_txtFechaFin.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtFechaFin.gridx = 5;
				gbc_txtFechaFin.gridy = 5;
				panelcontenido.add(txtFechaFin, gbc_txtFechaFin);
				txtFechaFin.setColumns(10);
			}
			{
				lblPrioridad = new JLabel("Prioridad");
				lblPrioridad.setFont(new Font("Tahoma", Font.PLAIN, 16));
				GridBagConstraints gbc_lblPrioridad = new GridBagConstraints();
				gbc_lblPrioridad.fill = GridBagConstraints.HORIZONTAL;
				gbc_lblPrioridad.insets = new Insets(0, 0, 5, 5);
				gbc_lblPrioridad.gridx = 4;
				gbc_lblPrioridad.gridy = 7;
				panelcontenido.add(lblPrioridad, gbc_lblPrioridad);
			}
			{
				spnPrioridad = new JSpinner();
				GridBagConstraints gbc_spnPrioridad = new GridBagConstraints();
				gbc_spnPrioridad.insets = new Insets(0, 0, 5, 5);
				gbc_spnPrioridad.gridx = 5;
				gbc_spnPrioridad.gridy = 7;
				panelcontenido.add(spnPrioridad, gbc_spnPrioridad);
			}
			{
				scrollPane_subtareas = new JScrollPane();
				GridBagConstraints gbc_scrollPane_subtareas = new GridBagConstraints();
				gbc_scrollPane_subtareas.gridwidth = 3;
				gbc_scrollPane_subtareas.gridheight = 10;
				gbc_scrollPane_subtareas.insets = new Insets(0, 0, 5, 5);
				gbc_scrollPane_subtareas.fill = GridBagConstraints.BOTH;
				gbc_scrollPane_subtareas.gridx = 0;
				gbc_scrollPane_subtareas.gridy = 9;
				panelcontenido.add(scrollPane_subtareas, gbc_scrollPane_subtareas);
				{
					SubTareas = new JList();
					SubTareas.setBorder(new TitledBorder(null, "SubTareas", TitledBorder.LEADING, TitledBorder.TOP, null, null));
					scrollPane_subtareas.setViewportView(SubTareas);
				}
			}
			{
				scrollPaneComentarios = new JScrollPane();
				GridBagConstraints gbc_scrollPaneComentarios = new GridBagConstraints();
				gbc_scrollPaneComentarios.gridwidth = 12;
				gbc_scrollPaneComentarios.gridheight = 5;
				gbc_scrollPaneComentarios.insets = new Insets(0, 0, 5, 5);
				gbc_scrollPaneComentarios.fill = GridBagConstraints.BOTH;
				gbc_scrollPaneComentarios.gridx = 4;
				gbc_scrollPaneComentarios.gridy = 9;
				panelcontenido.add(scrollPaneComentarios, gbc_scrollPaneComentarios);
				{
					textArea = new JTextArea();
					textArea.setBorder(new TitledBorder(null, "Comentarios", TitledBorder.LEADING, TitledBorder.TOP, null, null));
					textArea.setEditable(false);
					scrollPaneComentarios.setViewportView(textArea);
				}
			}
			{
				btnAniadirSubtarea = new JButton("Añadir Subtarea");
				btnAniadirSubtarea.setIcon(new ImageIcon(PanelTarea.class.getResource("/iconos/text-documents.png")));
				btnAniadirSubtarea.addActionListener(new BtnNewButtonActionListener());
				GridBagConstraints gbc_btnAniadirSubtarea = new GridBagConstraints();
				gbc_btnAniadirSubtarea.fill = GridBagConstraints.BOTH;
				gbc_btnAniadirSubtarea.gridwidth = 14;
				gbc_btnAniadirSubtarea.gridheight = 2;
				gbc_btnAniadirSubtarea.insets = new Insets(0, 0, 5, 0);
				gbc_btnAniadirSubtarea.gridx = 3;
				gbc_btnAniadirSubtarea.gridy = 15;
				panelcontenido.add(btnAniadirSubtarea, gbc_btnAniadirSubtarea);
			}
			{
				btnNewButton = new JButton("Añadir");
				btnNewButton.setIcon(new ImageIcon(PanelTarea.class.getResource("/iconos/add-filled-cross-sign.png")));
				GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
				gbc_btnNewButton.fill = GridBagConstraints.BOTH;
				gbc_btnNewButton.gridwidth = 4;
				gbc_btnNewButton.gridheight = 2;
				gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
				gbc_btnNewButton.gridx = 3;
				gbc_btnNewButton.gridy = 17;
				panelcontenido.add(btnNewButton, gbc_btnNewButton);
			}
			{
				btnNewButton_1 = new JButton("Editar");
				btnNewButton_1.setIcon(new ImageIcon(PanelTarea.class.getResource("/iconos/edit-draw-pencil.png")));
				GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
				gbc_btnNewButton_1.fill = GridBagConstraints.BOTH;
				gbc_btnNewButton_1.gridwidth = 5;
				gbc_btnNewButton_1.gridheight = 2;
				gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
				gbc_btnNewButton_1.gridx = 7;
				gbc_btnNewButton_1.gridy = 17;
				panelcontenido.add(btnNewButton_1, gbc_btnNewButton_1);
			}
			{
				btnNewButton_2 = new JButton("Eliminar");
				btnNewButton_2.setIcon(new ImageIcon(PanelTarea.class.getResource("/iconos/waste-bin.png")));
				GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
				gbc_btnNewButton_2.fill = GridBagConstraints.BOTH;
				gbc_btnNewButton_2.gridwidth = 5;
				gbc_btnNewButton_2.gridheight = 2;
				gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 0);
				gbc_btnNewButton_2.gridx = 12;
				gbc_btnNewButton_2.gridy = 17;
				panelcontenido.add(btnNewButton_2, gbc_btnNewButton_2);
			}
							
		}
		panelCard=p;
	}
	


	private class BtnNewButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			CardLayout cl = (CardLayout) (panelCard.getLayout());
			cl.show(panelCard, "panel_subtareas");

		}
	}
	private class ListTareasListSelectionListener implements ListSelectionListener {
		public void valueChanged(ListSelectionEvent arg0) {
		
			t= listTareas.getSelectedValue();
			DefaultListModel<Tarea> dfm = new DefaultListModel<>();

			//actualizarsubTareas(t);
			if (t != null) {
				txtNombre.setText(t.getNombre());
				txtFechaInicio.setText(t.getFechaIni());
				txtFechaFin.setText(t.getFechaFin());
				spnPrioridad.setValue(t.getPrioridad());
				textArea.setText(t.getComentarios());
			} else {
				txtNombre.setText("");
				txtFechaInicio.setText("");
				txtFechaFin.setText("");
				spnPrioridad.setValue("");
				textArea.setText("");
				

			}
		}
	}
	
	public void actualizarsubTareas(Tarea t) {
		DefaultListModel<Tarea> te = new DefaultListModel<>();
		for (int i = 0; i < t.getSubtareas().size(); i++) {
			te.addElement(t.getSubtareas().get(i));
		}
		SubTareas.setModel(te);
	}
}
