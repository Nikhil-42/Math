package templates;

import java.awt.Dimension;
import java.beans.PropertyVetoException;

import javax.swing.JInternalFrame;

public class CalculateWindow extends JInternalFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CalculateWindow() {
		setClosable(true);
		setSize(new Dimension(500, 300));
		try {
			setSelected(true);
		} catch (PropertyVetoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setVisible(true);
		setResizable(true);
		setOpaque(true);
		setIconifiable(true);
		setMaximizable(true);
		try {
			setIcon(true);
		} catch (PropertyVetoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setBounds(100, 100, 450, 300);
	}

}
