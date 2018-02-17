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

}
