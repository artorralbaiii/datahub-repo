package btb.ithr.datahub.views;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;

import btb.ithr.datahub.util.Utility;

public class LoginFrame extends JFrame {

	public LoginFrame() {
		super("Login");

		// *** Frame Properties ***
		setLayout(new BorderLayout());
		setResizable(false);
		setSize(new Dimension(400, 150));
		setLocationRelativeTo(null);

		LoginPanel loginPanel = new LoginPanel();
		Utility.changeFont(loginPanel, new Font("Tahoma", Font.PLAIN, 14));

		add(loginPanel, BorderLayout.CENTER);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
