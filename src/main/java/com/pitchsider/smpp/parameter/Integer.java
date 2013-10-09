package com.pitchsider.smpp.parameter;

import java.nio.ByteBuffer;

/**
 * <p>
 * An unsigned integer value, which can be 1, 2 or 4 octets in size. 
 * The octets are always encoded in Most Significant Byte (MSB) first order, 
 * otherwise known as Big Endian Encoding.
 * </p>
 * <p>
 * A 1-octet Integer with a value 5, would be encoded in a single octet with 
 * the value 0x05 A 2-octet integer with the decimal value of 41746 would be 
 * encoded as 2 octets with the value 0xA312 A 4-octet integer with the decimal 
 * value of 31022623 would be encoded as 4 octets with the value 0x1D95E1F
 * </p>
 * <p>
 * NULL Settings: 
 * <ul>
 * <li>1-Octet: 0x00</li>
 * <li>2-Octet: 0x0000</li>
 * <li>4-Octet: 0x00000000</li>
 * </ul>
 * </p>
 * @author Paul Whelan
 */
public class Integer implements Parameter {

	private Integer value;
	
	public Integer(int value) {
		this.value = new Integer(value);
	}

	@Override
	public void write(ByteBuffer byteBuffer) {
	}

	@Override
	public void read(ByteBuffer byteBuffer) {
		// TODO Auto-generated method stub
		
	}
	
}
