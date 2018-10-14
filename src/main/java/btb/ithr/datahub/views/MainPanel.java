package btb.ithr.datahub.views;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class MainPanel extends JPanel {

	SearchPanel searchPanel;
	DataPanel dataPanel;
	HistoryPanel historyPanel;

	public MainPanel() {

		searchPanel = new SearchPanel();
		dataPanel = new DataPanel();
		historyPanel = new HistoryPanel();

		Border innerBorder = BorderFactory.createEtchedBorder();
		Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);

		setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));

		layoutComponents();
	}

	public void layoutComponents() {
		setLayout(new BorderLayout());

		add(searchPanel, BorderLayout.NORTH);
		add(dataPanel, BorderLayout.CENTER);
		add(historyPanel, BorderLayout.EAST);

	}
}
