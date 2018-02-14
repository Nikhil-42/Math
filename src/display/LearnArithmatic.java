package display;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.beans.PropertyVetoException;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;

public class LearnArithmatic extends PracticeWindow {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the frame.
	 */
	public LearnArithmatic() {
		super("Arithmatic");
		setFrameIcon(new ImageIcon(LearnArithmatic.class.getResource("/resources/Calculator-icon.png")));
		
		JTabbedPane tabbedPane = (JTabbedPane) super.getComponentByName("tabs");
				
		
		JPanel addition = new JPanel();
		addition.setBorder(new CompoundBorder(UIManager.getBorder("Button.border"), new EtchedBorder(EtchedBorder.LOWERED, null, new Color(64, 64, 64))));
		tabbedPane.addTab("Addition", new ImageIcon(PracticeWindow.class.getResource("/resources/plus-sign.png")), addition, null);
		addition.setLayout(new CardLayout(0, 0));
		tabbedPane.setEnabledAt(0, true);
		
		JSlider Difficulty = new JSlider();
		Difficulty.setOrientation(SwingConstants.VERTICAL);
		getContentPane().add(Difficulty, BorderLayout.EAST);
		this.setVisible(true);

	}

}
