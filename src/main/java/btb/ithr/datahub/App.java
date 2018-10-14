package btb.ithr.datahub;

import javax.swing.JFrame;

import btb.ithr.datahub.views.UserFrame;

public class App {
	public static void main(String[] args) {
//		LoginFrame loginFrame = new LoginFrame();
//		loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		loginFrame.setVisible(true);

		UserFrame userFrame = new UserFrame();
		userFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		userFrame.setVisible(true);
	}
}
