package display;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.beans.PropertyVetoException;

import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.BevelBorder;

public class Display extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField searchBar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Display frame = new Display();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Display() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setIconImage(Toolkit.getDefaultToolkit().getImage(Display.class.getResource("/resources/Calculator-icon.png")));
		setTitle("Math");
		final Color toolbarColor = Color.WHITE;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(toolbarColor);
		menuBar.setBorderPainted(false);
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		mnFile.setBackground(toolbarColor);
		menuBar.add(mnFile);
		
		JMenuItem mntmSave = new JMenuItem("Save                                             Ctrl+S");
		mnFile.add(mntmSave);
		
		JSeparator separator = new JSeparator();
		mnFile.add(separator);
		
		JMenuItem mntmLogin = new JMenuItem("Login");
		mnFile.add(mntmLogin);
		
		JSeparator separator_1 = new JSeparator();
		mnFile.add(separator_1);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mnFile.add(mntmExit);
		
		JMenu mnEdit = new JMenu("Edit");
		mnEdit.setBackground(toolbarColor);
		menuBar.add(mnEdit);
		
		JMenuItem mntmOpenSource = new JMenuItem("Open Source");
		mntmOpenSource.setEnabled(false);
		mnEdit.add(mntmOpenSource);
		
		JMenu mnLearn = new JMenu("Learn");
		mnLearn.setBackground(toolbarColor);
		menuBar.add(mnLearn);
		
		JMenuItem mntmArithmatic = new JMenuItem("Arithmatic");
		mnLearn.add(mntmArithmatic);
		
		JMenuItem mntmAlgebra = new JMenuItem("Algebra");
		mnLearn.add(mntmAlgebra);
		
		JMenuItem mntmGeometry = new JMenuItem("Geometry");
		mnLearn.add(mntmGeometry);
		
		JMenuItem mntmCalculus = new JMenuItem("Calculus");
		mnLearn.add(mntmCalculus);
		
		JMenuItem mntmLinearAlgebra = new JMenuItem("Linear Algebra");
		mnLearn.add(mntmLinearAlgebra);
		
		JMenu mnCalculate = new JMenu("Calculate");
		menuBar.add(mnCalculate);
		
		JMenuItem mntmLinearAlgebra_1 = new JMenuItem("Linear Algebra");
		mnCalculate.add(mntmLinearAlgebra_1);
		
		JMenu mnHelp = new JMenu("Help");
		mnHelp.setBackground(toolbarColor);
		menuBar.add(mnHelp);
		
		JLabel lblSearch = new JLabel("Search:                       ");
		mnHelp.add(lblSearch);
		
		searchBar = new JTextField();
		mnHelp.add(searchBar);
		searchBar.setColumns(10);
		
		JMenu mnTeach = new JMenu("Teach");
		mnTeach.setEnabled(false);
		mnTeach.setBackground(toolbarColor);
		menuBar.add(mnTeach);
		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.BLACK);
		desktopPane.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(192, 192, 192), new Color(128, 128, 128), Color.GRAY, Color.DARK_GRAY));
		contentPane.add(desktopPane, BorderLayout.CENTER);
		
		JInternalFrame arithmaticLearn = new JInternalFrame("Arithmatic");
		try {
			arithmaticLearn.setClosed(true);
		} catch (PropertyVetoException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		arithmaticLearn.setEnabled(false);
		arithmaticLearn.setFrameIcon(new ImageIcon(Display.class.getResource("/resources/plus-sign.png")));
		try {
			arithmaticLearn.setIcon(true);
		} catch (PropertyVetoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		arithmaticLearn.setMaximizable(true);
		arithmaticLearn.setClosable(true);
		arithmaticLearn.setResizable(true);
		arithmaticLearn.setBounds(34, 35, 450, 300);
		desktopPane.add(arithmaticLearn);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		arithmaticLearn.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JPanel additionPanel = new JPanel();
		tabbedPane.addTab("Addition", null, additionPanel, "Improve your addition skills.");
		
		JProgressBar timer = new JProgressBar();
		timer.setValue(50);
		timer.setForeground(new Color(255, 0, 0));
		timer.setBackground(new Color(0, 128, 0));
		arithmaticLearn.getContentPane().add(timer, BorderLayout.SOUTH);
		// TODO Set up timer
		
		// TODO Set up open function
	}
}
