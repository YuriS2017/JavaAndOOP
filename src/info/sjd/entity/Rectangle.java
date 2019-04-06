package info.sjd.entity;

import info.sjd.abstraction.AbstractShape;

public class Rectangle extends AbstractShape {

	private double base;
	private double height;

	@Override
	public double getArea() {
		return (base * height) / 2.0;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	
}
