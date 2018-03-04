package templates;

import java.util.ArrayList;

import javax.swing.JPanel;

public class ParameterList extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<Parameter> params;

	public ParameterList() {
		params = new ArrayList<Parameter>();
	}
	
	public void addParam(Parameter p) {
		params.add(p);
		add(p);
	}

}
