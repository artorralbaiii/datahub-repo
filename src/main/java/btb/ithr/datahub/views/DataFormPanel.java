package btb.ithr.datahub.views;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class DataFormPanel extends JPanel {

	private JTextField fldRefId;
	private JTextField fldTableName;
	private JTextField fldFieldName;
	private JTextField fldDataType;
	private JTextField fldLength;
	private JButton btnSave;
	private JButton btnCancel;

	public DataFormPanel() {
		
		fldRefId = new JTextField(20);
		fldTableName = new JTextField(20);
		fldFieldName = new JTextField(20);
		fldDataType = new JTextField(20);
		fldLength = new JTextField(20);

		btnSave = new JButton("Save");
		btnCancel = new JButton("Cancel");
		
		Border innerBorder = BorderFactory.createTitledBorder("Record Details");
		Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);

		setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));
		
		layoutComponents();
	}

	public void layoutComponents() {
		setLayout(new GridBagLayout());

		GridBagConstraints gc = new GridBagConstraints();

		gc.gridy = 0;

		// ***COMPONENT ROW***

		gc.weightx = 1;
		gc.weighty = 0.1;

		gc.gridx = 0;
		gc.gridy++;

		gc.fill = GridBagConstraints.NONE;
		gc.anchor = GridBagConstraints.FIRST_LINE_END;
		gc.insets = new Insets(0, 0, 0, 5);

		add(new JLabel("Ref ID:"), gc);

		gc.gridx = 1;
		gc.insets = new Insets(0, 0, 0, 0);
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		add(fldRefId, gc);

		// ***COMPONENT ROW***

		gc.weightx = 1;
		gc.weighty = 0.1;

		gc.gridx = 0;
		gc.gridy++;

		gc.fill = GridBagConstraints.NONE;
		gc.anchor = GridBagConstraints.FIRST_LINE_END;
		gc.insets = new Insets(0, 0, 0, 5);

		add(new JLabel("Table:"), gc);

		gc.gridx = 1;
		gc.insets = new Insets(0, 0, 0, 0);
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		add(fldTableName, gc);

		// ***COMPONENT ROW***

		gc.weightx = 1;
		gc.weighty = 0.1;

		gc.gridx = 0;
		gc.gridy++;

		gc.fill = GridBagConstraints.NONE;
		gc.anchor = GridBagConstraints.FIRST_LINE_END;
		gc.insets = new Insets(0, 0, 0, 5);

		add(new JLabel("Field:"), gc);

		gc.gridx = 1;
		gc.insets = new Insets(0, 0, 0, 0);
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		add(fldFieldName, gc);

		// ***COMPONENT ROW***

		gc.weightx = 1;
		gc.weighty = 0.1;

		gc.gridx = 0;
		gc.gridy++;

		gc.fill = GridBagConstraints.NONE;
		gc.anchor = GridBagConstraints.FIRST_LINE_END;
		gc.insets = new Insets(0, 0, 0, 5);

		add(new JLabel("Data Type:"), gc);

		gc.gridx = 1;
		gc.insets = new Insets(0, 0, 0, 0);
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		add(fldDataType, gc);

		// ***COMPONENT ROW***

		gc.weightx = 1;
		gc.weighty = 0.1;

		gc.gridx = 0;
		gc.gridy++;

		gc.fill = GridBagConstraints.NONE;
		gc.anchor = GridBagConstraints.FIRST_LINE_END;
		gc.insets = new Insets(0, 0, 0, 5);

		add(new JLabel("Length:"), gc);

		gc.gridx = 1;
		gc.insets = new Insets(0, 0, 0, 0);
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		add(fldLength, gc);

		// ***COMPONENT ROW***

		gc.weightx = 1;
		gc.weighty = 0.1;

		gc.gridx = 1;
		gc.gridy++;

		gc.fill = GridBagConstraints.NONE;
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		gc.insets = new Insets(0, 0, 0, 0);

		add(btnSave, gc);

		gc.gridx = 1;
		gc.insets = new Insets(0, 70, 0, 0);
		gc.anchor = GridBagConstraints.FIRST_LINE_START;

		add(btnCancel, gc);
	}
}
