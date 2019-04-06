package info.sjd.entity;

import info.sjd.abstraction.AbstractShape;
import info.sjd.shape_interface.Shape;

public class Circle extends AbstractShape implements Shape {

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
