import static org.junit.Assert.*;
import org.junit.Test;

public class EquilateralTriangleTest {

	@Test
	public void testGetSize() throws Exception {
		EquilateralTriangle tri = new EquilateralTriangle(3.0);
		Double test = Math.round(tri.getArea() * 10) / 10.0;
		Double result = 3.9;
		assertEquals(test, result);
	}
	
	@Test
	public void testFailInit() {
		try {
			EquilateralTriangle tri = new EquilateralTriangle(-3.0);
		} catch (Exception e) {
			System.out.println("error caught");
		}
	}
}
