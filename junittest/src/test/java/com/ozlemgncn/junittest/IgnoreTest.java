package com.ozlemgncn.junittest;

import org.junit.Ignore;
import org.junit.Test;

public class IgnoreTest {

	@Test
	public void testMerhaba()throws Exception {
		
		System.out.println("Merhaba");
	}
	
	@Test
	@Ignore("Bu method daha sonra kullanılacaktır.")
	public void testMerhaba2() {
		System.out.println("Merhaba 2");
	}
}
