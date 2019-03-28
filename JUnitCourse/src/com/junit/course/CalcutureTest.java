package com.junit.course;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcutureTest {

	@Test
	public void test() {
		
		Calcuture clt  = new Calcuture();
		
		int actual = clt.sumHelper();
		
		assertEquals(7, actual);
	}

}
