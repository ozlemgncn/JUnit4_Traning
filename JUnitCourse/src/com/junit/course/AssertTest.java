package com.junit.course;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssertTest {

	@Test
	public void testAssertions() {
		
		Dummy d1 = new Dummy(5);
		Dummy d2 = new Dummy(5);
		
		assertEquals(d1, d2);
		
	}
	
	private static class Dummy {
		
		private int id;

		public Dummy(int id) {
			this.id = id;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}
	}

}
