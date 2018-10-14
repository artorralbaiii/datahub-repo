package btb.ithr.datahub.views;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class UserPanel extends JPanel {

	private JTextField fldName;
	private JTextField fldUsername;
	private JPasswordField fldPassword;
	private JPasswordField fldCPassword;
	private JButton btnSave;
	private JButton btnCancel;

	public UserPanel() {

		fldName = new JTextField(20);
		fldUsername = new JTextField(20);
		fldPassword = new JPasswordField(20);
		fldCPassword = new JPasswordField(20);
		btnSave = new JButton("Save");
		btnCancel = new JButton("Cancel");

		Border innerBorder = BorderFactory.createTitledBorder("New User");
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

		add(new JLabel("Name:"), gc);

		gc.gridx = 1;
		gc.insets = new Insets(0, 0, 0, 0);
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		add(fldName, gc);

		// ***COMPONENT ROW***

		gc.weightx = 1;
		gc.weighty = 0.1;

		gc.gridx = 0;
		gc.gridy++;

		gc.fill = GridBagConstraints.NONE;
		gc.anchor = GridBagConstraints.FIRST_LINE_END;
		gc.insets = new Insets(0, 0, 0, 5);

		add(new JLabel("Username:"), gc);

		gc.gridx = 1;
		gc.insets = new Insets(0, 0, 0, 0);
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		add(fldUsername, gc);

		// ***COMPONENT ROW***

		gc.weightx = 1;
		gc.weighty = 0.1;

		gc.gridx = 0;
		gc.gridy++;

		gc.fill = GridBagConstraints.NONE;
		gc.anchor = GridBagConstraints.FIRST_LINE_END;
		gc.insets = new Insets(0, 0, 0, 5);

		add(new JLabel("Password:"), gc);

		gc.gridx = 1;
		gc.insets = new Insets(0, 0, 0, 0);
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		add(fldPassword, gc);

		// ***COMPONENT ROW***

		gc.weightx = 1;
		gc.weighty = 0.1;

		gc.gridx = 0;
		gc.gridy++;

		gc.fill = GridBagConstraints.NONE;
		gc.anchor = GridBagConstraints.FIRST_LINE_END;
		gc.insets = new Insets(0, 0, 0, 5);

		add(new JLabel("Confirm Password:"), gc);

		gc.gridx = 1;
		gc.insets = new Insets(0, 0, 0, 0);
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		add(fldCPassword, gc);

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
