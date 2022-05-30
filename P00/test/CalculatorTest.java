import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	int a, b;
	Calculator cal;

	@Before
	public void setUp() throws Exception {

		a = 4321;
		b = 1234;
		cal = new Calculator();

	}

	@Test
	public void testadd() {
		int actual = cal.add(a, b);
		int expected = 5555;

		assertEquals(expected, actual);

	}

	@Test
	public void testsub() {
		int actual = cal.sub(a, b);
		int expected = 3087;

		assertEquals(expected, actual);

	}

	@Test
	public void testmul() {
		int actual = cal.mul(a, b);
		int expected = 5332114;

		assertEquals(expected, actual);

	}

	@Test
	public void testdiv() {
		int actual = cal.div(a, b);
		int expected = 3;

		assertEquals(expected, actual);
	}

	@After
	public void tearDown() throws Exception {
	}

}
