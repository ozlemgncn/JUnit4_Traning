package com.ozlemgncn.junittest;

public class BilgilendirmeService {

	public void yeniKayitMailGonder(Musteri musteri)

	{
		System.out.println("Mail gönderildi.");
	}
	
	public void haftalikMailGonder() {
		
		throw new MailServerUnavailableException("Mail server hata veriyor");
	}

}
