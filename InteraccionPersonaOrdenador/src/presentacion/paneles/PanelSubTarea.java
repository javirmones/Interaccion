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

public class PanelSubTarea extends JPanel {
	private JPanel panelContenido;
	private JScrollPane scrollPane_subtareas;
	private JList SubTareas;
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
	private String tarea="tarea";
	private JSpinner spnPrioridad;
	private JPanel panelCard;

	/**
	 * Create the panel.
	 */
	public PanelSubTarea(JPanel p) {
		setLayout(new CardLayout(0, 0));
		{
			panelContenido = new JPanel();
			add(panelContenido, "name_328803660633333");
			GridBagLayout gbl_panelContenido = new GridBagLayout();
			gbl_panelContenido.columnWidths = new int[]{64, 73, 106, 60, 123, 48, 57, 51, 45, 50, 79, 64, 86, 0, 48, 0, 0, 0};
			gbl_panelContenido.rowHeights = new int[]{34, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 39, 0, 53, 0, 0};
			gbl_panelContenido.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			gbl_panelContenido.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			panelContenido.setLayout(gbl_panelContenido);
			{
				lblNombre = new JLabel("Nombre");
				lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 16));
				GridBagConstraints gbc_lblNombre = new GridBagConstraints();
				gbc_lblNombre.anchor = GridBagConstraints.EAST;
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
				gbc_lblFechaInicio.anchor = GridBagConstraints.EAST;
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
				gbc_lblFechaFin.anchor = GridBagConstraints.EAST;
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
				gbc_lblPrioridad.anchor = GridBagConstraints.EAST;
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
				gbc_scrollPane_subtareas.insets = new Insets(0, 0, 0, 5);
				gbc_scrollPane_subtareas.fill = GridBagConstraints.BOTH;
				gbc_scrollPane_subtareas.gridx = 0;
				gbc_scrollPane_subtareas.gridy = 0;
				panelContenido.add(scrollPane_subtareas, gbc_scrollPane_subtareas);
				{
					SubTareas = new JList();
					SubTareas.setBorder(new TitledBorder(null, "SubTareas", TitledBorder.LEADING, TitledBorder.TOP, null, null));
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
					textArea.setBorder(new TitledBorder(null, "Comentarios", TitledBorder.LEADING, TitledBorder.TOP, null, null));
					textArea.setEditable(false);
					scrollPaneComentarios.setViewportView(textArea);
				}
			}
			{
				panelbotones = new PanelBotones(tarea);
				GridBagConstraints gbc_panelbotones = new GridBagConstraints();
				gbc_panelbotones.gridwidth = 14;
				gbc_panelbotones.gridheight = 2;
				gbc_panelbotones.fill = GridBagConstraints.BOTH;
				gbc_panelbotones.gridx = 3;
				gbc_panelbotones.gridy = 17;
				panelContenido.add(panelbotones, gbc_panelbotones);
			}
		}
		panelCard=p;
	}
}
