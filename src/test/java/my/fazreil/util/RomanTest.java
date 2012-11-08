package my.fazreil.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanTest extends Roman {

	@Test
	public void testRomanize() {
		Roman roman = new Roman();
		assertTrue("MCCXXXIV".equals(roman.romanize(new Long(1234))));
	}

	@Test
	public void testRomanize1() {
		Roman roman = new Roman();
		assertTrue("IV".equals(roman.romanize(new Long(4))));
	}
	
	@Test
	public void testRomanize2() {
		Roman roman = new Roman();
		assertTrue("M".equals(roman.romanize(new Long(1000))));
	}
}
