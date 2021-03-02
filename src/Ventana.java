import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
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
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.WindowConstants;


public class Ventana extends JFrame{

	JMenuBar menuBar;
	JInternalFrame IF_Dentro;
	JPanel panel;
	GridBagConstraints gbc = new GridBagConstraints();
	GridBagLayout gbl = new GridBagLayout();
	JToolBar barraDeHerramientas;
	JMenu menuMasters, menuBooking, menuTestPerform, menuPrinting, menuLaoReports,
          menuSettings, menuUtilities, menuWindow, menuHelp, menuTransaction;
	JButton btnAdd;
	JButton btnEdit;
	JButton btnBack;
	JButton btnNext;
	JButton btnList;
	JButton btnSave;
	JButton btnPrint;
	JButton btnTest;
	JButton btnCancel;
	JButton btnSettings;
	JButton btnDelete;
	JButton btnSlip;
	JButton btnExit;

	public Ventana() {

		barraDeHerramientas = new JToolBar("Barra de herramientas");
		barraDeHerramientas.add(new JButton("AS"));

		getContentPane().setLayout(gbl);
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
        
        barraDeHerramientas.add(btnAdd);
        barraDeHerramientas.add(btnEdit);
        barraDeHerramientas.add(btnBack);
        barraDeHerramientas.add(btnNext);
        barraDeHerramientas.add(btnList);
        barraDeHerramientas.add(btnSave);
        barraDeHerramientas.add(btnPrint);
        barraDeHerramientas.add(btnTest);
        barraDeHerramientas.add(btnCancel);
        barraDeHerramientas.add(btnSettings);
        barraDeHerramientas.add(btnDelete);
        barraDeHerramientas.add(btnSlip);
        barraDeHerramientas.add(btnExit);
	    
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
	    menuBar.add(barraDeHerramientas);
	    
	    
	    setJMenuBar(menuBar);
	    

	 	JDesktopPane dp = new JDesktopPane();

	 	IF_Dentro = new JInternalFrame();
		IF_Dentro.getContentPane().setLayout(new FlowLayout());		
		                                             // HIDE_ON_CLOSE para cerrar, pero se puede volver a abrir
		IF_Dentro.setDefaultCloseOperation(HIDE_ON_CLOSE);
		IF_Dentro.setSize(900, 70);
		IF_Dentro.setTitle("");
		
		// Boton para minimizar y convertir en icono
		IF_Dentro.setIconifiable(true);
		
		// Boton para maximizar
		IF_Dentro.setResizable(true);
		
		// Boton para cerrar
		IF_Dentro.setClosable(true);
		
		IF_Dentro.setVisible(true);
        
    	dp.add(IF_Dentro);
		add(dp, BorderLayout.CENTER);
		
	}

}
