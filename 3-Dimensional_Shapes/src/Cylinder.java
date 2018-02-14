
public class Cylinder extends Circular{
	public Cylinder(int radius, int height) {
		super(radius,height);
	}
	public int getSurfaceArea() {
		return (int) (2*Math.PI*getRadius()*getHeight() + 2*Math.PI*Math.pow(getRadius(), 2));
	}
}
