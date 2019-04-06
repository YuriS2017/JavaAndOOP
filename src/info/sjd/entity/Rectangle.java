package info.sjd.entity;

import info.sjd.shape_interface.Shape;

public class Rectangle extends Square implements Shape {

	private double height;

	@Override
	public double getArea() {
		return (getSide() * height) / 2.0;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
}
