package display;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.JInternalFrame;
import javax.swing.JSplitPane;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.beans.PropertyVetoException;

import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;
import javax.swing.border.CompoundBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.border.EtchedBorder;

public class CalculateTrigonometry extends JInternalFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CalculateTrigonometry() {
		setSize(new Dimension(500, 300));
		try {
			setSelected(true);
		} catch (PropertyVetoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setName("Trig Window");
		setVisible(true);
		setTitle("Calculate Trigonometry");
		setResizable(true);
		setOpaque(true);
		
		JSplitPane controlsDisplay = new JSplitPane();
		getContentPane().add(controlsDisplay, BorderLayout.CENTER);
		
		JSplitPane buttonsArgs = new JSplitPane();
		buttonsArgs.setMaximumSize(new Dimension(64, 2147483647));
		buttonsArgs.setPreferredSize(new Dimension(128, 25));
		buttonsArgs.setOrientation(JSplitPane.VERTICAL_SPLIT);
		controlsDisplay.setLeftComponent(buttonsArgs);
		
		JPanel addObjectPanel = new JPanel();
		addObjectPanel.setMaximumSize(new Dimension(64, 32767));
		buttonsArgs.setRightComponent(addObjectPanel);
		
		Box stackObjectButtons = Box.createVerticalBox();
		addObjectPanel.add(stackObjectButtons);
		
		JLabel lblNewLabel = new JLabel("Create an object:");
		lblNewLabel.setAlignmentX(Component.RIGHT_ALIGNMENT);
		stackObjectButtons.add(lblNewLabel);
		
		JButton createTriangle = new JButton("Triangle");
		createTriangle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton createVariable = new JButton("Variable");
		createVariable.setAlignmentX(Component.CENTER_ALIGNMENT);
		stackObjectButtons.add(createVariable);
		
		JButton btnSegment = new JButton("Segment");
		btnSegment.setAlignmentX(Component.CENTER_ALIGNMENT);
		stackObjectButtons.add(btnSegment);
		createTriangle.setAlignmentX(Component.CENTER_ALIGNMENT);
		stackObjectButtons.add(createTriangle);
		
		JPanel parametersPanel = new JPanel();
		buttonsArgs.setLeftComponent(parametersPanel);
		
		Box stackParameters = Box.createVerticalBox();
		parametersPanel.add(stackParameters);
		
		JLabel lblParameters = new JLabel("Parameters");
		lblParameters.setAlignmentX(Component.CENTER_ALIGNMENT);
		stackParameters.add(lblParameters);
		
		Component horizontalStrut = Box.createHorizontalStrut(128);
		stackParameters.add(horizontalStrut);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBorder(new CompoundBorder(new TitledBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null), "Content Pane", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)), new EtchedBorder(EtchedBorder.LOWERED, null, null)));
		controlsDisplay.setRightComponent(layeredPane);
	}

}
