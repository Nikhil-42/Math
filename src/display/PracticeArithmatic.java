package display;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;

public class PracticeArithmatic extends PracticeWindow {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the frame.
	 */
	public PracticeArithmatic() {
		super("Arithmatic");
		setFrameIcon(new ImageIcon(PracticeArithmatic.class.getResource("/resources/Calculator-icon.png")));
				
		
		JPanel addition = new JPanel();
		addition.setBorder(new CompoundBorder(UIManager.getBorder("Button.border"), new EtchedBorder(EtchedBorder.LOWERED, null, new Color(64, 64, 64))));
		tabbedPane.addTab("Addition", new ImageIcon(PracticeWindow.class.getResource("/resources/plus-sign.png")), addition, null);
		addition.setLayout(new CardLayout(0, 0));
		tabbedPane.setEnabledAt(0, true);
	}

}
