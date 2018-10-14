package btb.ithr.datahub.views;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class HistoryPanel extends JPanel {
	
	JTextArea taHistory;
	
	public HistoryPanel() {
		
		taHistory = new JTextArea(0, 20);
		taHistory.setEditable(false);
		taHistory.setOpaque(false);
		
		Border innerBorder = BorderFactory.createTitledBorder("History");
		Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);

		setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));

		layoutComponents();
	}

	public void layoutComponents() {
		setLayout(new BorderLayout());
		
		add(taHistory, BorderLayout.CENTER);
		
	}
}
