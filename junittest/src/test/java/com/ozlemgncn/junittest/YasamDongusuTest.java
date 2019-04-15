package com.ozlemgncn.junittest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.JVM)
public class YasamDongusuTest {
	
	@BeforeClass
	public static void beforecls() {
		System.out.println("Her test sınıfı için öncesi");

	}
	
	@AfterClass
	
	public static void aftercls() {
		
		System.out.println("Her test sınıfı için sonrası");
	}

	@Before
	public void setUp() {
		System.out.println("Method öncesi");

	}

	@Test
	public void tesHelloWorld1() {
		System.out.println("Test1 Metodu");
	}

	@Test
	public void tesHelloWorld2() {
		System.out.println("Test2 Metodu");
	}

	@Test
	public void tesHelloWorld3() {
		System.out.println("Test3 Metodu");
	}

	@After
	public void tearDown() {

		System.out.println("Metot'dan sonra");

	}

}
