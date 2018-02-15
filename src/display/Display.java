package display;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;
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
	
	private ArrayList<JInternalFrame> internalFrames;
	
	public Display() {
		internalFrames = new ArrayList<JInternalFrame>();
		
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
		
		JMenu mnNewMenu = new JMenu("Geometry");
		mnLearn.add(mnNewMenu);
		
		JMenuItem mntmTrigonometry = new JMenuItem("Trigonometry");
		mnNewMenu.add(mntmTrigonometry);
		
		JMenuItem mntmCalculus = new JMenuItem("Calculus");
		mnLearn.add(mntmCalculus);
		
		JMenuItem mntmLinearAlgebra = new JMenuItem("Linear Algebra");
		mnLearn.add(mntmLinearAlgebra);
		
		JMenu mnPractice = new JMenu("Practice");
		menuBar.add(mnPractice);
		
		JMenuItem menuItem = new JMenuItem("Arithmatic");
		mnPractice.add(menuItem);
		
		JMenuItem menuItem_1 = new JMenuItem("Algebra");
		mnPractice.add(menuItem_1);
		
		JMenu menu = new JMenu("Geometry");
		mnPractice.add(menu);
		
		JMenuItem menuItem_2 = new JMenuItem("Trigonometry");
		menu.add(menuItem_2);
		
		JMenuItem menuItem_3 = new JMenuItem("Calculus");
		mnPractice.add(menuItem_3);
		
		JMenuItem menuItem_4 = new JMenuItem("Linear Algebra");
		mnPractice.add(menuItem_4);
		
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
		
		JToolBar taskbar = new JToolBar();
		taskbar.setFloatable(false);
		contentPane.add(taskbar, BorderLayout.SOUTH);
		
		Component horizontalStrut = Box.createHorizontalStrut(10);
		taskbar.add(horizontalStrut);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("New toggle button");
		taskbar.add(tglbtnNewToggleButton);
		
		JToggleButton tglbtnNewToggleButton_1 = new JToggleButton("New toggle button");
		taskbar.add(tglbtnNewToggleButton_1);
		
		//Action events
		mntmArithmatic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//TODO
			}
		});
		
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				internalFrames.add(new PracticeArithmatic());
				desktopPane.add(internalFrames.get(internalFrames.size()-1));
			}
		});

		menuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				internalFrames.add(new PracticeTrigonometry());
				desktopPane.add(internalFrames.get(internalFrames.size()-1));
			}
		});
	}
}
