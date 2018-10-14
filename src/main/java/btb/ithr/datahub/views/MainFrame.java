package btb.ithr.datahub.views;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;

import btb.ithr.datahub.util.Utility;

public class MainFrame extends JFrame {
	public MainFrame() {
		super("Datahub Repository");

		// *** Frame Properties ***
		setLayout(new BorderLayout());
		setResizable(false);
		setSize(new Dimension(800, 600));
		setLocationRelativeTo(null);

		MainPanel mainPanel = new MainPanel();
		Utility.changeFont(mainPanel, new Font("Tahoma", Font.PLAIN, 14));

		add(mainPanel, BorderLayout.NORTH);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
