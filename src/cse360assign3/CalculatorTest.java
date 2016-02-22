/**Student Name: John Cava
 *PIN: 210
 *Description:
 *testCalculator - the test cases for checking the validity of the Calculator class
 */
package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testCalculator() {
		Calculator calc = new Calculator();
		assertNotNull(calc);
	}

	@Test
	public void testGetTotal() {
		Calculator calc = new Calculator();
		calc.add(5);
		calc.add(3);
		assertEquals(8, calc.getTotal());
	}

	@Test
	public void testAdd() {
		Calculator calc = new Calculator();
		calc.add(5);
		calc.add(3);
		assertEquals(8, calc.getTotal());
	}

	@Test
	public void testSubtract() {
		Calculator calc = new Calculator();
		calc.subtract(5);
		calc.subtract(3);
		assertEquals(-8, calc.getTotal());
	}

	@Test
	public void testMultiply() {
		Calculator calc = new Calculator();
		calc.multiply(5);
		assertEquals(0, calc.getTotal());
		calc.add(5);
		calc.multiply(5);
		assertEquals(25, calc.getTotal());
	}

	@Test
	public void testDivide() {
		Calculator calc = new Calculator();
		calc.divide(0);
		assertEquals(0, calc.getTotal());
		calc.add(10);
		calc.divide(2);
		assertEquals(5, calc.getTotal());
	}

	@Test
	public void testGetHistory() {
		Calculator calc = new Calculator();
		calc.add(10);
		calc.divide(2);
		assertEquals("", calc.getHistory());
	}

}
