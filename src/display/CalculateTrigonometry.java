package display;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import math.CoordinatePlane;
import math.Triangle;
import templates.CalculateWindow;

public class CalculateTrigonometry extends CalculateWindow {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CalculateTrigonometry() {
		super();
		
		
		
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
		
		JPanel panel = new JPanel();
		stackParameters.add(panel);
		
		CoordinatePlane output = new CoordinatePlane(50);
		output.setBorder(new CompoundBorder(new TitledBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null), "Content Pane", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)), new EtchedBorder(EtchedBorder.LOWERED, null, null)));
		controlsDisplay.setRightComponent(output);
		
		//Action Events
		createTriangle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				output.addObject(new Triangle(2,2,1));
			}
		});		
	}

}
