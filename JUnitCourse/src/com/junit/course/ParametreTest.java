package com.junit.course;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;



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

	private int eni;
	private int boy;
	private int toplamMetreKare;
	


	public ParametreTest(int eni, int boy, int toplamMetreKare) {
		this.eni = eni;
		this.boy = boy;
		this.toplamMetreKare = toplamMetreKare;
	}



	@Test
	public void testMetreKareHesapla() throws Exception {
		assertEquals(toplamMetreKare, hesapMakinesi.metreKareHesapla(eni, boy));

	}

}
