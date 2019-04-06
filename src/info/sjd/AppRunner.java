package info.sjd;

import java.util.logging.Level;
import java.util.logging.Logger;

import info.sjd.entity.Rectangle;
import info.sjd.entity.Square;

public class AppRunner {
	
	private static Logger logger = Logger.getLogger(AppRunner.class.getName());
	
	public static void main(String[] args) {
		Square square = new Square();
		square.setSide(10);
		
		Rectangle rectangle = new Rectangle();
		rectangle.setSide(10);
		rectangle.setBase(2);
		
		logger.log(Level.INFO, "Area of square with side " + square.getSide() + " is " + square.getArea());
		logger.log(Level.WARNING, "Area of square with side " + square.getSide() + " is " + square.getArea());
		logger.log(Level.SEVERE, "Area of square with side " + square.getSide() + " is " + square.getArea());
		
		logger.info("Area of square with side " + square.getSide() + " is " + square.getArea());
		logger.warning("Area of square with side " + square.getSide() + " is " + square.getArea());
		logger.severe("Area of square with side " + square.getSide() + " is " + square.getArea());
		
		//System.out.println("Area of square with side " + square.getSide() + " is " + square.getArea());
		
		//System.out.println("Area of rectangle with side " + square.getSide() + " and with base " + rectangle.getBase() + " is " + rectangle.getArea());
	}

}
