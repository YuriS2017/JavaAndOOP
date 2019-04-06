package info.sjd.entity;

import info.sjd.abstraction.AbstractShape;

public class Circle extends AbstractShape {

	private double radius;

	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
}
