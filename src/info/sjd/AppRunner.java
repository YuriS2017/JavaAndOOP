package info.sjd;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import info.sjd.entity.Circle;
import info.sjd.entity.Rectangle;
import info.sjd.entity.Square;
import info.sjd.shape_interface.Shape;

public class AppRunner {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger(AppRunner.class.getName());

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
		
		//взять у каждого shape значение метода getArea()
		//сравнить их
		
		double maxArea = 0;
		Shape max = null;
		Shape min = null;
		
		int count = 1;
		for(Shape shape : shapes) {
			if(shape != null) {
				double result = shape.getArea();
				System.out.println("Area shape" + count + " - " + result);
				if(result > maxArea) {
					maxArea = result;
					max = shape;
				}
				
			}
			count++;
		}
		
		logger.info("maxArea shape " + max.getArea() + " and type shape " + max.getClass());
		//System.out.println("maxArea shape " + max.getArea() + " and type shape " + max.getClass());
		
		
	}

}
