package com.junit.course;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssertTest {

	@Test
	public void testAssertions() {

		Dummy d1 = null;
		Dummy d2 = new Dummy(5);

		assertTrue(d1 == null);

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
