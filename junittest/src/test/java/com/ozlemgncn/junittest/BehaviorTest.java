package com.ozlemgncn.junittest;


import static org.mockito.Mockito.*;

import org.junit.Test;


public class BehaviorTest {

	@Test
	// verify metodunu kullanarak, test işlemi yapıldı.
	public void testBehavior() throws Exception {

		DumyCustomerService customerService = mock(DumyCustomerService.class);

		customerService.addCustomer("İstanbul");
		customerService.addCustomer("Ankara");

		verify(customerService).addCustomer("İstanbul");
		verify(customerService).addCustomer("Ankara");

	}

	@Test
	public void testKacKereCagrıidi() throws Exception {

		//times metod kaç defa çağrılmış onun hesabı yapılmktadır.
		DumyCustomerService customerService = mock(DumyCustomerService.class);

		customerService.addCustomer("İstanbul");
		customerService.addCustomer("İstanbul");
		customerService.addCustomer("İstanbul");
		customerService.addCustomer("Ankara");
		
		verify(customerService, times(3)).addCustomer("İstanbul");
		verify(customerService, times(1)).addCustomer("Ankara");
		
		//removeCustomer hiç bir zaman çağırlmadış, parametre farketmez.
		verify(customerService, never()).removeCustomer(anyString());
		
		//Çağırlmadı.
		verify(customerService, never()).addCustomer("İzmir"); 
		
		//En az 2 kere çağırıldı.
		verify(customerService,atLeast(1)).addCustomer("Ankara");

		

	}

}
