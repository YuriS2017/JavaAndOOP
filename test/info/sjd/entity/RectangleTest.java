package info.sjd.entity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectangleTest {

	@Test
	void testGetArea15() {
		Rectangle rectangle = new Rectangle();
		rectangle.setSide(5);
		rectangle.setHeight(6);
		
		double result = rectangle.getArea();
		
		assertEquals(15.0, result);
	}
}
