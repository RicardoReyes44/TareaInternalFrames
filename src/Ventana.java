import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.WindowConstants;


public class Ventana extends JFrame{

	JMenuBar menuBar;
	JInternalFrame IF_Dentro;
	JPanel panel;
	JMenu menuMasters, menuBooking, menuTestPerform, menuPrinting, menuLaoReports,
          menuSettings, menuUtilities, menuWindow, menuHelp, menuTransaction;
	JButton btnAdd = new JButton();
	JButton btnEdit = new JButton();
	JButton btnBack = new JButton();
	JButton btnNext = new JButton();
	JButton btnList = new JButton();
	JButton btnSave = new JButton();
	JButton btnPrint = new JButton();
	JButton btnTest = new JButton();
	JButton btnCancel = new JButton();
	JButton btnSettings = new JButton();
	JButton btnDelete = new JButton();
	JButton btnSlip = new JButton();
	JButton btnExit = new JButton();

	public Ventana() {

		getContentPane().setLayout(new BorderLayout());
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setSize(1200, 720);
		setLocationRelativeTo(null);
		setTitle("TareaInternalFrames");
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
	    
	    // ---------- PARA INTERNALFAMES ---------------
	 	JDesktopPane dp = new JDesktopPane();
	 	
	 	IF_Dentro = new JInternalFrame();
		IF_Dentro.getContentPane().setLayout(new FlowLayout());
		                                             // HIDE_ON_CLOSE para cerrar, pero se puede volver a abrir
		IF_Dentro.setDefaultCloseOperation(HIDE_ON_CLOSE);
		IF_Dentro.setSize(700, 100);
		IF_Dentro.setTitle("");
		
		// Boton para minimizar y convertir en icono
		IF_Dentro.setIconifiable(true);
		
		// Boton para maximizar
		IF_Dentro.setResizable(true);
		
		// Boton para cerrar
		IF_Dentro.setClosable(true);
		
		IF_Dentro.setVisible(true);
		
		panel = new JPanel();
    	panel.setBackground(Color.BLUE);
    	panel.setLayout(new FlowLayout());
    	panel.setPreferredSize(new Dimension(150, 300));
        dp.add(panel);
		
    	dp.add(IF_Dentro);
		add(dp, BorderLayout.CENTER);
		
	}

}
