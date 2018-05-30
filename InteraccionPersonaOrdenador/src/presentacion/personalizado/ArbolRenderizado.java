package presentacion.personalizado;

import java.awt.Component;

import javax.swing.ImageIcon;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;

public class ArbolRenderizado extends DefaultTreeCellRenderer {

	public Component getTreeCellRendererComponent(JTree tree, Object value, boolean sel, boolean expanded, boolean leaf,
			int row, boolean hasFocus) {
		super.getTreeCellRendererComponent(tree, value, sel, expanded, leaf, row, hasFocus);
		DefaultMutableTreeNode nodo = (DefaultMutableTreeNode) value;
		String c = (String) (nodo.getUserObject());
		switch (c) {
		case "Batalla de Stalingrado":
			setIcon(new ImageIcon(ArbolRenderizado.class.getResource("/iconos/rate-star-button.png")));
			break;
		case "Toma de Berlin":
			setIcon(new ImageIcon(ArbolRenderizado.class.getResource("/iconos/home-icon-silhouette.png")));
			break;
		case "Conquista":
			setIcon(new ImageIcon(ArbolRenderizado.class.getResource("/iconos/text-documents.png")));
			break;

		case "Destruir muro":
			setIcon(new ImageIcon(ArbolRenderizado.class.getResource("/iconos/waste-bin.png")));
			break;
		case "Revolucion":
			setIcon(new ImageIcon(ArbolRenderizado.class.getResource("/iconos/rate-star-button.png")));
			break;

		case "Consultar algo":
			setIcon(new ImageIcon(ArbolRenderizado.class.getResource("/iconos/grid-world.png")));
			break;

		}

		return this;
	}
}
