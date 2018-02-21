package display;

import java.awt.BorderLayout;
import java.awt.Component;
import java.beans.PropertyVetoException;

import javax.swing.Box;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

import templates.CalculateWindow;

public class CalculateArithmetic extends CalculateWindow {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Create the frame.
	 */
	public CalculateArithmetic() {
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		getContentPane().add(splitPane, BorderLayout.CENTER);
		
		Component verticalStrut = Box.createVerticalStrut(64);
		splitPane.setLeftComponent(verticalStrut);
		
		JPanel panel = new JPanel();
		splitPane.setRightComponent(panel);

	}

}
