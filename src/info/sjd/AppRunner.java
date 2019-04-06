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
		rectangle.setBase(5);
		rectangle.setHeight(6);

		Circle circle = new Circle();
		circle.setRadius(10);

		logger.info("\n Square area " + square.getArea() + "\n Rectangle area " + rectangle.getArea()
				+ "\n Circle area " + circle.getArea());
		
        List<Shape> shapes = new ArrayList<Shape>();
		
		Shape shape1 = new Square();
		shape1 = square;
		shapes.add(shape1);
		Shape shape2 = new Rectangle();
		shape2 = rectangle;
		shapes.add(shape2);
		Shape shape3 = new Circle();
		shape3 = circle;
		shapes.add(shape3);
		
		
		logger.info("maxArea shape " + getMaxArea(shapes) + " and type shape " + getMaxArea(shapes).getClass());
		logger.info("minArea shape " + getMinArea(shapes) + " and type shape " + getMinArea(shapes).getClass());


	}
	
	public static Shape getMaxArea(List<Shape> shapes) {
		double maxArea = shapes.get(0).getArea();
		Shape max = null;
		
		for(Shape shape : shapes) {
			if(shape != null) {
				double result = shape.getArea();
				if(result > maxArea) {
					maxArea = result;
					max = shape;
				}
				
			}
		}
		
		return max;
		
	}
	
	public static Shape getMinArea(List<Shape> shapes) {
		double minArea = shapes.get(0).getArea();
		Shape min = null;
		
		for(Shape shape : shapes) {
			if(shape != null) {
				double result = shape.getArea();
				if(result < minArea) {
					minArea = result;
					min = shape;
				}
				
			}
		}
		
		return min;
		
	}

}
