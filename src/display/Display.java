package display;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JSeparator;
import javax.swing.JDesktopPane;
import javax.swing.border.BevelBorder;
import java.awt.SystemColor;

public class Display extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

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
		menuBar.setBackground(Color.WHITE);
		menuBar.setBorderPainted(false);
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		mnFile.setBackground(Color.WHITE);
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
		mnEdit.setBackground(Color.WHITE);
		menuBar.add(mnEdit);
		
		JMenuItem mntmOpenSource = new JMenuItem("Open Source");
		mnEdit.add(mntmOpenSource);
		
		JMenu mnLearn = new JMenu("Learn");
		mnLearn.setBackground(Color.WHITE);
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
		
		JMenu mnHelp = new JMenu("Help");
		mnHelp.setBackground(Color.WHITE);
		menuBar.add(mnHelp);
		
		JMenu mnTeach = new JMenu("Teach");
		mnTeach.setEnabled(false);
		mnTeach.setBackground(Color.WHITE);
		menuBar.add(mnTeach);
		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(SystemColor.desktop);
		desktopPane.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(192, 192, 192), new Color(128, 128, 128), Color.GRAY, Color.DARK_GRAY));
		contentPane.add(desktopPane, BorderLayout.CENTER);
	}

}
