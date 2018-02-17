package computations;

import static computations.General.*;

public class Triangle {
	
	public static final int SIDE_SIDE_SIDE = 0, SIDE_ANGLE_SIDE = 1, ANGLE_SIDE_SIDE = 2, ANGLE_SIDE_ANGLE = 3, SIDE_ANGLE_ANGLE = 4, ANGLE_ANGLE_ANGLE = 5;
	
	private double a, b, c, A, B, C;
	
	public Triangle(double in1, double in2, double in3, int MODE) {
		switch(MODE) {
		case SIDE_SIDE_SIDE:
			a = in1;
			b = in2;
			c = in3;
			A = Math.acos((square(b) + square(c) - square(a))/(2*b*c));
			B = Math.acos((square(a) + square(c) - square(b))/(2*a*c));
			C = Math.acos((square(a) + square(b) - square(c))/(2*a*b));
			break;
		case SIDE_ANGLE_SIDE:
			a = in1;
			b = in3;
			C = in2;
			c = square(a) + square(b) - 2*a*b*Math.cos(C);
			A = Math.asin(a * Math.sin(C)/c);
			B = Math.asin(b * Math.cos(C)/c);
			break;
		case ANGLE_SIDE_SIDE:
			a = in3;
			A = in1;
			b = in2;
			B = Math.asin(b*Math.sin(A)/a);
			c = 
			C = Math.asin(c*Math.sin(A)/a);
		}
	}

}
