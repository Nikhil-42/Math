package computations;

import static computations.General.*;

public class Triangle {

	public static final int SIDE_SIDE_SIDE = 0, SIDE_ANGLE_SIDE = 1, ANGLE_SIDE_SIDE = 2, ANGLE_SIDE_ANGLE = 3,
			SIDE_ANGLE_ANGLE = 4, ANGLE_ANGLE_ANGLE = 5;

	private double a, b, c;
	private Angle A, B, C;
	private int setupMode;
	
	public Triangle(double a, double b, double c) {
		this(a, b, c, SIDE_SIDE_SIDE);
	}
	
	public Triangle(double a, Angle C, double b) {
		this(a, C.getMeasure(), b, SIDE_ANGLE_SIDE);
	}
	
	public Triangle(Angle A, double b, double a) {
		this(A.getMeasure(), b, a, ANGLE_SIDE_SIDE);
	}
	
	public Triangle(Angle A, double b, Angle C) {
		
	}
	
	public Triangle(double in1, double in2, double in3, int MODE) {
		setupMode = MODE;
		switch (MODE) {
		case SIDE_SIDE_SIDE:
			a = in1;
			b = in2;
			c = in3;
			A = arccos((square(b) + square(c) - square(a)) / (2 * b * c));
			B = arccos((square(a) + square(c) - square(b)) / (2 * a * c));
			C = arccos((square(a) + square(b) - square(c)) / (2 * a * b));
			break;
		case SIDE_ANGLE_SIDE:
			a = in1;
			b = in3;
			C = new Angle(in2);
			c = square(a) + square(b) - 2 * a * b * cos(C);
			A = arcsin(a * sin(C) / c);
			B = arcsin(b * cos(C) / c);
			break;
		case ANGLE_SIDE_SIDE:
			a = in3;
			A = new Angle(in1);
			b = in2;
			B = arcsin(b * sin(A) / a);
			C = new Angle(180 - in1 - B.getMeasure());
			c = sin(C) * a / sin(A);
			break;
		case ANGLE_SIDE_ANGLE:
			A = new Angle(in1);
			B = new Angle(180-in1-in3);
			C = new Angle(in3);
			a = sin(A) * in2 / sin(B);
			b = in2;
			c = sin(C) * b / sin(B);
		}
	}

	public double getSide(String id) {
		double out;
		out = 0;
		id.toLowerCase();
		switch (id) {
		case "a":
			out = a;
			break;
		case "b":
			out = b;
			break;
		case "c":
			out = c;
			break;
		}
		return out;
	}

	public Angle getAngle(String id) {
		Angle out = new Angle(0);
		id.toLowerCase();
		switch (id) {
		case "a":
			out = A;
			break;
		case "b":
			out = B;
			break;
		case "c":
			out = C;
			break;
		}
		return out;
	}
}
