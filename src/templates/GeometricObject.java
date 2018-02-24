package templates;

import java.awt.Graphics;

public abstract class GeometricObject {
	
	private int x, y;
	private int globalX, globalY;
	
	public void setGlobalPos(int x, int y) {
		globalX = x;
		globalY = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public abstract void draw(Graphics g, int scale);
}
