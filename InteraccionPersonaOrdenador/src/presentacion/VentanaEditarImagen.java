package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;

public class VentanaEditarImagen extends JFrame {

	private JPanel contentPane;
	private JLabel lblToDo;

	public VentanaEditarImagen() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaEditarImagen.class.getResource("/iconos/confirm-schedule.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 643, 426);
		setTitle("Editar imagen");
		setLocationRelativeTo(null);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		{
			lblToDo = new JLabel("To do");
			contentPane.add(lblToDo, BorderLayout.WEST);
		}
	}

}
