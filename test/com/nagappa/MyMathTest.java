package com.nagappa;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyMathTest {
	
	//instead of creating mymath instance in every junit test we can create it here
	MyMath myMath = new MyMath();
	//MyMath.sum
	@Test
	public void sum_with3numbers() {
	//	fail("Not yet implemented");
		//Absence of failure is success
		//MyMath myMath = new MyMath();
		int result = myMath.sum(new int[] {1,2,3});
		
		assertEquals(6,result);
		
	}
	
	@Test
	public void sum_with1number() {
	//	MyMath myMath = new MyMath();
		int result = myMath.sum(new int[] {3});
		
		assertEquals(3,result);
		
	}


}
