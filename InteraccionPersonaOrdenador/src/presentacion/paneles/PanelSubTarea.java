package presentacion.paneles;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JScrollPane;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.CardLayout;
import javax.swing.JList;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.event.ListSelectionListener;

import dominio.Tarea;
import persistencia.GestorTareas;

import javax.swing.event.ListSelectionEvent;

public class PanelSubTarea extends JPanel {
	private JPanel panelContenido;
	private JScrollPane scrollPane_subtareas;
	private JList<Tarea> SubTareas;
	private JLabel lblNombre;
	private JLabel lblFechaInicio;
	private JLabel lblFechaFin;
	private JLabel lblPrioridad;
	private JTextField textNombre;
	private JTextField textFechaInicio;
	private JTextField textFechaFin;
	private JScrollPane scrollPaneComentarios;
	private JPanel panelbotones;
	private JTextArea textArea;
	private String tarea = "tarea";
	private JSpinner spnPrioridad;
	private JPanel panelCard;
	private JButton btnAniadir;
	private JButton btnEditar;
	private JButton btnEliminar;
	private GestorTareas gt = new GestorTareas();
	private Tarea t;
	private JButton btnAtras;

	/**
	 *
	 * Create the panel.
	 */
	public PanelSubTarea(JPanel p) {
		setLayout(new CardLayout(0, 0));
		{
			panelContenido = new JPanel();
			add(panelContenido, "name_328803660633333");
			GridBagLayout gbl_panelContenido = new GridBagLayout();
			gbl_panelContenido.columnWidths = new int[] { 64, 73, 106, 60, 109, 48, 57, 51, 45, 50, 79, 64, 86, 0, 48,
					0, 0, 0 };
			gbl_panelContenido.rowHeights = new int[] { 34, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 39, 0, 74, 0, 0,
					0 };
			gbl_panelContenido.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0,
					0.0, 1.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
			gbl_panelContenido.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
					0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
			panelContenido.setLayout(gbl_panelContenido);
			{
				lblNombre = new JLabel("Nombre");
				lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 16));
				GridBagConstraints gbc_lblNombre = new GridBagConstraints();
				gbc_lblNombre.fill = GridBagConstraints.HORIZONTAL;
				gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
				gbc_lblNombre.gridx = 4;
				gbc_lblNombre.gridy = 1;
				panelContenido.add(lblNombre, gbc_lblNombre);
			}
			{
				textNombre = new JTextField();
				GridBagConstraints gbc_textNombre = new GridBagConstraints();
				gbc_textNombre.gridwidth = 11;
				gbc_textNombre.insets = new Insets(0, 0, 5, 5);
				gbc_textNombre.fill = GridBagConstraints.HORIZONTAL;
				gbc_textNombre.gridx = 5;
				gbc_textNombre.gridy = 1;
				panelContenido.add(textNombre, gbc_textNombre);
				textNombre.setColumns(10);
			}
			{
				lblFechaInicio = new JLabel("Fecha inicio");
				lblFechaInicio.setFont(new Font("Tahoma", Font.PLAIN, 16));
				GridBagConstraints gbc_lblFechaInicio = new GridBagConstraints();
				gbc_lblFechaInicio.fill = GridBagConstraints.HORIZONTAL;
				gbc_lblFechaInicio.insets = new Insets(0, 0, 5, 5);
				gbc_lblFechaInicio.gridx = 4;
				gbc_lblFechaInicio.gridy = 3;
				panelContenido.add(lblFechaInicio, gbc_lblFechaInicio);
			}
			{
				textFechaInicio = new JTextField();
				GridBagConstraints gbc_textFechaInicio = new GridBagConstraints();
				gbc_textFechaInicio.gridwidth = 11;
				gbc_textFechaInicio.insets = new Insets(0, 0, 5, 5);
				gbc_textFechaInicio.fill = GridBagConstraints.HORIZONTAL;
				gbc_textFechaInicio.gridx = 5;
				gbc_textFechaInicio.gridy = 3;
				panelContenido.add(textFechaInicio, gbc_textFechaInicio);
				textFechaInicio.setColumns(10);
			}
			{
				lblFechaFin = new JLabel("Fecha fin");
				lblFechaFin.setFont(new Font("Tahoma", Font.PLAIN, 16));
				GridBagConstraints gbc_lblFechaFin = new GridBagConstraints();
				gbc_lblFechaFin.fill = GridBagConstraints.HORIZONTAL;
				gbc_lblFechaFin.insets = new Insets(0, 0, 5, 5);
				gbc_lblFechaFin.gridx = 4;
				gbc_lblFechaFin.gridy = 5;
				panelContenido.add(lblFechaFin, gbc_lblFechaFin);
			}
			{
				textFechaFin = new JTextField();
				GridBagConstraints gbc_textFechaFin = new GridBagConstraints();
				gbc_textFechaFin.gridwidth = 11;
				gbc_textFechaFin.insets = new Insets(0, 0, 5, 5);
				gbc_textFechaFin.fill = GridBagConstraints.HORIZONTAL;
				gbc_textFechaFin.gridx = 5;
				gbc_textFechaFin.gridy = 5;
				panelContenido.add(textFechaFin, gbc_textFechaFin);
				textFechaFin.setColumns(10);
			}
			{
				lblPrioridad = new JLabel("Prioridad");
				lblPrioridad.setFont(new Font("Tahoma", Font.PLAIN, 16));
				GridBagConstraints gbc_lblPrioridad = new GridBagConstraints();
				gbc_lblPrioridad.fill = GridBagConstraints.HORIZONTAL;
				gbc_lblPrioridad.insets = new Insets(0, 0, 5, 5);
				gbc_lblPrioridad.gridx = 4;
				gbc_lblPrioridad.gridy = 7;
				panelContenido.add(lblPrioridad, gbc_lblPrioridad);
			}
			{
				scrollPane_subtareas = new JScrollPane();
				GridBagConstraints gbc_scrollPane_subtareas = new GridBagConstraints();
				gbc_scrollPane_subtareas.gridwidth = 3;
				gbc_scrollPane_subtareas.gridheight = 19;
				gbc_scrollPane_subtareas.insets = new Insets(0, 0, 5, 5);
				gbc_scrollPane_subtareas.fill = GridBagConstraints.BOTH;
				gbc_scrollPane_subtareas.gridx = 0;
				gbc_scrollPane_subtareas.gridy = 0;
				panelContenido.add(scrollPane_subtareas, gbc_scrollPane_subtareas);
				{
					SubTareas = new JList();
					SubTareas.addListSelectionListener(new SubTareasListSelectionListener());
					SubTareas.setBorder(
							new TitledBorder(null, "SubTareas", TitledBorder.LEADING, TitledBorder.TOP, null, null));
					SubTareas.setModel(gt.getLista());
					SubTareas.addListSelectionListener(new SubTareasListSelectionListener());
					scrollPane_subtareas.setViewportView(SubTareas);
				}
			}
			{
				spnPrioridad = new JSpinner();
				GridBagConstraints gbc_spnPrioridad = new GridBagConstraints();
				gbc_spnPrioridad.insets = new Insets(0, 0, 5, 5);
				gbc_spnPrioridad.gridx = 5;
				gbc_spnPrioridad.gridy = 7;
				panelContenido.add(spnPrioridad, gbc_spnPrioridad);
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
				panelContenido.add(scrollPaneComentarios, gbc_scrollPaneComentarios);
				{
					textArea = new JTextArea();
					textArea.setBorder(
							new TitledBorder(null, "Comentarios", TitledBorder.LEADING, TitledBorder.TOP, null, null));
					textArea.setEditable(false);
					scrollPaneComentarios.setViewportView(textArea);
				}
			}
			{
				btnAtras = new JButton("Atrás");
				btnAtras.addActionListener(new BtnAtrasActionListener());
				btnAtras.setIcon(new ImageIcon(PanelSubTarea.class.getResource("/iconos/back-arrow.png")));
				GridBagConstraints gbc_btnAtras = new GridBagConstraints();
				gbc_btnAtras.fill = GridBagConstraints.BOTH;
				gbc_btnAtras.gridwidth = 14;
				gbc_btnAtras.gridheight = 2;
				gbc_btnAtras.insets = new Insets(0, 0, 5, 5);
				gbc_btnAtras.gridx = 3;
				gbc_btnAtras.gridy = 15;
				panelContenido.add(btnAtras, gbc_btnAtras);
			}
			{
				btnAniadir = new JButton("Añadir");
				btnAniadir.setIcon(new ImageIcon(PanelSubTarea.class.getResource("/iconos/add-filled-cross-sign.png")));
				GridBagConstraints gbc_btnAniadir = new GridBagConstraints();
				gbc_btnAniadir.fill = GridBagConstraints.BOTH;
				gbc_btnAniadir.gridwidth = 4;
				gbc_btnAniadir.gridheight = 2;
				gbc_btnAniadir.insets = new Insets(0, 0, 5, 5);
				gbc_btnAniadir.gridx = 3;
				gbc_btnAniadir.gridy = 17;
				panelContenido.add(btnAniadir, gbc_btnAniadir);
			}
			{
				btnEditar = new JButton("Modificar");
				btnEditar.setIcon(new ImageIcon(PanelSubTarea.class.getResource("/iconos/edit-draw-pencil.png")));
				GridBagConstraints gbc_btnEditar = new GridBagConstraints();
				gbc_btnEditar.fill = GridBagConstraints.BOTH;
				gbc_btnEditar.gridwidth = 4;
				gbc_btnEditar.gridheight = 2;
				gbc_btnEditar.insets = new Insets(0, 0, 5, 5);
				gbc_btnEditar.gridx = 7;
				gbc_btnEditar.gridy = 17;
				panelContenido.add(btnEditar, gbc_btnEditar);
			}
			{
				btnEliminar = new JButton("Eliminar");
				btnEliminar.setIcon(new ImageIcon(PanelSubTarea.class.getResource("/iconos/waste-bin.png")));
				GridBagConstraints gbc_btnEliminar = new GridBagConstraints();
				gbc_btnEliminar.fill = GridBagConstraints.BOTH;
				gbc_btnEliminar.gridwidth = 6;
				gbc_btnEliminar.gridheight = 2;
				gbc_btnEliminar.insets = new Insets(0, 0, 5, 0);
				gbc_btnEliminar.gridx = 11;
				gbc_btnEliminar.gridy = 17;
				panelContenido.add(btnEliminar, gbc_btnEliminar);
			}
		}
		panelCard = p;
	}

	private class SubTareasListSelectionListener implements ListSelectionListener {
		public void valueChanged(ListSelectionEvent e) {

			t = SubTareas.getSelectedValue();
			DefaultListModel<Tarea> dfm = new DefaultListModel<>();

			// actualizarsubTareas(t);
			if (t != null) {
				textNombre.setText(t.getNombre());
				textFechaInicio.setText(t.getFechaIni());
				textFechaFin.setText(t.getFechaFin());
				spnPrioridad.setValue(t.getPrioridad());
				textArea.setText(t.getComentarios());
			} else {
				textNombre.setText("");
				textFechaInicio.setText("");
				textFechaFin.setText("");
				spnPrioridad.setValue("");
				textArea.setText("");

			}

		}
	}
	private class BtnAtrasActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			CardLayout cl = (CardLayout) (panelCard.getLayout());
			cl.show(panelCard, "panel_tareas");

		}
	}
}
