import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {

	@Test
	public void testGetSize() throws Exception {
		Triangle tri = new Triangle(4.0, 3.0, 3.0);
		Double test = Math.round(tri.getArea() * 10) / 10.0;
		Double result = 4.5;
		assertEquals(test, result);
	}
	
	@Test
	public void testGetA() throws Exception {
		Triangle tri = new Triangle(4.0, 3.0, 3.0);
		Double test = tri.getSideA();
		Double result = 4.0;
		assertEquals(test, result);
	}
	
	@Test
	public void testGetB() throws Exception {
		Triangle tri = new Triangle(4.0, 3.0, 3.0);
		Double test = tri.getSideB();
		Double result = 3.0;
		assertEquals(test, result);
	}
	
	@Test
	public void testGetC() throws Exception {
		Triangle tri = new Triangle(4.0, 3.0, 3.0);
		Double test = tri.getSideC();
		Double result = 3.0;
		assertEquals(test, result);
	}
	
	@Test
	public void testFailInit() {
		try {
			Triangle tri = new Triangle(-3.0, 4.0, 6.0);
		} catch (Exception e) {
			System.out.println("error caught");
		}
	}

}
