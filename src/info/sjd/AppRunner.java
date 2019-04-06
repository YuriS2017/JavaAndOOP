package info.sjd;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import info.sjd.entity.Circle;
import info.sjd.entity.Rectangle;
import info.sjd.entity.Square;
import info.sjd.shape_interface.Shape;

public class AppRunner {

	private static Logger logger = Logger.getLogger(AppRunner.class.getName());

	public static void main(String[] args) {

		Square square = new Square();
		square.setSide(5);

		Rectangle rectangle = new Rectangle();
		rectangle.setBase(50);
		rectangle.setHeight(60);

		Circle circle = new Circle();
		circle.setRadius(10);

		logger.info("\n Square area " + square.getArea() + "\n Rectangle area " + rectangle.getArea()
				+ "\n Circle area " + circle.getArea());

		List<Shape> shapes = new ArrayList<Shape>();

		Shape shape1 = new Square();
		shapes.add(square);
		Shape shape2 = new Rectangle();
		shapes.add(rectangle);
		Shape shape3 = new Circle();
		shapes.add(circle);

		logger.info("maxArea shape " + getMaxArea(shapes) + " and type shape " + getMaxArea(shapes).getClass().getSimpleName());
		logger.info("minArea shape " + getMinArea(shapes) + " and type shape " + getMinArea(shapes).getClass().getSimpleName());

	}

	public static Shape getMaxArea(List<Shape> shapes) {
		Shape maxShape = shapes.get(0);

		for (Shape shape : shapes) {
			if (shape != null && maxShape.getArea() < shape.getArea()) {
					maxShape = shape;
				}
			}
		return maxShape;

	}

	public static Shape getMinArea(List<Shape> shapes) {
		Shape minShape = shapes.get(0);

		for (Shape shape : shapes) {
			if (shape != null && minShape.getArea() > shape.getArea()) {
				minShape = shape;
			}
		}
		return minShape;

	}

}
