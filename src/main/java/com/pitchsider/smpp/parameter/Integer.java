package com.pitchsider.smpp.parameter;

import java.nio.ByteBuffer;

/**
 * <p>
 * An unsigned integer value, which can be 1, 2 or 4 octets in size. The octets
 * are always encoded in Most Significant Byte (MSB) first order, otherwise
 * known as Big Endian Encoding.
 * </p>
 * <p>
 * A 1-octet Integer with a value 5, would be encoded in a single octet with the
 * value 0x05 A 2-octet integer with the decimal value of 41746 would be encoded
 * as 2 octets with the value 0xA312 A 4-octet integer with the decimal value of
 * 31022623 would be encoded as 4 octets with the value 0x1D95E1F
 * </p>
 * <p>
 * NULL Settings:
 * <ul>
 * <li>1-Octet: 0x00</li>
 * <li>2-Octet: 0x0000</li>
 * <li>4-Octet: 0x00000000</li>
 * </ul>
 * </p>
 * 
 * @author Paul Whelan
 */
public class Integer implements Parameter {

	private static int MAX_SIZE_INT = 4;

	private byte[] valueBytes;
	private int value = 0;

	/**
	 * Constructor to init the {@link Integer} as a null value;
	 * 
	 * @param size
	 *            the size to represent the null as.
	 */
	public Integer(int size) {
		this(size, 0);
	}

	/**
	 * Constructor for an {@link Integer}.
	 * 
	 * @param size
	 *            the number of bytes to represent the number.
	 * @param intValue
	 *            The int to represent.
	 */
	public Integer(int size, int intValue) {
		this.value = intValue;
		byte[] msbBytes = getMsbBytes(intValue);
		this.valueBytes = getTrimmedByteArray(msbBytes, size);
	}

	/**
	 * Gets a byte buffer containing the bytes in MSB order of an integer. This
	 * will always be of size 4.
	 * 
	 * @param intValue
	 *            The int value to get the MSB bytes for.
	 * @return The MSB bytes in a byte array.
	 */
	private byte[] getMsbBytes(int intValue) {
		return ByteBuffer.allocate(MAX_SIZE_INT).putInt(intValue).array();
	}

	/**
	 * Trim the MSB bytes to size
	 * 
	 * @param encodedBytes
	 *            The MSB bytes to trim.
	 * @param size
	 *            The size to trim the bytes to.
	 * @return the trimmed byte array.
	 */
	private byte[] getTrimmedByteArray(byte[] msbBytes, int size) {
		byte[] result = new byte[size];
		System.arraycopy(msbBytes, msbBytes.length - size, result, 0, size);
		return result;
	}

	@Override
	public byte[] write() {
		return valueBytes;
	}

	@Override
	public void read(byte[] parameterBytes) {
		this.valueBytes = parameterBytes;
		this.value = new java.lang.Integer(value).intValue();
	}

	/**
	 * Gets the int value for this {@link Integer} .
	 * 
	 * @return the int value represented by this {@link Integer}.
	 */
	public int getValue() {
		return value;
	}
}