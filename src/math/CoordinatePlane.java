package math;

import java.awt.Graphics;
import java.util.ArrayList;

import templates.GeometricObject;
import templates.PaintableObject;

public class CoordinatePlane extends PaintableObject {

	private int scale = 100;
	private ArrayList<GeometricObject> objects;

	public CoordinatePlane(int scale) {
		this.scale = scale;
	}
	
	public void addObject (GeometricObject o) {
		o.setGlobalPos(o.getX()*scale, o.getY()*scale);
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub

	}

}
