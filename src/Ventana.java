import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.WindowConstants;


public class Ventana extends JFrame{

	JMenuBar menuBar;
	JMenu menuMasters, menuBooking, menuTestPerform, menuPrinting, menuLaoReports,
          menuSettings, menuUtilities, menuWindow, menuHelp, menuTransaction;


	public Ventana() {

		getContentPane().setLayout(new BorderLayout());
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setSize(1200, 700);
		setLocationRelativeTo(null);
		setTitle("InternalFrames");
		setVisible(true);

		menuBar = new JMenuBar();
	    menuMasters = new JMenu("Masters");
	    menuBooking = new JMenu("Booking");
	    menuTestPerform = new JMenu("TestPerform");
	    menuPrinting = new JMenu("Printing");
	    menuTransaction = new JMenu("Transaction");
	    menuLaoReports = new JMenu("Lao Reports");
	    menuSettings = new JMenu("Settings");
	    menuUtilities = new JMenu("Utilities");
	    menuWindow = new JMenu("Window");
	    menuHelp = new JMenu("Help");

	    menuBar.add(menuMasters);
	    menuBar.add(menuBooking);
	    menuBar.add(menuTestPerform);
	    menuBar.add(menuPrinting);
	    menuBar.add(menuTransaction);
	    menuBar.add(menuLaoReports);
	    menuBar.add(menuSettings);
	    menuBar.add(menuUtilities);
	    menuBar.add(menuWindow);
	    menuBar.add(menuHelp);
	    setJMenuBar(menuBar);
		
	}

}
