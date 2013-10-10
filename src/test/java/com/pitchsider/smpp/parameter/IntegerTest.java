package com.pitchsider.smpp.parameter;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for {@link Integer}.
 * <p>
 * A 1-octet Integer with a value 5, would be encoded in a single octet with the
 * value 0x05 A 2-octet integer with the decimal value of 41746 would be encoded
 * as 2 octets with the value 0xA312 A 4-octet integer with the decimal value of
 * 31022623 would be encoded as 4 octets with the value 0x1D95E1F
 * </p>
 * NULL Settings: 
 * <ul>
 * <li>1-Octet: 0x00</li>
 * <li>2-Octet: 0x0000</li>
 * <li>4-Octet: 0x00000000</li>
 * </ul>
 * 
 * @author Paul Whelan
 * 
 */
public class IntegerTest {

	@Test
	public void testSingleOctet() {
		final byte[] expectedBytes = new byte[] { 0x05 };
		final int expectedValue = 5;
		Integer singleOctetValue = new Integer(1, expectedValue);
		
		verifyGetValue(singleOctetValue,expectedValue);
		verifyWrite(singleOctetValue, expectedBytes);
		verifyRead(singleOctetValue, expectedBytes, expectedValue);
	}

	@Test
	public void testTwoOctet() {
		final byte[] expectedBytes = new byte[] {(byte) 0xA3, 0x12 };
		final int expectedValue = 41746;
		Integer twoOctetValue = new Integer(2, expectedValue);

		verifyGetValue(twoOctetValue,expectedValue);
		verifyWrite(twoOctetValue, expectedBytes);
		verifyRead(twoOctetValue, expectedBytes, expectedValue);
	}

	@Test
	public void testFourOctet() {
		final byte[] expectedBytes = new byte[] { 0x01, (byte) 0xD9, 0x5E, 0x1F };
		final int expectedValue = 31022623;
		Integer fourOctetValue = new Integer(4, expectedValue);
		
		verifyGetValue(fourOctetValue,expectedValue);
		verifyWrite(fourOctetValue, expectedBytes);
		verifyRead(fourOctetValue, expectedBytes, expectedValue);
	}
	
	@Test
	public void testNullSingleOctet() {
		final byte[] expectedBytes = new byte[] { 0x00 };
		final int expectedValue = 0;
		Integer singleOctetNull = new Integer(1);

		verifyGetValue(singleOctetNull,expectedValue);
		verifyWrite(singleOctetNull, expectedBytes);
		verifyRead(singleOctetNull, expectedBytes, expectedValue);
	}
	
	@Test
	public void testNullTwoOctet() {
		final byte[] expectedBytes = new byte[] { 0x00 , 0x00 };
		final int expectedValue = 0;
		Integer twoOctetNull = new Integer(2);

		verifyGetValue(twoOctetNull,expectedValue);
		verifyWrite(twoOctetNull, expectedBytes);
		verifyRead(twoOctetNull, expectedBytes, expectedValue);
	}

	@Test
	public void testNullFourOctet() {
		final byte[] expectedBytes = new byte[] { 0x00 , 0x00, 0x00 , 0x00 };
		final int expectedValue = 0;
		Integer fourOctetNull = new Integer(4);

		verifyGetValue(fourOctetNull,expectedValue);
		verifyWrite(fourOctetNull, expectedBytes);
		verifyRead(fourOctetNull, expectedBytes, expectedValue);
	}
	
	private void verifyGetValue(Integer integer, int expectedValue) {
		Assert.assertEquals(expectedValue, integer.getValue());
	}
	
	private void verifyWrite(Integer integer, byte[] expectedBytes) {
		byte[] actualBytes = integer.write();
		Assert.assertArrayEquals(expectedBytes, actualBytes);
	}

	private void verifyRead(Integer integer, byte[] bytesToRead, int expectedValue) {
		integer.read(bytesToRead);
		verifyGetValue(integer, expectedValue);
	}
}
