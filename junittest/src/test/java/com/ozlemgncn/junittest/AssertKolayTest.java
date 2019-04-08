package com.ozlemgncn.junittest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class AssertKolayTest {

	private HesapMakinesi hesapMakinesi = new HesapMakinesi();

	@Test
	@Parameters({ "10,2,20", "20,3,60" })

	public void testMetreKareHesaplama(int eni, int boyu, int toplamMetreKare) throws Exception {

		assertEquals(toplamMetreKare, hesapMakinesi.metreKareHesapla(eni, boyu));
	}

}
