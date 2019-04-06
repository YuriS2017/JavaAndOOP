package info.sjd.entity;

public class Rectangle extends Square {
	
	private double base;

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}
	
	@Override
	public double getArea() {
		return getSide() * base;
	}

}
