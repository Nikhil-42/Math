package templates;

import java.awt.Graphics;

import math.CoordinatePlane;

public abstract class GeometricObject {
	
	protected double x, y;
	protected int globalX, globalY;
	protected Parameter[] params;
	protected CoordinatePlane master;
	
	public void updateGlobalPos(int scale) {
		globalX = (int) (x*scale);
		globalY = (int) (y*scale);
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public void setCoordinatePlane(CoordinatePlane p) {
		master = p;
	}
	
	public CoordinatePlane getCoordinatePlane() {
		return master;
	}
	
	public abstract void draw(Graphics g, int scale);
}
