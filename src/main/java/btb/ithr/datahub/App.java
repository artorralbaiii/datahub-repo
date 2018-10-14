package btb.ithr.datahub;

import javax.swing.SwingUtilities;

import btb.ithr.datahub.views.DataFormFrame;

public class App {
	public static void main(String[] args) {
//		LoginFrame loginFrame = new LoginFrame();
//		loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		loginFrame.setVisible(true);

//		UserFrame userFrame = new UserFrame();
//		userFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		userFrame.setVisible(true);
		
//		MainFrame mainFrame = new MainFrame();
//		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		mainFrame.setVisible(true);
//		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new DataFormFrame();
			}
		});	
	}
}
