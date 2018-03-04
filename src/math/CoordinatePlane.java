package math;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

import templates.GeometricObject;

public class CoordinatePlane extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int scale = 100;
	private ArrayList<GeometricObject> objects;
	private boolean gridlines;

	public CoordinatePlane(int scale) {
		this.scale = scale;
		objects = new ArrayList<GeometricObject>();
	}
	
	public void addObject (GeometricObject o) {
		o.updateGlobalPos(scale);
		o.setCoordinatePlane(this);
		objects.add(o);
		
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		System.out.println("Painting Coordinate plane");
		for(GeometricObject o: objects)
			o.draw(g, scale);
		if (gridlines) {
			
		}
	}

}
