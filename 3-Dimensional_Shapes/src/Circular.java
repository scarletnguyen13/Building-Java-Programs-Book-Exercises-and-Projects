
public abstract class Circular implements Properties{
	
	private int radius;
	private int height;
	
	public Circular(int radius, int height) {
		this.radius = radius;
		this.height = height;
	}
	
	public abstract int getSurfaceArea();
	
	public int getVolume() {
		return (int) ((int) Math.PI*Math.pow(radius, 2)*height);
	}
	
	public int getRadius() {
		return this.radius;
	}
	
	public int getHeight() {
		return this.height;
	}
}
