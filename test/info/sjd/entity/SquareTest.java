package info.sjd.entity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquareTest {

	@Test
	void testGetArea100() {
		Square square = new Square();
		square.setSide(10);
		
		double result = square.getArea();
		
		assertEquals(100.0, result, 0.1);
	}

	@Test
	void testGetArea1000() {
		Square square = new Square();
		square.setSide(100);
		
		double result = square.getArea();
		
		assertEquals(10000.0, result, 0.1);
	}
}
