package computations;

public class General {
	
	public static double square(double n) {
		return Math.pow(n, 2);
	}
	
	public static double DegToRad(double deg) {
		return deg * Math.PI/180;
	}
	
	public static double RadToDeg(double rad) {
		return rad * 180 / Math.PI;
	}
	
	public static double sin(Angle measure) {
		return Math.sin(measure.getMeasure());
	}
	
	public static double cos(Angle measure) {
		return Math.cos(measure.getMeasure());
	}

	public static Angle arcsin(double ratio) {
		return new Angle(Math.asin(ratio));
	}
	
	public static Angle arccos(double ratio) {
		return new Angle(Math.acos(ratio));
	}
}
