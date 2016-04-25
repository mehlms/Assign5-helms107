import static org.junit.Assert.*;

import org.junit.Test;

public class RightAngledTriangleTest {

	@Test
	public void test() throws Exception {
		RightAngledTriangle tri = new RightAngledTriangle(3.0, 4.0, 5.0);
		Double test = Math.round(tri.getArea() * 10) / 10.0;
		System.out.println(test);
		Double result = 6.0;
		assertEquals(result, test);
	}
	
	@Test
	public void testFailInit() {
		try {
			RightAngledTriangle tri = new RightAngledTriangle(3.0, 4.0, 6.0);
		} catch (Exception e) {
			System.out.println("error caught");
		}
	}

}
