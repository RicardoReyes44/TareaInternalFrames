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
		setSize(1350, 720);
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
	    menuBar.add(new JButton("AS"));
	    
	    
	    setJMenuBar(menuBar);
	    
	    // ---------- Barra de herramientas ---------------
	 	JDesktopPane dp = new JDesktopPane();
	 	
	 	IF_Dentro = new JInternalFrame();
		IF_Dentro.getContentPane().setLayout(new FlowLayout());
		                                             // HIDE_ON_CLOSE para cerrar, pero se puede volver a abrir
		IF_Dentro.setDefaultCloseOperation(HIDE_ON_CLOSE);
		IF_Dentro.setSize(900, 70);
		IF_Dentro.setTitle("Barra de herramientas");
		
		// Boton para minimizar y convertir en icono
		IF_Dentro.setIconifiable(true);
		
		// Boton para maximizar
		IF_Dentro.setResizable(true);
		
		// Boton para cerrar
		IF_Dentro.setClosable(true);
		
		IF_Dentro.setVisible(true);
		
        btnAdd = new JButton("Add");
        btnEdit = new JButton("Edit");
        btnBack = new JButton("Back");
        btnNext = new JButton("Next");
        btnList = new JButton("List");
        btnSave = new JButton("Save");
        btnPrint = new JButton("Print");
        btnTest = new JButton("Test");
        btnCancel = new JButton("Cancel");
        btnSettings = new JButton("Settings");
        btnDelete = new JButton("Delete");
        btnSlip = new JButton("Slip");
        btnExit = new JButton("Exit");
        
        IF_Dentro.add(btnAdd);
        IF_Dentro.add(btnEdit);
        IF_Dentro.add(btnBack);
        IF_Dentro.add(btnNext);
        IF_Dentro.add(btnList);
        IF_Dentro.add(btnSave);
        IF_Dentro.add(btnPrint);
        IF_Dentro.add(btnTest);
        IF_Dentro.add(btnCancel);
        IF_Dentro.add(btnSettings);
        IF_Dentro.add(btnDelete);
        IF_Dentro.add(btnSlip);
        IF_Dentro.add(btnExit);
        
    	dp.add(IF_Dentro);
		add(dp, BorderLayout.CENTER);
		
	}

}
