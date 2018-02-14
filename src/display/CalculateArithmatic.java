package display;

import java.awt.EventQueue;
import java.beans.PropertyVetoException;

import javax.swing.JInternalFrame;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JPanel;

public class CalculateArithmatic extends JInternalFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Create the frame.
	 */
	public CalculateArithmatic() {
		setIconifiable(true);
		setMaximizable(true);
		try {
			setIcon(true);
		} catch (PropertyVetoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setBounds(100, 100, 450, 300);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		getContentPane().add(splitPane, BorderLayout.CENTER);
		
		Component verticalStrut = Box.createVerticalStrut(64);
		splitPane.setLeftComponent(verticalStrut);
		
		JPanel panel = new JPanel();
		splitPane.setRightComponent(panel);

	}

}
