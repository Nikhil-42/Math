package templates;

import java.util.ArrayList;

import javax.swing.JPanel;

public class ObjectList extends JPanel {
	
	private ArrayList<GeometricObject> selections;

	public ObjectList(ArrayList<GeometricObject> selections) {
		this.selections = selections;
	}

}
