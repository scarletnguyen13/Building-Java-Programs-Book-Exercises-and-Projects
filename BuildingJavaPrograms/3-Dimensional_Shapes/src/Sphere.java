
public class Sphere implements Properties{
	
	private int radius;
	
	public Sphere(int radius) {
		this.radius = radius;
	}
	
	public int getSurfaceArea() {
		return (int) (4*Math.PI*Math.pow(radius, 2));
	}
	
	public int getVolume() {
		return (int) ((4/3) * Math.PI * Math.pow(radius, 3));
	}
}
