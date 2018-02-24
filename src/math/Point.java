package math;

import java.awt.Graphics;

import templates.GeometricObject;

public class Point extends GeometricObject {
	
	private int x, y;
	private int globalX, globalY;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void draw(Graphics g, int scale) {
		// TODO Auto-generated method stub
		int arbitrary = 10;
		g.drawOval(globalX, globalY, arbitrary, arbitrary);
		g.drawString("( " + x + ", " + y + ")", (int) (globalX + arbitrary*1.25), (int) (globalY - arbitrary*1.25));
	}

}
