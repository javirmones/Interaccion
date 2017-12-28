package presentacion;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTree;
import javax.swing.border.EmptyBorder;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;
	private JSplitPane splitPane;
	private JScrollPane scrollPane;
	private JTree tree;
	private JPanel panelCard;
	private JMenuBar menuBar;
	private JMenuItem mntmAcercaDe;
	private String fechaActual = "";

	public VentanaPrincipal() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1331, 881);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		{
			splitPane = new JSplitPane();
			contentPane.add(splitPane, BorderLayout.CENTER);
			{
				scrollPane = new JScrollPane();
				splitPane.setLeftComponent(scrollPane);
				{
					tree = new JTree();
					tree.addTreeSelectionListener(null);
					tree.setModel(new DefaultTreeModel(new DefaultMutableTreeNode("Informacion") {
						{
							//DefaultMutableTreeNode node_1;
							//node_1 = new DefaultMutableTreeNode("Proyecto 1");
							//getContentPane().add(node_1);
							//node_1 = new DefaultMutableTreeNode("Proyecto 2");
							//getContentPane().add(node_1);
							//node_1 = new DefaultMutableTreeNode("Proyecto 3");
							//getContentPane().add(node_1);
						}
					}));
					scrollPane.setViewportView(tree);

				}

			}

		}
	}

}
