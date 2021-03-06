import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.beans.PropertyVetoException;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.WindowConstants;


public class Ventana extends JFrame{

	JMenuBar menuBar;
	JInternalFrame IF_Dentro;
	JPanel panel, panel2, panel3;
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
	JButton btnLest;
	JButton btnCancel;
	JButton btnSettings;
	JButton btnDelete;
	JButton btnSlip;
	JButton btnExit;

	public Ventana() {

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
	    
	    barraDeHerramientas = new JToolBar("Barra de herramientas");
		
	    btnAdd = new JButton();
        btnEdit = new JButton();
        btnBack = new JButton();
        btnNext = new JButton();
        btnList = new JButton();
        btnSave = new JButton();
        btnPrint = new JButton();
        btnLest = new JButton();
        btnCancel = new JButton();
        btnSettings = new JButton();
        btnDelete = new JButton();
        btnSlip = new JButton();
        btnExit = new JButton();
        
        ImageIcon ic = new ImageIcon("./image/images.png");
        ImageIcon ic2 = new ImageIcon("./image/carpeta.png");
        ImageIcon ic3 = new ImageIcon("./image/back.png");
        ImageIcon ic4 = new ImageIcon("./image/next.png");
        ImageIcon ic5 = new ImageIcon("./image/list.png");
        ImageIcon ic6 = new ImageIcon("./image/save.png");
        ImageIcon ic7 = new ImageIcon("./image/print.png");
        ImageIcon ic8 = new ImageIcon("./image/lest.png");
        ImageIcon ic9 = new ImageIcon("./image/cancel.png");
        ImageIcon ic10 = new ImageIcon("./image/settings.png");
        ImageIcon ic11 = new ImageIcon("./image/delete.png");
        ImageIcon ic12 = new ImageIcon("./image/slip.png");
        ImageIcon ic13 = new ImageIcon("./image/exit.png");
        
        barraDeHerramientas.add(btnAdd);
        barraDeHerramientas.add(btnEdit);
        barraDeHerramientas.add(btnBack);
        barraDeHerramientas.add(btnNext);
        barraDeHerramientas.add(btnList);
        barraDeHerramientas.add(btnSave);
        barraDeHerramientas.add(btnPrint);
        barraDeHerramientas.add(btnLest);
        barraDeHerramientas.add(btnCancel);
        barraDeHerramientas.add(btnSettings);
        barraDeHerramientas.add(btnDelete);
        barraDeHerramientas.add(btnSlip);
        barraDeHerramientas.add(btnExit);

        btnAdd.setSize(30,  30);
    	btnAdd.setIcon(new ImageIcon(ic.getImage().getScaledInstance(btnAdd.getWidth(), btnAdd.getHeight() ,Image.SCALE_SMOOTH)));
    	btnEdit.setSize(30,  30);
    	btnEdit.setIcon(new ImageIcon(ic2.getImage().getScaledInstance(btnEdit.getWidth(), btnEdit.getHeight() ,Image.SCALE_SMOOTH)));
    	btnBack.setSize(30,  30);
    	btnBack.setIcon(new ImageIcon(ic3.getImage().getScaledInstance(btnBack.getWidth(), btnBack.getHeight() ,Image.SCALE_SMOOTH)));
    	btnNext.setSize(30,  30);
    	btnNext.setIcon(new ImageIcon(ic4.getImage().getScaledInstance(btnNext.getWidth(), btnNext.getHeight() ,Image.SCALE_SMOOTH)));
    	btnList.setSize(30,  30);
    	btnList.setIcon(new ImageIcon(ic5.getImage().getScaledInstance(btnList.getWidth(), btnList.getHeight() ,Image.SCALE_SMOOTH)));
    	btnSave.setSize(30,  30);
    	btnSave.setIcon(new ImageIcon(ic6.getImage().getScaledInstance(btnSave.getWidth(), btnSave.getHeight() ,Image.SCALE_SMOOTH)));
    	btnPrint.setSize(30,  30);
    	btnPrint.setIcon(new ImageIcon(ic7.getImage().getScaledInstance(btnPrint.getWidth(), btnPrint.getHeight() ,Image.SCALE_SMOOTH)));
    	btnLest.setSize(30,  30);
    	btnLest.setIcon(new ImageIcon(ic8.getImage().getScaledInstance(btnLest.getWidth(), btnLest.getHeight() ,Image.SCALE_SMOOTH)));
    	btnCancel.setSize(30,  30);
    	btnCancel.setIcon(new ImageIcon(ic9.getImage().getScaledInstance(btnCancel.getWidth(), btnCancel.getHeight() ,Image.SCALE_SMOOTH)));
    	btnSettings.setSize(30,  30);
    	btnSettings.setIcon(new ImageIcon(ic10.getImage().getScaledInstance(btnSettings.getWidth(), btnSettings.getHeight() ,Image.SCALE_SMOOTH)));
    	btnDelete.setSize(30,  30);
    	btnDelete.setIcon(new ImageIcon(ic11.getImage().getScaledInstance(btnDelete.getWidth(), btnDelete.getHeight() ,Image.SCALE_SMOOTH)));
    	btnSlip.setSize(30,  30);
    	btnSlip.setIcon(new ImageIcon(ic12.getImage().getScaledInstance(btnSlip.getWidth(), btnSlip.getHeight() ,Image.SCALE_SMOOTH)));
    	btnExit.setSize(30,  30);
    	btnExit.setIcon(new ImageIcon(ic13.getImage().getScaledInstance(btnExit.getWidth(), btnExit.getHeight() ,Image.SCALE_SMOOTH)));
    	
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
	    menuHelp.addSeparator();
	    
	    getContentPane().add(barraDeHerramientas, BorderLayout.NORTH);
	    
	    setJMenuBar(menuBar);
	    
	    // JDesktopPane
	    
	 	JDesktopPane dp = new JDesktopPane();

	 	IF_Dentro = new JInternalFrame();
	 	
	 	// JInternalFrame
		IF_Dentro.getContentPane().setLayout(new FlowLayout());		
		                                             // HIDE_ON_CLOSE para cerrar, pero se puede volver a abrir
		IF_Dentro.setDefaultCloseOperation(HIDE_ON_CLOSE);
		IF_Dentro.setTitle("");
		
		// Boton para minimizar y convertir en icono
		IF_Dentro.setIconifiable(true);
		
		// Boton para maximizar
		IF_Dentro.setResizable(true);
		
		// Boton para cerrar
		IF_Dentro.setClosable(true);
		
		IF_Dentro.setVisible(true);
		
    	dp.add(IF_Dentro);
    	
    	try {
			IF_Dentro.setMaximum(true);
		} catch (PropertyVetoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	// paneles
    	
    	panel = new JPanel();
    	panel.setBackground(new Color(213, 245, 227));
    	panel.setPreferredSize(new Dimension(1300, 200));
    	
    	JLabel lbl = new JLabel("Patient ID");
    	JLabel lbl2 = new JLabel("Date");
    	JLabel lbl3 = new JLabel("*Time(hh:mm)");
    	JLabel lbl4 = new JLabel("Name");
    	JLabel lbl5 = new JLabel("Sex");
    	JLabel lbl6 = new JLabel("Age");
    	JLabel lbl7 = new JLabel("Mons");
    	JLabel lbl8 = new JLabel("Days");
    	JLabel lbl9 = new JLabel("Sample By");
    	JLabel lbl10 = new JLabel("Referred By");
    	JLabel lbl11 = new JLabel("Panel Code");
    	JLabel lbl12 = new JLabel("Panel ID");
    	JLabel lbl13 = new JLabel("e-mail");
    	JLabel lbl14 = new JLabel("Lab No");
    	JLabel lbl16 = new JLabel(":");
    	
    	JLabel lbl15 = new JLabel("     ");
    	JLabel lbl17 = new JLabel("     ");
    	JLabel lbl19 = new JLabel("     ");
    	JLabel lbl18 = new JLabel("                                                                                                                                                                                                             ");
    	JLabel lbl22 = new JLabel("                                                                                                                                                                                                         ");
    	JLabel lbl25 = new JLabel("                                                                                                                                                                                   ");
    	JLabel lbl20 = new JLabel("                                                                                                                                                                                                                                                                                                                                    ");
    	JLabel lbl21 = new JLabel("                                                               ");
    	JLabel lbl24 = new JLabel("                                                  ");
    	JLabel lbl23 = new JLabel("                                                                                                                                                                                                                                                                ");
    	JLabel lbl26 = new JLabel("                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
    	
    	JTextField txt = new JTextField(10);
    	JTextField txt2 = new JTextField(10);
    	JTextField txt3 = new JTextField(20);
    	JTextField txt4 = new JTextField("0", 3);
    	JTextField txt5 = new JTextField("0", 3);
    	JTextField txt6 = new JTextField("0", 3);
    	JTextField txt7 = new JTextField(10);
    	JTextField txt8 = new JTextField(10);
    	JTextField txt9 = new JTextField(15);
    	JTextField txt10= new JTextField("0", 1);
    	JTextField txt11 = new JTextField("0", 1);
    	JTextField txt12 = new JTextField(10);
    	JTextField txt13 = new JTextField(10);
    	JTextField txt14 = new JTextField(10);
    	
    	String elementos[] = {"*2/01/2012"};
    	JComboBox <String>cmb = new JComboBox<String>(elementos);
    	
    	String elementos2[] = {"MR."};
    	JComboBox <String>cmb2 = new JComboBox<String>(elementos2);
    	
    	String elementos3[] = {"MALE"};
    	JComboBox <String>cmb3 = new JComboBox<String>(elementos3);
    	
    	panel.add(lbl);
    	panel.add(txt);
    	panel.add(lbl15);
    	panel.add(lbl2);
    	panel.add(cmb);
    	panel.add(lbl19);
    	panel.add(lbl3);
    	panel.add(txt10);
    	panel.add(lbl16);
    	panel.add(txt11);
    	panel.add(lbl17);
    	panel.add(lbl14);
    	panel.add(txt2);
    	panel.add(lbl18);
    	panel.add(lbl4);
    	panel.add(cmb2);
    	panel.add(txt3);
    	panel.add(lbl20);
    	panel.add(lbl5);
    	panel.add(cmb3);
    	panel.add(lbl6);
    	panel.add(txt4);
    	panel.add(lbl7);
    	panel.add(txt5);
    	panel.add(lbl8);
    	panel.add(txt6);
    	panel.add(lbl21);
    	panel.add(lbl9);
    	panel.add(txt7);
    	panel.add(lbl22);
    	panel.add(lbl10);
    	panel.add(txt8);
    	panel.add(txt9);
    	txt9.setEnabled(false);
    	panel.add(lbl24);
    	panel.add(lbl11);
    	panel.add(txt12);
    	panel.add(lbl25);
    	panel.add(lbl12);
    	panel.add(txt13);
    	panel.add(lbl26);
    	panel.add(lbl13);
    	panel.add(txt14);
	
    	IF_Dentro.add(panel);
    	
    	// -------------------------------------
    	
    	panel2 = new JPanel();
    	panel2.setBackground(new Color(162, 217, 206));
    	panel2.setPreferredSize(new Dimension(1300, 250));
    	GridBagLayout gbl = new GridBagLayout();
    	GridBagConstraints gbc = new GridBagConstraints();
    	panel2.setLayout(gbl);
    	
    	JTextArea ta = new JTextArea(15, 60);
    	ta.setBackground(new Color(230, 230, 230));
    	alinear(panel2, 0, 0, 1, 14, ta, gbc, gbl);
    	alinear(panel2, 1, 0, 1, 1, new JLabel("              "), gbc, gbl);
    	ta.insert("Aqui va una tabla",0);
    	
    	JLabel lbl27 = new JLabel("Lotal ledd");
    	JLabel lbl28 = new JLabel("lest Amt.");
    	JLabel lbl29 = new JLabel("Concession");
    	JLabel lbl30 = new JLabel("Home Collection");
    	JLabel lbl31 = new JLabel("lax Amt");
    	JLabel lbl32 = new JLabel("Net Amt");
    	JLabel lbl33 = new JLabel("Balance");
    	
    	JTextField txt15 = new JTextField(10);
    	JTextField txt16 = new JTextField(10);
    	JTextField txt17 = new JTextField(10);
    	JTextField txt18 = new JTextField(10);
    	JTextField txt19 = new JTextField(10);
    	JTextField txt20 = new JTextField(10);
    	JTextField txt21 = new JTextField(10);
    	
    	txt15.setBackground(new Color(0, 0, 139));
    	txt16.setBackground(new Color(0, 0, 139));
    	txt17.setBackground(new Color(0, 0, 139));
    	txt18.setBackground(new Color(0, 0, 139));
    	txt19.setBackground(new Color(0, 0, 139));
    	txt20.setBackground(new Color(0, 0, 139));
    	txt21.setBackground(new Color(0, 0, 139));

    	alinear(panel2, 2, 0, 1, 1, lbl27, gbc, gbl);
    	alinear(panel2, 2, 2, 1, 1, lbl28, gbc, gbl);
    	alinear(panel2, 2, 4, 1, 1, lbl29, gbc, gbl);
    	alinear(panel2, 2, 6, 1, 1, lbl30, gbc, gbl);
    	alinear(panel2, 2, 8, 1, 1, lbl31, gbc, gbl);
    	alinear(panel2, 2, 10, 1, 1, lbl32, gbc, gbl);
    	alinear(panel2, 2, 12, 1, 1, lbl33, gbc, gbl);
    	
    	alinear(panel2, 3, 0, 1, 1, txt15, gbc, gbl);
    	alinear(panel2, 3, 2, 1, 1, txt16, gbc, gbl);
    	alinear(panel2, 3, 4, 1, 1, txt17, gbc, gbl);
    	alinear(panel2, 3, 6, 1, 1, txt18, gbc, gbl);
    	alinear(panel2, 3, 8, 1, 1, txt19, gbc, gbl);
    	alinear(panel2, 3, 10, 1, 1, txt20, gbc, gbl);
    	alinear(panel2, 3, 12, 1, 1, txt21, gbc, gbl);
    	
    	alinear(panel2, 2, 1, 2, 1, new JLabel("              "), gbc, gbl);
    	alinear(panel2, 2, 3, 2, 1, new JLabel("              "), gbc, gbl);
    	alinear(panel2, 2, 5, 2, 1, new JLabel("              "), gbc, gbl);
    	alinear(panel2, 2, 7, 2, 1, new JLabel("              "), gbc, gbl);
    	alinear(panel2, 2, 9, 2, 1, new JLabel("              "), gbc, gbl);
    	alinear(panel2, 2, 11, 2, 1, new JLabel("              "), gbc, gbl);
    	
    	IF_Dentro.add(panel2);
    	
    	// -------------------------------------
    	
    	panel3 = new JPanel();
    	panel3.setBackground(new Color(212, 230, 241));
    	panel3.setPreferredSize(new Dimension(1300, 120));
    	panel3.setLayout(gbl);
    	
    	JLabel lbl34 = new JLabel("Home Collection");
    	JLabel lbl35 = new JLabel("Paid");
    	JLabel lbl36 = new JLabel("Pay Type");
    	JLabel lbl37 = new JLabel("Receipt No.");
    	
    	JTextField txt22 = new JTextField(10);
    	JTextField txt23 = new JTextField(10);
    	JTextField txt24 = new JTextField(10);

    	JTextArea ta2 = new JTextArea(5, 115);
    	ta2.setBackground(new Color(0, 0, 139));
    	ta2.setForeground(new Color(250, 250, 250));
    	ta2.insert("Aqui van comandos",0);
    	
    	String elementos4[] = {"CASH"};
    	JComboBox <String>cmb4 = new JComboBox<String>(elementos4);
    	
    	alinear(panel3, 0, 0, 1, 1, lbl34, gbc, gbl);
    	alinear(panel3, 3, 0, 1, 1, lbl35, gbc, gbl);
    	alinear(panel3, 6, 0, 1, 1, lbl36, gbc, gbl);
    	alinear(panel3, 9, 0, 1, 1, lbl37, gbc, gbl);
    	
    	alinear(panel3, 1, 0, 1, 1, txt22, gbc, gbl);
    	alinear(panel3, 4, 0, 1, 1, txt23, gbc, gbl);
    	alinear(panel3, 7, 0, 1, 1, cmb4, gbc, gbl);
    	alinear(panel3, 10, 0, 1, 1, txt24, gbc, gbl);
    	
    	alinear(panel3, 0, 1, 12, 1, ta2, gbc, gbl);
    	
    	alinear(panel3, 2, 0, 1, 1, new JLabel("              "), gbc, gbl);
    	alinear(panel3, 5, 0, 1, 1, new JLabel("              "), gbc, gbl);
    	alinear(panel3, 8, 0, 1, 1, new JLabel("              "), gbc, gbl);
    	alinear(panel3, 11, 0, 1, 1, new JLabel("              "), gbc, gbl);
    	
    	IF_Dentro.add(panel3);
    	
    	// -------------------------------------
    	//btnAdd.setIcon(new ImageIcon(ic.getImage().getScaledInstance(btnAdd.getWidth(), btnAdd.getHeight() ,Image.SCALE_SMOOTH)));
    	add(dp, BorderLayout.CENTER);
		
	}
	
	public void alinear(JPanel panel, int x, int y, int width, int height, Component componente, GridBagConstraints gbc, GridBagLayout gbl) {
		
		gbc.gridheight = height;
		gbc.gridwidth = width;
		gbc.gridx = x;
		gbc.gridy = y;
		
		gbl.setConstraints(componente, gbc);
		panel.add(componente, gbc);
		
	}
	
}
