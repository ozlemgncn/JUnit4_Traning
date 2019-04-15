package com.ozlemgncn.junittest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExceptionTest {

	private BilgilendirmeService bilgilendirmeService = new BilgilendirmeService();

	@Test
	public void testTryCatchException() {
		try {

			bilgilendirmeService.haftalikMailGonder();

		} catch (Exception ex) {

			assertTrue(ex instanceof MailServerUnavailableException);
			assertEquals("Mail server hata veriyor", ex.getMessage());
		}
	}

	@Test(expected = MailServerUnavailableException.class)
	public void testExpectedException() throws Exception {
		bilgilendirmeService.haftalikMailGonder();
	}

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	public void testRuleException() throws Exception {

		thrown.expect(MailServerUnavailableException.class);
		thrown.expectMessage("Mail server hata veriyor");

		bilgilendirmeService.haftalikMailGonder();
	}

}
