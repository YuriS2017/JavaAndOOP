package info.sjd;

import java.util.logging.Logger;

import info.sjd.entity.Circle;
import info.sjd.entity.Rectangle;
import info.sjd.entity.Square;

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

	}

}
