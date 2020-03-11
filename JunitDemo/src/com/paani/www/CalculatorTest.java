package com.paani.www;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	private Calculator calc;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
	}

	@Before
	public void setUp() throws Exception {
		calc = new Calculator();
	}

	@After
	public void tearDown() throws Exception {
		calc = null;
	}

	@Test
	public void testAdd() {
		double result = calc.add(10.5, 20.32);
		assertEquals(30.82, result , 0);
		//fail("Not yet implemented");
	}

	@Test
	public void testSubtract() {
		double result = calc.subtract(100.5, 100);
		assertEquals(0.5, result ,0);
		//fail("Not yet implemented");
	}

	@Test
	public void testMultiply() {
		double result = calc.multiply(2.5,100);
		assertEquals(250, result , 255.5);
		//fail("Not yet implemented");
	}

	@Test
	public void testDivide() {
		double result = calc.divide(20.40, 4);
		assertEquals(5.8, result , 5.0);
		//fail("Not yet implemented");
	}
	@Test(expected = ArithmeticException.class)
	public void testDivideByZero(){
		calc.divide(100.5,0);
	}

}
