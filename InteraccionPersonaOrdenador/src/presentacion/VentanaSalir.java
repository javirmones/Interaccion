package presentacion;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class VentanaSalir extends JPanel {
	private JLabel lblNewLabel;
	private JLabel lblEstaSeguroDe;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	/**
	 * Create the panel.
	 */
	public VentanaSalir() {
		setBorder(new LineBorder(new Color(0, 0, 0)));
		setLayout(null);

		lblNewLabel = new JLabel("Aviso");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(184, 47, 78, 25);
		add(lblNewLabel);

		lblEstaSeguroDe = new JLabel("\u00BFEsta seguro de desear salir de la aplicacion?");
		lblEstaSeguroDe.setHorizontalAlignment(SwingConstants.CENTER);
		lblEstaSeguroDe.setBounds(28, 88, 395, 48);
		add(lblEstaSeguroDe);

		btnNewButton = new JButton("No");
		btnNewButton.setBounds(231, 152, 133, 48);
		add(btnNewButton);

		btnNewButton_1 = new JButton("Si");
		btnNewButton_1.setBounds(75, 152, 133, 48);
		add(btnNewButton_1);

	}

}
