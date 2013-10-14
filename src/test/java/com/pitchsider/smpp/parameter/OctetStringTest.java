package com.pitchsider.smpp.parameter;

import java.nio.charset.Charset;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Paul Whelan
 *
 */
public class OctetStringTest {
	
	@Test
	public void testNullExample() {
		final String expectedString = "";
		final byte[] expectedBytes = new byte[]{};
		testWriteGetAndRead(expectedString,expectedBytes);
	}

	@Test
	public void testHexExample() {
		final String expectedString = "A2F5ED278FC";
		final byte[] expectedBytes = new byte[]{0x41,0x32,0x46,0x35,0x45,0x44,0x32,0x37,0x38,0x46,0x43};
		testWriteGetAndRead(expectedString,expectedBytes);
	}

	@Test
	public void testNullTermintatedStringExample() {
		final byte[] expectedBytes = new byte[]{0x41,0x32,0x46,0x35,0x45,0x44,0x32,0x37,0x38,0x46,0x43,0x00};
		final String expectedString = new String(expectedBytes,Charset.forName("ASCII"));
		testWriteGetAndRead(expectedString,expectedBytes);
	}

	
	protected void testWriteGetAndRead(final String expectedString, final byte[] expectedBytes) {
		//write
		OctetString octetString = new OctetString(expectedString);
		Assert.assertArrayEquals(expectedBytes, octetString.write());
		//get
		Assert.assertEquals(expectedString, octetString.getValue());
		//read
		octetString.read(expectedBytes);
		Assert.assertEquals(expectedString, octetString.getValue());
	}
}
