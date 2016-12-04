package com.example.tdd.test;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.example.tdd.app.ArtikYilKontrol;

import junit.framework.TestCase;
 

@RunWith(Parameterized.class)
public class LeapYearParameterizedTest extends TestCase {
	private int yil;
	private boolean beklenenDeger;
	
	public LeapYearParameterizedTest()
	{}

	public LeapYearParameterizedTest(int yil, boolean beklenenDeger) {
		this.yil = yil;
		this.beklenenDeger = beklenenDeger;
	}


	@Test
	public void testArtikYilmiBu(){
		ArtikYilKontrol artikYilKontrolcu = new ArtikYilKontrol();
		assertEquals(beklenenDeger, artikYilKontrolcu.artikYilmi(yil));
	}

	@Parameters
	public static Collection<Object[]> yillar(){
		return Arrays.asList(
				new Object[][] { { 1996, true }, { 2004, true }, { 2000, true }, { 1700, false }, { 2100, false } });
	}
}
