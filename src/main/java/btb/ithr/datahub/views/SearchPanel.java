package btb.ithr.datahub.views;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SearchPanel extends JPanel {

	private JComboBox cboField;
	private JTextField fldSearch;

	public SearchPanel() {
		fldSearch = new JTextField();
		cboField = new JComboBox();

		DefaultComboBoxModel empModel = new DefaultComboBoxModel();
		empModel.addElement("Field1");
		empModel.addElement("Field2");
		empModel.addElement("Field3");

		cboField.setModel(empModel);
		cboField.setSelectedIndex(0);

		layoutComponents();
	}

	public void layoutComponents() {
		setLayout(new BorderLayout());

		add(cboField, BorderLayout.WEST);
		add(fldSearch, BorderLayout.CENTER);
	}

}
