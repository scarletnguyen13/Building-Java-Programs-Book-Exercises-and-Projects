
public class Triangular_Prism extends NonCircular{
	public Triangular_Prism(int base, int length, int height) {
		super(length, base, height);
	}
	public int getSurfaceArea() {
		int side = (int) Math.sqrt(Math.pow(getWidth()/2, 2) + Math.pow(getHeight(),2));
		return getWidth()*getHeight() + getWidth()*getHeight() + 2*side*getLength();
	}
	public int getVolume() {
		return super.getVolume() / 2;
	}
}
