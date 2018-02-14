
public abstract class NonCircular implements Properties{
	
	private int length;
	private int width;
	private int height;
	
	public NonCircular(int length, int width, int height) {
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	public int getLength() {
		return this.length;
	}
	
	public int getWidth() {
		return this.width;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public int getSurfaceArea() {
		return 2*length*width + 2*length*height + 2*width*height;
	}
	
	public int getVolume() {
		return length*width*height;
	}
}
