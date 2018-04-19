package presentacion.paneles;

import javax.swing.JPanel;
import com.toedter.calendar.JCalendar;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class PanelCalendario extends JPanel {
	private JCalendar calendar;

	/**
	 * Create the panel.
	 */
	public PanelCalendario() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{109, 149, 152, 0};
		gridBagLayout.rowHeights = new int[]{38, 137, 126, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		{
			calendar = new JCalendar();
			GridBagConstraints gbc_calendar = new GridBagConstraints();
			gbc_calendar.gridwidth = 3;
			gbc_calendar.gridheight = 3;
			gbc_calendar.insets = new Insets(0, 0, 5, 5);
			gbc_calendar.fill = GridBagConstraints.BOTH;
			gbc_calendar.gridx = 0;
			gbc_calendar.gridy = 0;
			add(calendar, gbc_calendar);
		}

	}

}
