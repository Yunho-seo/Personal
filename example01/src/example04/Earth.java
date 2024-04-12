package example04;

public class Earth {
	public static final double EARTH_RADIUS = 6378.137;
	public final static double EARTH_AREA;
	
	static {
		EARTH_AREA = 4.0 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}
}
