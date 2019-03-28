package com.junit.course;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {

	@Test
	public void test() {
		
		StringHelper helper = new StringHelper();
		
		/*String actual =helper.truncateAInFirst2Positions("AACD");
		  String expected = helper.truncateAInFirst2Positions("CD");
		 * 
		 */
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));

		
		

	}
}
