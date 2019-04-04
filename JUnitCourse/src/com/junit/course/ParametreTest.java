package com.junit.course;

import static org.junit.Assert.*;

import org.junit.Test;

public class ParametreTest {

	private HesapMakinesi hesapMakinesi = new HesapMakinesi();

	@Test
	public void testMetreKareHesapla() {
		assertEquals(20, hesapMakinesi.metreKareHesapla(10, 2));
		assertEquals(40, hesapMakinesi.metreKareHesapla(20, 2));
		assertEquals(50, hesapMakinesi.metreKareHesapla(10, 5));
		assertEquals(60, hesapMakinesi.metreKareHesapla(10, 6));
		assertEquals(70, hesapMakinesi.metreKareHesapla(10, 7));

	}

}
