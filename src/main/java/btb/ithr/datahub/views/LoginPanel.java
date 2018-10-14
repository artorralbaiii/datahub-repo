package btb.ithr.datahub.views;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class LoginPanel extends JPanel {

	private JTextField fldUsername;
	private JPasswordField fldPassword;
	private JButton btnLogin;
	private JButton btnNewUser;

	public LoginPanel() {
		Border innerBorder = BorderFactory.createEtchedBorder(); // createTitledBorder("Authentication");
		Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);

		setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));

		fldUsername = new JTextField(20);
		fldPassword = new JPasswordField(20);
		btnLogin = new JButton("Login");
		btnNewUser = new JButton("New User");

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
		gc.anchor = GridBagConstraints.LINE_END;
		gc.insets = new Insets(0, 0, 0, 5);

		add(new JLabel("Username:"), gc);

		gc.gridx = 1;
		gc.insets = new Insets(0, 0, 0, 0);
		gc.anchor = GridBagConstraints.LINE_START;
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

		gc.gridx = 1;
		gc.gridy++;

		gc.fill = GridBagConstraints.NONE;
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		gc.insets = new Insets(0, 0, 0, 5);

		add(btnLogin, gc);

		gc.gridx = 1;
		gc.insets = new Insets(0, 70, 0, 0);
		gc.anchor = GridBagConstraints.FIRST_LINE_START;

		add(btnNewUser, gc);

	}

}
