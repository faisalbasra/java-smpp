package com.pitchsider.smpp.parameter;

import org.junit.Assert;
import org.junit.Test;

/**
 * <strong>Specified Test Cases</strong>
 * <ol>
 * <li>The string “Hello” would be encoded in 6 octets (5 characters of “Hello” and NULL octet) as follows: 0x48656C6C6F00.</li>
 * <li>A Decimal C-Octet String “123456789” would be encoded as follows: 0x31323334353637383900</li>
 * <li>A Hexadecimal C-Octet String “A2F5ED278FC” would be encoded as follows: 0x413246354544323738464300</li>
 * <li>A NULL string “” is encoded as 0x00</li>
 * <ol>
 * 
 * @author Paul Whelan
 */
public class C_OctetStringTest{

	@Test
	public void testHelloExample() {
		final String expectedString = "Hello";
		final byte[] expectedBytes = new byte[]{0x48,0x65,0x6C,0x6C,0x6F,0x00};
		testWriteGetAndRead(expectedString,expectedBytes);
	}
	
	@Test
	public void testDecimalExample() {
		final String expectedString = "123456789";
		final byte[] expectedBytes = new byte[]{0x31,0x32,0x33,0x34,0x35,0x36,0x37,0x38,0x39,0x00};
		testWriteGetAndRead(expectedString,expectedBytes);
		
	}

	@Test
	public void testHexadecimalExample() {
		final String expectedString = "A2F5ED278FC";
		final byte[] expectedBytes = new byte[]{0x41,0x32,0x46,0x35,0x45,0x44,0x32,0x37,0x38,0x46,0x43,0x00};
		testWriteGetAndRead(expectedString,expectedBytes);
	}

	@Test
	public void testNullExample() {
		final String expectedString = "";
		final byte[] expectedBytes = new byte[]{0x00};
		testWriteGetAndRead(expectedString,expectedBytes);
	}
	
	@Test
	public void testSourceAddress() {
		final String expectedString = "1234567890";
		final byte[] expectedBytes = new byte[]{0x31,0x32,0x33,0x34,0x35,0x36,0x37,0x38,0x39,0x30,0x00};
		testWriteGetAndRead(expectedString,expectedBytes);
	}
	
	protected void testWriteGetAndRead(final String expectedString, final byte[] expectedBytes) {
		//write
		C_OctetString cOctetString = new C_OctetString(expectedString);
		Assert.assertArrayEquals(expectedBytes, cOctetString.write());
		//get
		Assert.assertEquals(expectedString, cOctetString.getValue());
		//read
		cOctetString.read(expectedBytes);
		Assert.assertEquals(expectedString, cOctetString.getValue());
	}
}
