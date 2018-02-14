package display;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.beans.PropertyVetoException;

import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import java.awt.CardLayout;
import javax.swing.JSlider;
import javax.swing.SwingConstants;

public class PracticeWindow extends JInternalFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the frame.
	 */
	public PracticeWindow(String title) {
		setIconifiable(true);
		setFrameIcon(new ImageIcon(PracticeWindow.class.getResource("/resources/Calculator-icon.png")));
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
		getContentPane().add(tabbedPane, BorderLayout.CENTER);
		tabbedPane.setName("tabs");
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("New tab", null, panel, null);
		
		JSlider Difficulty = new JSlider();
		Difficulty.setOrientation(SwingConstants.VERTICAL);
		getContentPane().add(Difficulty, BorderLayout.EAST);
		this.setVisible(true);

	}
	
	protected Component getComponentByName(String name) {
		for(int n = 0; n < this.getComponentCount(); n++) {
			String s = getComponent(n).get
			if(getComponent(n).getName()!=null)
				if(getComponent(n).getName().equals(name))
					return getComponent(n);
		}
		return new JTabbedPane();
	}

}
