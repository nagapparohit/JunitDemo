package com.nagappa;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
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
		//database connectoin all that you can do here
		System.out.println("Before");
	}
	
	@After
	public void after() {
		//if some clean up you wana do you can do in after test
		System.out.println("after");
	}
	//before class and after class method will execute only once before and after after all methdod comp.
	//before class and after class methods should be static as they are class level methods
	@BeforeClass
	public static  void beforeClass() {
		System.out.println("before class method");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("after class method");
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
