package presentacion;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTree;
import javax.swing.border.EmptyBorder;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class VentanaAyuda extends JFrame {

	private JPanel contentPane;
	private JSplitPane splitPane;
	private JPanel panel;
	private JPanel panel_1;
	private JTree tree;

	/**
	 * Launch the application.
	 * 
	 * 
	 * /** Create the frame.
	 */
	public VentanaAyuda() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		splitPane = new JSplitPane();
		contentPane.add(splitPane, BorderLayout.CENTER);

		panel = new JPanel();
		splitPane.setRightComponent(panel);

		panel_1 = new JPanel();
		splitPane.setLeftComponent(panel_1);

		tree = new JTree();
		tree.setModel(new DefaultTreeModel(new DefaultMutableTreeNode("Ayuda") {
			{
				add(new DefaultMutableTreeNode("Inicio"));
				add(new DefaultMutableTreeNode("Proyectos"));
				add(new DefaultMutableTreeNode("Tareas"));
				add(new DefaultMutableTreeNode("Usuarios"));
				add(new DefaultMutableTreeNode("Interfaz"));
				add(new DefaultMutableTreeNode("Idioma"));
			}
		}));
		panel_1.add(tree);
	}

}
