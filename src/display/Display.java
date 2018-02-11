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
		setIconImage(Toolkit.getDefaultToolkit().getImage(Display.class.getResource("/resources/windowIcon.ico")));
		setTitle("Math");
		final Color toolbarColor = Color.WHITE;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setRollover(true);
		toolBar.setBackground(toolbarColor);
		toolBar.setFloatable(false);
		contentPane.add(toolBar, BorderLayout.NORTH);
		
		Component rigidArea_2 = Box.createRigidArea(new Dimension(5, 20));
		toolBar.add(rigidArea_2);
		
		JButton btnFile = new JButton("File");
		btnFile.setBackground(toolbarColor);
		toolBar.add(btnFile);
		
		Component rigidArea = Box.createRigidArea(new Dimension(10, 20));
		toolBar.add(rigidArea);
		
		JButton btnLearn = new JButton("Learn");
		btnLearn.setBackground(toolbarColor);
		toolBar.add(btnLearn);
		
		Component rigidArea_1 = Box.createRigidArea(new Dimension(10, 20));
		toolBar.add(rigidArea_1);
		
		JButton btnHelp = new JButton("Help");
		btnHelp.setBackground(toolbarColor);
		toolBar.add(btnHelp);
		
		Component rigidArea_3 = Box.createRigidArea(new Dimension(10, 20));
		toolBar.add(rigidArea_3);
		
		JButton btnTeach = new JButton("Teach");
		btnTeach.setBackground(Color.WHITE);
		toolBar.add(btnTeach);
	}

}
