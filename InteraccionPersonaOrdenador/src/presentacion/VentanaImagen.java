package presentacion;

import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dominio.graficos.ImagenGrafico;
import dominio.graficos.MiAreaDibujo;
import presentacion.paneles.PanelUsuario;

import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowFocusListener;
import java.io.File;
import java.awt.event.WindowEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.SwingConstants;

public class VentanaImagen extends JFrame {

	public JFrame frame;
	private MiAreaDibujo miAreaDibujo;
	private ImageIcon imagen;

	private int x, y;

	// modos de seleccion
	int modo = -1;
	private final int ESTRELLA = 1;
	private final int GLOBO = 2;

	// Cursores e imagenes
	private Toolkit toolkit;

	private Image imagEstrella;
	private Image imagGlobo;

	private Image imagCursorEstrella;
	private Image imagCursorGlobo;

	private Cursor cursorEstrella;
	private Cursor cursorGlobo;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public VentanaImagen() {
		initialize();
	}

	private void initialize() {

		setBounds(new Rectangle(250, 250, 700, 700));
		setBounds(500, 100, 700, 700);

		JToolBar toolBar = new JToolBar();
		getContentPane().add(toolBar, BorderLayout.NORTH);

		JButton btnCargarImagen = new JButton("Cargar Imagen");
		btnCargarImagen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser fcAbrir = new JFileChooser();
				int valorDevuelto = fcAbrir.showOpenDialog(frame);
				if (valorDevuelto == JFileChooser.APPROVE_OPTION) {
					File file = fcAbrir.getSelectedFile();
					imagen = new ImageIcon(file.getAbsolutePath());
					miAreaDibujo.setIcon(imagen);
				}

			}
		});
		toolBar.add(btnCargarImagen);

		JButton btnEstrella = new JButton();
		btnEstrella.setIcon(new ImageIcon(PanelUsuario.class.getResource("/iconos/rate-star-button.png")));
		btnEstrella.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modo = ESTRELLA;
				setCursor(cursorEstrella);
			}
		});
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		toolBar.add(btnGuardar);
		toolBar.add(btnEstrella);

		JButton btnGlobo = new JButton();
		btnGlobo.setIcon(new ImageIcon(PanelUsuario.class.getResource("/iconos/grid-world.png")));
		btnGlobo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modo = GLOBO;
				setCursor(cursorGlobo);
			}
		});
		toolBar.add(btnGlobo);

		JScrollPane scrollPane = new JScrollPane();
		getContentPane().add(scrollPane, BorderLayout.CENTER);

		miAreaDibujo = new MiAreaDibujo();
		miAreaDibujo.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent arg0) {
			}
		});
		miAreaDibujo.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				x = e.getX();
				y = e.getY();
				if (imagen != null) {
					switch (modo) {
					case ESTRELLA:
						miAreaDibujo.addObjetoGrafico(new ImagenGrafico(x, y, imagEstrella));
						miAreaDibujo.repaint();
						break;
					case GLOBO:
						miAreaDibujo.addObjetoGrafico(new ImagenGrafico(x, y, imagGlobo));
						miAreaDibujo.repaint();
						break;

					}
				}


			}
		});
		miAreaDibujo.setIcon(null);
		scrollPane.setViewportView(miAreaDibujo);

		// Creación de imágenes y cursores
		toolkit = Toolkit.getDefaultToolkit();
		imagEstrella = toolkit.getImage(getClass().getResource("/iconos/rate-star-button.png"));
		imagGlobo = toolkit.getImage(getClass().getResource("/iconos/grid-world.png"));

		imagCursorEstrella = toolkit.getImage(getClass().getResource("/iconos/rate-star-button.png"));
		imagCursorGlobo = toolkit.getImage(getClass().getResource("/iconos/grid-world.png"));
		// Creación de los cursores
		cursorEstrella = toolkit.createCustomCursor(imagEstrella, new Point(0, 0), "CURSOR_ESTRELLA");
		cursorGlobo = toolkit.createCustomCursor(imagGlobo, new Point(0, 0), "CURSOR_GLOBO");

	}

}
