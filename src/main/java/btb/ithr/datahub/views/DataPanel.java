package btb.ithr.datahub.views;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JTable;

import btb.ithr.datahub.model.DataTableModel;

public class DataPanel extends JPanel {

	private JTable tblData;
	private DataTableModel dataTableModel;

	public DataPanel() {
		dataTableModel = new DataTableModel();
		tblData = new JTable(dataTableModel);
	}

	public void layoutComponents() {
		setLayout(new BorderLayout());

		add(tblData, BorderLayout.CENTER);
	}
}
