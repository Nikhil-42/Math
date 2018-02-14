package display;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.beans.PropertyVetoException;

import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;

public class LearnArithmatic extends JInternalFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the frame.
	 */
	public LearnArithmatic() {
		setIconifiable(true);
		setFrameIcon(new ImageIcon(LearnArithmatic.class.getResource("/resources/Calculator-icon.png")));
		setMaximizable(true);
		try {
			setSelected(true);
			setIcon(true);
		} catch (PropertyVetoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setTitle("Arithmatic");
		setResizable(true);
		setClosable(true);
		setBounds(100, 100, 450, 300);
		
		JProgressBar timer = new JProgressBar();
		timer.setBackground(Color.RED);
		timer.setForeground(Color.GREEN);
		getContentPane().add(timer, BorderLayout.SOUTH);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JPanel addition = new JPanel();
		addition.setBorder(new CompoundBorder(UIManager.getBorder("Button.border"), new EtchedBorder(EtchedBorder.LOWERED, null, new Color(64, 64, 64))));
		tabbedPane.addTab("Addition", new ImageIcon(LearnArithmatic.class.getResource("/resources/plus-sign.png")), addition, null);
		tabbedPane.setEnabledAt(0, true);
		this.setVisible(true);

	}

}
