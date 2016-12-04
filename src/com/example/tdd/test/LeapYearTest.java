package com.example.tdd.test;

import org.junit.Before;
import org.junit.Test;
import com.example.tdd.app.ArtikYilKontrol;
import junit.framework.TestCase;

public class LeapYearTest extends TestCase {

	@Before
	public void setUp() throws Exception {
		System.out.println("Test metodu çaðrýlacak...");
		super.setUp();
	}

	@Test
	public void testArtikYilmi() {
		ArtikYilKontrol a = new ArtikYilKontrol();
		assertEquals(true, a.artikYilmi(1996));
		assertEquals(true, a.artikYilmi(2004));
		assertEquals(true, a.artikYilmi(2000));
		assertEquals(false, a.artikYilmi(1700));
		assertEquals(false, a.artikYilmi(2100));
	}

	@Override
	public void tearDown() throws Exception {
		System.out.println("Test metodu çalýþtý bitti");
		super.tearDown();
	}
}
