package com.ozlemgncn.junittest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

public class HamcrestTest {

	@Test
	public void testTemelEslestirme() {

		String text1 = "Ozlem";
		String text2 = "Ozlem1";

		assertEquals("Ozlem", text1);

		assertThat(text1, is(equalTo("Ozlem")));
		assertThat(text1, is(notNullValue()));
		assertThat(text1, containsString("lem"));
		assertThat(text1, anyOf(containsString("Oz"), containsString("lem")));
	}

	@Test
	public void testListeler() {

		List<String> sehirler = new ArrayList<String>(Arrays.asList("Istanbul", "Ankara", "Izmir"));

		assertThat(sehirler, hasItem("Istanbul"));

		assertThat(sehirler, hasItems("Istanbul", "Izmir"));

		assertThat(sehirler, allOf(hasItems("Istanbul", "Izmir"), not(hasItem("Bursa"))));
		assertThat(sehirler, allOf(hasItems("Istanbul", "Izmir"), not(hasItem("Bursa"))));
		assertThat(sehirler, either(hasItems("Istanbul", "Izmir")).or(not(hasItem("Bursa"))));

	}
}
