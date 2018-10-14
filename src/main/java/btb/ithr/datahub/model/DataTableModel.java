package btb.ithr.datahub.model;

import java.util.List;

import javax.swing.table.AbstractTableModel;

public class DataTableModel extends AbstractTableModel {

	private List<Data> lstData;

	private String[] colNames = { "REFID", "TABLE", "FIELD", "DATA TYPE", "LENGTH" };

	public DataTableModel() {
	}

	public int getColumnCount() {
		return 5;
	}

	public int getRowCount() {
		return 0;
	}

	public Object getValueAt(int row, int col) {
		Data data = lstData.get(row);

		switch (col) {
		case 0:
			return data.getStrRefID();
		case 1:
			return data.getStrTableName();
		case 2:
			return data.getStrFieldName();
		case 3:
			return data.getStrDataType();
		case 4:
			return data.getStrLength();
		}
		return null;
	}

}
