package btb.ithr.datahub.views;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

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

		setJMenuBar(createMenuBar());

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	private JMenuBar createMenuBar() {
		JMenuBar menuBar = new JMenuBar();

		JMenu mnuFile = new JMenu("File");
		JMenuItem miNewRecord = new JMenuItem("Create New Record");
		JMenuItem miExit = new JMenuItem("Exit");

		mnuFile.add(miNewRecord);
		mnuFile.addSeparator();
		mnuFile.add(miExit);

		menuBar.add(mnuFile);

		mnuFile.setMnemonic(KeyEvent.VK_F);
		miExit.setMnemonic(KeyEvent.VK_X);

		miExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));

		miExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});

		return menuBar;
	}
}
