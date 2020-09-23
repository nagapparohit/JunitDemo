package com.nagappa;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MyMathTest {
	/**
	 * There is no gurantee in unit test which test run before which test
	 * 
	 * All that junit gurantee is that test will be , order is not that guarateed
	 */
	//instead of creating mymath instance in every junit test we can create it here
	MyMath myMath = new MyMath();
	/**
	 * @before mean this will be running before every test
	 */
	@Before
	public void before() {
		System.out.println("Before");
	}
	//MyMath.sum
	@Test
	public void sum_with3numbers() {
	//	fail("Not yet implemented");
		//Absence of failure is success
		//MyMath myMath = new MyMath();
		System.out.println("test1");
		int result = myMath.sum(new int[] {1,2,3});
		
		assertEquals(6,result);
		
	}
	
	@Test
	public void sum_with1number() {
		System.out.println("test2");
		//	MyMath myMath = new MyMath();
		int result = myMath.sum(new int[] {3});
		
		assertEquals(3,result);
		
	}


}
