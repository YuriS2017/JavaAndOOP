package info.sjd.entity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CircleTest {

	@Test
	void testGetArea() {
		Circle circle = new Circle();
		circle.setRadius(10);
		
		assertEquals(314.15926, circle.getArea(), 0.00001);
	}

}
