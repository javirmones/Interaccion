package presentacion.paneles;

import javax.swing.JPanel;
import javax.swing.JSplitPane;
import java.awt.GridBagLayout;
import javax.swing.JTree;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.border.TitledBorder;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JSpinner;

public class PanelProyecto extends JPanel {
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;
	private JTree tree;
	private JList list;
	private JPanel panel;
	private JLabel lblNombre;
	private JLabel lblFechaInicio;
	private JLabel lblEncargado;
	private JLabel lblEstado;
	private JLabel lblPrioridad;
	private JLabel lblTags;
	private JLabel lblNewLabel;
	private JTextField textField_2;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JScrollPane scrollPane_2;
	private JSpinner spinner;
	private JTextField textField_5;
	private JTextArea textArea;

	/**
	 * Create the panel.
	 */
	public PanelProyecto() {
		setBorder(new TitledBorder(null, "Proyectos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 55, 0, 74, 57, 0, 176, 49, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 42, 0, 0, 0, 0, 0, 0, 38, 80, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
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
				tree = new JTree();
				tree.setBorder(new TitledBorder(null, "Proyectos/Tareas", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				scrollPane.setViewportView(tree);
			}
		}
		{
			lblNombre = new JLabel("Nombre");
			GridBagConstraints gbc_lblNombre = new GridBagConstraints();
			gbc_lblNombre.anchor = GridBagConstraints.EAST;
			gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
			gbc_lblNombre.gridx = 10;
			gbc_lblNombre.gridy = 1;
			add(lblNombre, gbc_lblNombre);
		}
		{
			textField = new JTextField();
			GridBagConstraints gbc_textField = new GridBagConstraints();
			gbc_textField.gridwidth = 4;
			gbc_textField.insets = new Insets(0, 0, 5, 5);
			gbc_textField.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField.gridx = 11;
			gbc_textField.gridy = 1;
			add(textField, gbc_textField);
			textField.setColumns(10);
		}
		{
			lblFechaInicio = new JLabel("Fecha inicio");
			GridBagConstraints gbc_lblFechaInicio = new GridBagConstraints();
			gbc_lblFechaInicio.anchor = GridBagConstraints.EAST;
			gbc_lblFechaInicio.insets = new Insets(0, 0, 5, 5);
			gbc_lblFechaInicio.gridx = 10;
			gbc_lblFechaInicio.gridy = 2;
			add(lblFechaInicio, gbc_lblFechaInicio);
		}
		{
			textField_1 = new JTextField();
			GridBagConstraints gbc_textField_1 = new GridBagConstraints();
			gbc_textField_1.gridwidth = 2;
			gbc_textField_1.insets = new Insets(0, 0, 5, 5);
			gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField_1.gridx = 11;
			gbc_textField_1.gridy = 2;
			add(textField_1, gbc_textField_1);
			textField_1.setColumns(10);
		}
		{
			lblNewLabel = new JLabel("Fecha fin");
			GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
			gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
			gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel.gridx = 13;
			gbc_lblNewLabel.gridy = 2;
			add(lblNewLabel, gbc_lblNewLabel);
		}
		{
			textField_2 = new JTextField();
			GridBagConstraints gbc_textField_2 = new GridBagConstraints();
			gbc_textField_2.insets = new Insets(0, 0, 5, 5);
			gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField_2.gridx = 14;
			gbc_textField_2.gridy = 2;
			add(textField_2, gbc_textField_2);
			textField_2.setColumns(10);
		}
		{
			lblEncargado = new JLabel("Encargado");
			GridBagConstraints gbc_lblEncargado = new GridBagConstraints();
			gbc_lblEncargado.anchor = GridBagConstraints.EAST;
			gbc_lblEncargado.insets = new Insets(0, 0, 5, 5);
			gbc_lblEncargado.gridx = 10;
			gbc_lblEncargado.gridy = 3;
			add(lblEncargado, gbc_lblEncargado);
		}
		{
			textField_3 = new JTextField();
			GridBagConstraints gbc_textField_3 = new GridBagConstraints();
			gbc_textField_3.gridwidth = 4;
			gbc_textField_3.insets = new Insets(0, 0, 5, 5);
			gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField_3.gridx = 11;
			gbc_textField_3.gridy = 3;
			add(textField_3, gbc_textField_3);
			textField_3.setColumns(10);
		}
		{
			lblEstado = new JLabel("Estado");
			GridBagConstraints gbc_lblEstado = new GridBagConstraints();
			gbc_lblEstado.anchor = GridBagConstraints.EAST;
			gbc_lblEstado.insets = new Insets(0, 0, 5, 5);
			gbc_lblEstado.gridx = 10;
			gbc_lblEstado.gridy = 4;
			add(lblEstado, gbc_lblEstado);
		}
		{
			textField_4 = new JTextField();
			GridBagConstraints gbc_textField_4 = new GridBagConstraints();
			gbc_textField_4.gridwidth = 4;
			gbc_textField_4.insets = new Insets(0, 0, 5, 5);
			gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField_4.gridx = 11;
			gbc_textField_4.gridy = 4;
			add(textField_4, gbc_textField_4);
			textField_4.setColumns(10);
		}
		{
			lblPrioridad = new JLabel("Prioridad");
			GridBagConstraints gbc_lblPrioridad = new GridBagConstraints();
			gbc_lblPrioridad.insets = new Insets(0, 0, 5, 5);
			gbc_lblPrioridad.gridx = 10;
			gbc_lblPrioridad.gridy = 5;
			add(lblPrioridad, gbc_lblPrioridad);
		}
		{
			spinner = new JSpinner();
			GridBagConstraints gbc_spinner = new GridBagConstraints();
			gbc_spinner.insets = new Insets(0, 0, 5, 5);
			gbc_spinner.gridx = 11;
			gbc_spinner.gridy = 5;
			add(spinner, gbc_spinner);
		}
		{
			lblTags = new JLabel("Tags");
			GridBagConstraints gbc_lblTags = new GridBagConstraints();
			gbc_lblTags.anchor = GridBagConstraints.EAST;
			gbc_lblTags.insets = new Insets(0, 0, 5, 5);
			gbc_lblTags.gridx = 13;
			gbc_lblTags.gridy = 5;
			add(lblTags, gbc_lblTags);
		}
		{
			textField_5 = new JTextField();
			GridBagConstraints gbc_textField_5 = new GridBagConstraints();
			gbc_textField_5.insets = new Insets(0, 0, 5, 5);
			gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField_5.gridx = 14;
			gbc_textField_5.gridy = 5;
			add(textField_5, gbc_textField_5);
			textField_5.setColumns(10);
		}
		{
			scrollPane_1 = new JScrollPane();
			GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
			gbc_scrollPane_1.gridwidth = 9;
			gbc_scrollPane_1.gridheight = 6;
			gbc_scrollPane_1.insets = new Insets(0, 0, 0, 5);
			gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
			gbc_scrollPane_1.gridx = 0;
			gbc_scrollPane_1.gridy = 7;
			add(scrollPane_1, gbc_scrollPane_1);
			{
				list = new JList();
				list.setBorder(new TitledBorder(null, "Encargados", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				scrollPane_1.setViewportView(list);
			}
		}
		{
			scrollPane_2 = new JScrollPane();
			GridBagConstraints gbc_scrollPane_2 = new GridBagConstraints();
			gbc_scrollPane_2.gridwidth = 5;
			gbc_scrollPane_2.gridheight = 5;
			gbc_scrollPane_2.insets = new Insets(0, 0, 5, 5);
			gbc_scrollPane_2.fill = GridBagConstraints.BOTH;
			gbc_scrollPane_2.gridx = 10;
			gbc_scrollPane_2.gridy = 6;
			add(scrollPane_2, gbc_scrollPane_2);
			{
				textArea = new JTextArea();
				textArea.setBorder(new TitledBorder(null, "Descripcion", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				textArea.setEditable(false);
				scrollPane_2.setViewportView(textArea);
			}
		}
		{
			panel = new PanelBotones();
			GridBagConstraints gbc_panel = new GridBagConstraints();
			gbc_panel.gridwidth = 7;
			gbc_panel.fill = GridBagConstraints.BOTH;
			gbc_panel.gridx = 9;
			gbc_panel.gridy = 12;
			add(panel, gbc_panel);
		}

	}

}
