package btb.ithr.datahub.views;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class MainPanel extends JPanel {

	SearchPanel searchPanel;
	DataPanel dataPanel;

	public MainPanel() {

		searchPanel = new SearchPanel();
		dataPanel = new DataPanel();

		Border innerBorder = BorderFactory.createEtchedBorder();
		Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);

		setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));

		layoutComponents();
	}

	public void layoutComponents() {
		setLayout(new BorderLayout());

		add(searchPanel, BorderLayout.NORTH);
		add(dataPanel, BorderLayout.CENTER);

	}
}
