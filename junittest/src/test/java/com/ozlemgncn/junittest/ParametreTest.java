package com.ozlemgncn.junittest;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;


@RunWith(Parameterized.class)
public class ParametreTest {

	private HesapMakinesi hesapMakinesi = new HesapMakinesi();

	@Parameterized.Parameters
	public static Collection<Object[]> data (){
		return Arrays.asList(new Object[] []{
			{10,2,20},
			{20,2,40},
			{10,5,50},
			{10,6,60},
			{10,7,70}});
	}

	@Parameter(0)
	public int eni;
	@Parameter(1)
	public int boy;
	@Parameter(2)
	public int toplamMetreKare;


	@Test
	public void testMetreKareHesapla() throws Exception {
		assertEquals(toplamMetreKare, hesapMakinesi.metreKareHesapla(eni, boy));

	}

}
