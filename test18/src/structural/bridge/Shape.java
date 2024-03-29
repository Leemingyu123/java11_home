package structural.bridge;

public abstract class Shape {
	protected Color color;	//composition
	
	public Shape(Color color) {
		this.color = color;
	}
	
	abstract public void applyColor();
}
