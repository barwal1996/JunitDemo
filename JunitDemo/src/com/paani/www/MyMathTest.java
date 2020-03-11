package com.paani.www;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyMathTest {
	MyMath myMath = new MyMath();
/*
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMyMath() {
		fail("Not yet implemented");
	}

	@Test
	public void testSum() {
		fail("Not yet implemented");
	}
	*/
	@Test
	public void sum_with3number(){
		System.out.println("Test1");
		assertEquals(6,myMath.sum(new int[] {1,2,3}));
	}
	
	@Test
	public void sum_with1number(){
		System.out.println("Test2");
		assertEquals(3,myMath.sum(new int[] {3}));
	}

}
