package presentacion.paneles;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.border.TitledBorder;

import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JTree;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JSplitPane;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import java.awt.BorderLayout;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;

import java.awt.FlowLayout;
import java.awt.Component;
import javax.swing.Box;
import java.awt.ComponentOrientation;
import javax.swing.JTextArea;
import java.awt.CardLayout;

public class PanelInicial extends JPanel {
	private JPanel panel;
	private JLabel label_1;
	private JTextField textField;
	private JLabel label_2;
	private JTextField textField_1;
	private JLabel lblDireccion;
	private JTextField textField_2;
	private JLabel label_4;
	private JTextField textField_3;
	private JLabel label_5;
	private JTextField textField_4;
	private JLabel label_6;
	private JTextField textField_5;
	private JLabel label_7;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JScrollPane scrollPane_1;
	private JLabel label;

	/**
	 * Create the panel.
	 */
	public PanelInicial() {
		setLayout(new CardLayout(0, 0));
		{
			panel = new JPanel();
			add(panel, "name_76397485662122");
			GridBagLayout gbl_panel = new GridBagLayout();
			gbl_panel.columnWidths = new int[]{62, 84, 0, 0, 0, 0, 55, 0, 0, 126, 386, 0, 0, 0};
			gbl_panel.rowHeights = new int[]{40, 171, 47, 54, 46, 40, 44, 32, 40, 0, 42, 33, 42, 60, 34, 45, 0, 0, 0};
			gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
			panel.setLayout(gbl_panel);
			{
				scrollPane_1 = new JScrollPane();
				GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
				gbc_scrollPane_1.gridheight = 3;
				gbc_scrollPane_1.gridwidth = 6;
				gbc_scrollPane_1.insets = new Insets(0, 0, 5, 5);
				gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
				gbc_scrollPane_1.gridx = 1;
				gbc_scrollPane_1.gridy = 1;
				panel.add(scrollPane_1, gbc_scrollPane_1);
				{
					label = new JLabel("");
					label.setBorder(new TitledBorder(null, "Foto", TitledBorder.LEADING, TitledBorder.TOP, null, null));
					label.setIcon(new ImageIcon(PanelInicial.class.getResource("/iconos/stalin.jpg")));
					scrollPane_1.setViewportView(label);
				}
			}
			{
				label_1 = new JLabel("Nombre");
				label_1.setFont(new Font("Arial", Font.PLAIN, 20));
				GridBagConstraints gbc_label_1 = new GridBagConstraints();
				gbc_label_1.anchor = GridBagConstraints.SOUTH;
				gbc_label_1.insets = new Insets(0, 0, 5, 5);
				gbc_label_1.gridx = 7;
				gbc_label_1.gridy = 1;
				panel.add(label_1, gbc_label_1);
			}
			{
				textField = new JTextField();
				textField.setColumns(10);
				GridBagConstraints gbc_textField = new GridBagConstraints();
				gbc_textField.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField.anchor = GridBagConstraints.SOUTH;
				gbc_textField.gridwidth = 2;
				gbc_textField.insets = new Insets(0, 0, 5, 5);
				gbc_textField.gridx = 9;
				gbc_textField.gridy = 1;
				panel.add(textField, gbc_textField);
			}
			{
				label_2 = new JLabel("Apellidos");
				label_2.setFont(new Font("Arial", Font.PLAIN, 20));
				GridBagConstraints gbc_label_2 = new GridBagConstraints();
				gbc_label_2.insets = new Insets(0, 0, 5, 5);
				gbc_label_2.gridx = 7;
				gbc_label_2.gridy = 3;
				panel.add(label_2, gbc_label_2);
			}
			{
				textField_1 = new JTextField();
				textField_1.setColumns(10);
				GridBagConstraints gbc_textField_1 = new GridBagConstraints();
				gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_1.gridwidth = 2;
				gbc_textField_1.insets = new Insets(0, 0, 5, 5);
				gbc_textField_1.gridx = 9;
				gbc_textField_1.gridy = 3;
				panel.add(textField_1, gbc_textField_1);
			}
			{
				lblDireccion = new JLabel("Direccion");
				lblDireccion.setFont(new Font("Arial", Font.PLAIN, 20));
				GridBagConstraints gbc_lblDireccion = new GridBagConstraints();
				gbc_lblDireccion.insets = new Insets(0, 0, 5, 5);
				gbc_lblDireccion.gridx = 7;
				gbc_lblDireccion.gridy = 5;
				panel.add(lblDireccion, gbc_lblDireccion);
			}
			{
				textField_2 = new JTextField();
				textField_2.setColumns(10);
				GridBagConstraints gbc_textField_2 = new GridBagConstraints();
				gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_2.gridwidth = 2;
				gbc_textField_2.insets = new Insets(0, 0, 5, 5);
				gbc_textField_2.gridx = 9;
				gbc_textField_2.gridy = 5;
				panel.add(textField_2, gbc_textField_2);
			}
			{
				label_4 = new JLabel("Email");
				label_4.setFont(new Font("Arial", Font.PLAIN, 20));
				GridBagConstraints gbc_label_4 = new GridBagConstraints();
				gbc_label_4.insets = new Insets(0, 0, 5, 5);
				gbc_label_4.gridx = 7;
				gbc_label_4.gridy = 7;
				panel.add(label_4, gbc_label_4);
			}
			{
				textField_3 = new JTextField();
				textField_3.setColumns(10);
				GridBagConstraints gbc_textField_3 = new GridBagConstraints();
				gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_3.gridwidth = 2;
				gbc_textField_3.insets = new Insets(0, 0, 5, 5);
				gbc_textField_3.gridx = 9;
				gbc_textField_3.gridy = 7;
				panel.add(textField_3, gbc_textField_3);
			}
			{
				label_5 = new JLabel("Telefono");
				label_5.setFont(new Font("Arial", Font.PLAIN, 20));
				GridBagConstraints gbc_label_5 = new GridBagConstraints();
				gbc_label_5.insets = new Insets(0, 0, 5, 5);
				gbc_label_5.gridx = 7;
				gbc_label_5.gridy = 9;
				panel.add(label_5, gbc_label_5);
			}
			{
				textField_4 = new JTextField();
				textField_4.setColumns(10);
				GridBagConstraints gbc_textField_4 = new GridBagConstraints();
				gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_4.gridwidth = 2;
				gbc_textField_4.insets = new Insets(0, 0, 5, 5);
				gbc_textField_4.gridx = 9;
				gbc_textField_4.gridy = 9;
				panel.add(textField_4, gbc_textField_4);
			}
			{
				label_6 = new JLabel("Rol");
				label_6.setFont(new Font("Arial", Font.PLAIN, 20));
				GridBagConstraints gbc_label_6 = new GridBagConstraints();
				gbc_label_6.insets = new Insets(0, 0, 5, 5);
				gbc_label_6.gridx = 7;
				gbc_label_6.gridy = 11;
				panel.add(label_6, gbc_label_6);
			}
			{
				textField_5 = new JTextField();
				textField_5.setColumns(10);
				GridBagConstraints gbc_textField_5 = new GridBagConstraints();
				gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_5.gridwidth = 2;
				gbc_textField_5.insets = new Insets(0, 0, 5, 5);
				gbc_textField_5.gridx = 9;
				gbc_textField_5.gridy = 11;
				panel.add(textField_5, gbc_textField_5);
			}
			{
				label_7 = new JLabel("Comentarios");
				label_7.setFont(new Font("Arial", Font.PLAIN, 20));
				GridBagConstraints gbc_label_7 = new GridBagConstraints();
				gbc_label_7.anchor = GridBagConstraints.NORTH;
				gbc_label_7.insets = new Insets(0, 0, 5, 5);
				gbc_label_7.gridx = 7;
				gbc_label_7.gridy = 13;
				panel.add(label_7, gbc_label_7);
			}
			{
				scrollPane = new JScrollPane();
				GridBagConstraints gbc_scrollPane = new GridBagConstraints();
				gbc_scrollPane.fill = GridBagConstraints.BOTH;
				gbc_scrollPane.gridheight = 2;
				gbc_scrollPane.gridwidth = 2;
				gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
				gbc_scrollPane.gridx = 9;
				gbc_scrollPane.gridy = 13;
				panel.add(scrollPane, gbc_scrollPane);
				{
					textArea = new JTextArea();
					textArea.setEditable(false);
					scrollPane.setViewportView(textArea);
				}
			}
		}

	}
}
