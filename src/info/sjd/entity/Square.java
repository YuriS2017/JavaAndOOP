package info.sjd.entity;

import info.sjd.abstraction.AbstractShape;
import info.sjd.shape_interface.Shape;

public class Square extends AbstractShape {

	private double side;

	@Override
	public double getArea() {
		return side * side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
}
