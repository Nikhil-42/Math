package display;

import java.awt.BorderLayout;
import java.awt.Color;
import java.beans.PropertyVetoException;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Font;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PracticeWindow extends JInternalFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected JTabbedPane tabbedPane;
	protected JSlider difficulty;
	protected JProgressBar timer;

	/**
	 * Create the frame.
	 */
	public PracticeWindow(String title) {
		setIconifiable(true);
		setMaximizable(true);
		try {
			setSelected(true);
			setIcon(true);
		} catch (PropertyVetoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setTitle(title);
		setResizable(true);
		setClosable(true);
		setBounds(100, 100, 450, 300);
		
		JProgressBar timer = new JProgressBar();
		timer.setBackground(Color.RED);
		timer.setForeground(Color.GREEN);
		getContentPane().add(timer, BorderLayout.SOUTH);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		this.tabbedPane = tabbedPane;
		getContentPane().add(tabbedPane, BorderLayout.CENTER);
		tabbedPane.setName("tabs");
		
		JPanel test = new JPanel();
		tabbedPane.add("Test", test);
		test.setLayout(new BorderLayout(0, 0));
		
		JButton btnStartTest = new JButton("Start Test");
		btnStartTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				beginTest();
			}
		});
		btnStartTest.setBorder(new SoftBevelBorder(BevelBorder.RAISED, new Color(255, 255, 255), new Color(192, 192, 192), new Color(0, 0, 0), new Color(64, 64, 64)));
		btnStartTest.setFont(new Font("AR BLANCA", Font.BOLD | Font.ITALIC, 23));
		btnStartTest.setForeground(Color.GRAY);
		btnStartTest.setBackground(Color.BLACK);
		test.add(btnStartTest);
		
		int margin = 50;
		
		Component verticalStrut = Box.createVerticalStrut(margin);
		test.add(verticalStrut, BorderLayout.NORTH);
		
		Component verticalStrut_1 = Box.createVerticalStrut(margin);
		test.add(verticalStrut_1, BorderLayout.SOUTH);
		
		Component horizontalStrut = Box.createHorizontalStrut(margin);
		test.add(horizontalStrut, BorderLayout.WEST);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(margin);
		test.add(horizontalStrut_1, BorderLayout.EAST);
		
		JSlider difficulty = new JSlider();
		difficulty.setOrientation(SwingConstants.VERTICAL);
		getContentPane().add(difficulty, BorderLayout.EAST);
		this.setVisible(true);

	}
	
	protected void beginTest() {
	}
}
