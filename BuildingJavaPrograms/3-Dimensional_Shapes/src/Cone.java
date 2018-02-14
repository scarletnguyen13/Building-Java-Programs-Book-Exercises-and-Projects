
public class Cone extends Circular{
	public Cone(int radius, int height) {
		super(radius,height);
	}
	public int getSurfaceArea() {
		return (int) (Math.PI*Math.pow(getRadius(), 2) + Math.PI*getRadius()*Math.sqrt(Math.pow(getRadius(), 2) + Math.pow(getHeight(), 2)));
	}
	public int getVolume() {
		return super.getVolume() * (1/3);
	}
}
