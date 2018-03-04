package templates;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Parameter extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private double value;
	private Runnable entered;
	private JTextField field;

	public Parameter(String name, Runnable entered, GeometricObject parent) {
		this.name = name;
		this.entered = entered;
		setName(name);
		JLabel label = new JLabel(name + " : ");
		field = new JTextField();
		field.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				getEnter().run();
			}
		});
		field.setSize(new Dimension(30, 10));
		field.setPreferredSize(new Dimension(100, 20));
		field.setMinimumSize(new Dimension(25, 20));
		field.setText("enter param");
		field.setColumns(1);
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		add(label);
		add(field);
		
		parent.getCoordinatePlane().getParent();
	}
	
	public double getValue() {
		value = Double.parseDouble(field.getText());
		return value;
	}
	
	public String getName() {
		return name;
	};
	
	public Runnable getEnter() {
		return entered;
	}
}
