package display;

import java.awt.BorderLayout;
import java.awt.Color;
import java.beans.PropertyVetoException;

import javax.swing.JInternalFrame;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;

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
		
		JSlider difficulty = new JSlider();
		difficulty.setOrientation(SwingConstants.VERTICAL);
		getContentPane().add(difficulty, BorderLayout.EAST);
		this.setVisible(true);

	}

}
