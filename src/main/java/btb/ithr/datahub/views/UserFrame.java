package btb.ithr.datahub.views;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;

import btb.ithr.datahub.util.Utility;

public class UserFrame extends JFrame {

	public UserFrame() {
		super("New User");
		// *** Frame Properties ***
		setLayout(new BorderLayout());
		setResizable(false);
		setSize(new Dimension(400, 200));
		setLocationRelativeTo(null);

		UserPanel userPanel = new UserPanel();
		Utility.changeFont(userPanel, new Font("Tahoma", Font.PLAIN, 14));

		add(userPanel, BorderLayout.CENTER);
	}
}
