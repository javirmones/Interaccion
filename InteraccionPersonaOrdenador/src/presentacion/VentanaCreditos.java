package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class VentanaCreditos extends JFrame {

	private JPanel contentPane;
	private JLabel lblPrcticaDeInteraccin;
	private JLabel lblAutores;
	private JLabel lblJavierMonescilloBuitrn;
	private JLabel lblngelLoroMosqueda;
	private JLabel lblIngenieraInformticaEscuela;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public VentanaCreditos() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 469, 279);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{62, 73, 170, 55, 49, 0};
		gbl_contentPane.rowHeights = new int[]{66, 62, 36, 30, 34, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		{
			lblIngenieraInformticaEscuela = new JLabel("Ingeniería Informática ESI 3º C");
			GridBagConstraints gbc_lblIngenieraInformticaEscuela = new GridBagConstraints();
			gbc_lblIngenieraInformticaEscuela.gridwidth = 5;
			gbc_lblIngenieraInformticaEscuela.insets = new Insets(0, 0, 5, 5);
			gbc_lblIngenieraInformticaEscuela.gridx = 0;
			gbc_lblIngenieraInformticaEscuela.gridy = 0;
			contentPane.add(lblIngenieraInformticaEscuela, gbc_lblIngenieraInformticaEscuela);
		}
		{
			lblPrcticaDeInteraccin = new JLabel("Práctica de Interacción Persona Ordenador I");
			GridBagConstraints gbc_lblPrcticaDeInteraccin = new GridBagConstraints();
			gbc_lblPrcticaDeInteraccin.gridwidth = 5;
			gbc_lblPrcticaDeInteraccin.insets = new Insets(0, 0, 5, 5);
			gbc_lblPrcticaDeInteraccin.gridx = 0;
			gbc_lblPrcticaDeInteraccin.gridy = 1;
			contentPane.add(lblPrcticaDeInteraccin, gbc_lblPrcticaDeInteraccin);
		}
		{
			lblAutores = new JLabel("Autores:");
			GridBagConstraints gbc_lblAutores = new GridBagConstraints();
			gbc_lblAutores.insets = new Insets(0, 0, 5, 5);
			gbc_lblAutores.gridx = 1;
			gbc_lblAutores.gridy = 2;
			contentPane.add(lblAutores, gbc_lblAutores);
		}
		{
			lblJavierMonescilloBuitrn = new JLabel("Javier Monescillo Buitrón   ");
			GridBagConstraints gbc_lblJavierMonescilloBuitrn = new GridBagConstraints();
			gbc_lblJavierMonescilloBuitrn.insets = new Insets(0, 0, 5, 5);
			gbc_lblJavierMonescilloBuitrn.gridx = 2;
			gbc_lblJavierMonescilloBuitrn.gridy = 2;
			contentPane.add(lblJavierMonescilloBuitrn, gbc_lblJavierMonescilloBuitrn);
		}
		{
			lblngelLoroMosqueda = new JLabel("Ángel Loro Mosqueda");
			GridBagConstraints gbc_lblngelLoroMosqueda = new GridBagConstraints();
			gbc_lblngelLoroMosqueda.insets = new Insets(0, 0, 5, 5);
			gbc_lblngelLoroMosqueda.gridx = 2;
			gbc_lblngelLoroMosqueda.gridy = 3;
			contentPane.add(lblngelLoroMosqueda, gbc_lblngelLoroMosqueda);
		}
	}

}
