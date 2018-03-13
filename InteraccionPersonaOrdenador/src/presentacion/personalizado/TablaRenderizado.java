package presentacion.personalizado;



import java.awt.Color;
import java.awt.Component;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;



@SuppressWarnings("serial")
public class TablaRenderizado extends DefaultTableCellRenderer {

	@Override
	public Component getTableCellRendererComponent(JTable table, Object value, boolean selected, boolean focused,
			int row, int column) {
		super.getTableCellRendererComponent(table, value, selected, focused, row, column);
		/*
		if (table.getValueAt(row, column).toString().toLowerCase()
				.equals(Data.getInstance().getCurrentUser().getFullName().toLowerCase())) {
			this.setOpaque(true);
			this.setBackground(new Color(250, 250, 190));
		} else {
			this.setBackground(Color.WHITE);
		}
		*/
		return this;
	}
}
