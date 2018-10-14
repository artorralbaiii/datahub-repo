package btb.ithr.datahub.views;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;

import btb.ithr.datahub.util.Utility;

public class DataFormFrame extends JFrame{

	public DataFormFrame() {
		super("Record Details");

		// *** Frame Properties ***
		setLayout(new BorderLayout());
		setResizable(false);
		setSize(new Dimension(400, 230));
		setLocationRelativeTo(null);

		DataFormPanel dataFormPanel = new DataFormPanel();
		Utility.changeFont(dataFormPanel, new Font("Tahoma", Font.PLAIN, 14));

		add(dataFormPanel, BorderLayout.CENTER);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
