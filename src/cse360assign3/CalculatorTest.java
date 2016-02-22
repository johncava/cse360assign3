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
	/**
	 * @author John Cava
	 * @param None
	 * @return None
	 * Tests if the Calculator contructor works
	 */
	public void testCalculator() {
		Calculator calc = new Calculator();
		assertNotNull(calc);
	}

	@Test
	/**
	 * @author John Cava
	 * @param None
	 * @return None
	 * Tests if the Calculator class returns the total value
	 */
	public void testGetTotal() {
		Calculator calc = new Calculator();
		calc.add(5);
		calc.add(3);
		assertEquals(8, calc.getTotal());
	}

	@Test
	/**
	 * @author John Cava
	 * @param None
	 * @return None
	 * Tests if the Calculator class adds the value correctly
	 */
	public void testAdd() {
		Calculator calc = new Calculator();
		calc.add(5);
		calc.add(3);
		assertEquals(8, calc.getTotal());
	}

	@Test
	/**
	 * @author John Cava
	 * @param None
	 * @return None
	 * Tests if the Calculator class subtracts the value from the total value correctly
	 */
	public void testSubtract() {
		Calculator calc = new Calculator();
		calc.subtract(5);
		calc.subtract(3);
		assertEquals(-8, calc.getTotal());
	}

	@Test
	/**
	 * @author John Cava
	 * @param None
	 * @return None
	 * Tests if the Calculator class multiplies the value correctly
	 */
	public void testMultiply() {
		Calculator calc = new Calculator();
		calc.multiply(5);
		assertEquals(0, calc.getTotal());
		calc.add(5);
		calc.multiply(5);
		assertEquals(25, calc.getTotal());
	}

	@Test
	/**
	 * @author John Cava
	 * @param None
	 * @return None
	 * Tests if the Calculator class divides the total by the value correctly
	 */
	public void testDivide() {
		Calculator calc = new Calculator();
		calc.divide(0);
		assertEquals(0, calc.getTotal());
		calc.add(10);
		calc.divide(2);
		assertEquals(5, calc.getTotal());
	}

	@Test
	/**
	 * @author John Cava
	 * @param None
	 * @return None
	 * Tests if the Calculator class returns the correct string representation of the computation history
	 */
	public void testGetHistory() {
		Calculator calc = new Calculator();
		calc.add(10);
		calc.divide(2);
		assertEquals("0 + 10 / 2", calc.getHistory());
		calc.divide(0);
		assertEquals("0 + 10 / 2 / 0", calc.getHistory());
	}

}
