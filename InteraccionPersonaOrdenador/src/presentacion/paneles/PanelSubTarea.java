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

public class PanelSubTarea extends JPanel {
	private JPanel panel;
	private JScrollPane scrollPane_subtareas;
	private JList SubTareas;
	private JLabel lblNombre;
	private JLabel lblFechaInicio;
	private JLabel lblFechaFin;
	private JLabel lblPrioridad;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JScrollPane scrollPane;
	private JPanel panel_1;
	private JTextArea textArea;

	/**
	 * Create the panel.
	 */
	public PanelSubTarea() {
		setLayout(new CardLayout(0, 0));
		{
			panel = new JPanel();
			add(panel, "name_328803660633333");
			GridBagLayout gbl_panel = new GridBagLayout();
			gbl_panel.columnWidths = new int[]{64, 73, 106, 60, 123, 48, 57, 51, 45, 50, 79, 64, 86, 0, 48, 0, 0, 0};
			gbl_panel.rowHeights = new int[]{34, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 20, 53, 0, 0};
			gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			panel.setLayout(gbl_panel);
			{
				lblNombre = new JLabel("Nombre");
				lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 16));
				GridBagConstraints gbc_lblNombre = new GridBagConstraints();
				gbc_lblNombre.anchor = GridBagConstraints.EAST;
				gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
				gbc_lblNombre.gridx = 4;
				gbc_lblNombre.gridy = 1;
				panel.add(lblNombre, gbc_lblNombre);
			}
			{
				textField = new JTextField();
				GridBagConstraints gbc_textField = new GridBagConstraints();
				gbc_textField.gridwidth = 11;
				gbc_textField.insets = new Insets(0, 0, 5, 5);
				gbc_textField.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField.gridx = 5;
				gbc_textField.gridy = 1;
				panel.add(textField, gbc_textField);
				textField.setColumns(10);
			}
			{
				lblFechaInicio = new JLabel("Fecha inicio");
				lblFechaInicio.setFont(new Font("Tahoma", Font.PLAIN, 16));
				GridBagConstraints gbc_lblFechaInicio = new GridBagConstraints();
				gbc_lblFechaInicio.anchor = GridBagConstraints.EAST;
				gbc_lblFechaInicio.insets = new Insets(0, 0, 5, 5);
				gbc_lblFechaInicio.gridx = 4;
				gbc_lblFechaInicio.gridy = 3;
				panel.add(lblFechaInicio, gbc_lblFechaInicio);
			}
			{
				textField_1 = new JTextField();
				GridBagConstraints gbc_textField_1 = new GridBagConstraints();
				gbc_textField_1.gridwidth = 11;
				gbc_textField_1.insets = new Insets(0, 0, 5, 5);
				gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_1.gridx = 5;
				gbc_textField_1.gridy = 3;
				panel.add(textField_1, gbc_textField_1);
				textField_1.setColumns(10);
			}
			{
				lblFechaFin = new JLabel("Fecha fin");
				lblFechaFin.setFont(new Font("Tahoma", Font.PLAIN, 16));
				GridBagConstraints gbc_lblFechaFin = new GridBagConstraints();
				gbc_lblFechaFin.anchor = GridBagConstraints.EAST;
				gbc_lblFechaFin.insets = new Insets(0, 0, 5, 5);
				gbc_lblFechaFin.gridx = 4;
				gbc_lblFechaFin.gridy = 5;
				panel.add(lblFechaFin, gbc_lblFechaFin);
			}
			{
				textField_2 = new JTextField();
				GridBagConstraints gbc_textField_2 = new GridBagConstraints();
				gbc_textField_2.gridwidth = 11;
				gbc_textField_2.insets = new Insets(0, 0, 5, 5);
				gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_2.gridx = 5;
				gbc_textField_2.gridy = 5;
				panel.add(textField_2, gbc_textField_2);
				textField_2.setColumns(10);
			}
			{
				lblPrioridad = new JLabel("Prioridad");
				lblPrioridad.setFont(new Font("Tahoma", Font.PLAIN, 16));
				GridBagConstraints gbc_lblPrioridad = new GridBagConstraints();
				gbc_lblPrioridad.anchor = GridBagConstraints.EAST;
				gbc_lblPrioridad.insets = new Insets(0, 0, 5, 5);
				gbc_lblPrioridad.gridx = 4;
				gbc_lblPrioridad.gridy = 7;
				panel.add(lblPrioridad, gbc_lblPrioridad);
			}
			{
				textField_3 = new JTextField();
				GridBagConstraints gbc_textField_3 = new GridBagConstraints();
				gbc_textField_3.gridwidth = 11;
				gbc_textField_3.insets = new Insets(0, 0, 5, 5);
				gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_3.gridx = 5;
				gbc_textField_3.gridy = 7;
				panel.add(textField_3, gbc_textField_3);
				textField_3.setColumns(10);
			}
			{
				scrollPane_subtareas = new JScrollPane();
				GridBagConstraints gbc_scrollPane_subtareas = new GridBagConstraints();
				gbc_scrollPane_subtareas.gridwidth = 3;
				gbc_scrollPane_subtareas.gridheight = 18;
				gbc_scrollPane_subtareas.insets = new Insets(0, 0, 5, 5);
				gbc_scrollPane_subtareas.fill = GridBagConstraints.BOTH;
				gbc_scrollPane_subtareas.gridx = 0;
				gbc_scrollPane_subtareas.gridy = 0;
				panel.add(scrollPane_subtareas, gbc_scrollPane_subtareas);
				{
					SubTareas = new JList();
					SubTareas.setBorder(new TitledBorder(null, "SubTareas", TitledBorder.LEADING, TitledBorder.TOP, null, null));
					scrollPane_subtareas.setViewportView(SubTareas);
				}
			}
			{
				scrollPane = new JScrollPane();
				GridBagConstraints gbc_scrollPane = new GridBagConstraints();
				gbc_scrollPane.gridwidth = 12;
				gbc_scrollPane.gridheight = 5;
				gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
				gbc_scrollPane.fill = GridBagConstraints.BOTH;
				gbc_scrollPane.gridx = 4;
				gbc_scrollPane.gridy = 9;
				panel.add(scrollPane, gbc_scrollPane);
				{
					textArea = new JTextArea();
					textArea.setBorder(new TitledBorder(null, "Comentarios", TitledBorder.LEADING, TitledBorder.TOP, null, null));
					textArea.setEditable(false);
					scrollPane.setViewportView(textArea);
				}
			}
			{
				panel_1 = new PanelBotones();
				GridBagConstraints gbc_panel_1 = new GridBagConstraints();
				gbc_panel_1.insets = new Insets(0, 0, 5, 0);
				gbc_panel_1.gridwidth = 14;
				gbc_panel_1.gridheight = 2;
				gbc_panel_1.fill = GridBagConstraints.BOTH;
				gbc_panel_1.gridx = 3;
				gbc_panel_1.gridy = 16;
				panel.add(panel_1, gbc_panel_1);
			}
		}

	}

}
