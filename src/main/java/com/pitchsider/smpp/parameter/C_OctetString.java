package com.pitchsider.smpp.parameter;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/**
 * A C-Octet String is a sequence of ASCII characters terminated with a NULL
 * octet (0x00). <br/>
 * <ul>
 * <li>
 * The string “Hello” would be encoded in 6 octets (5 characters of “Hello” and
 * NULL octet) as follows: 0x48656C6C6F00</li>
 * <ul>
 * <br/>
 * <br/>
 * Two special variants exist for use within SMPP. These are C-octet String
 * (Decimal) and C-Octet String (Hexadecimal), which are used to carry decimal
 * and hexadecimal digit sequences respectively. These fields are encoded the
 * same way as any ASCII string, but are specifically used to designate decimal
 * and hexadecimal numbers when presented in string format.
 * <p>
 * <ul>
 * <li>
 * A Decimal C-Octet String “123456789” would be encoded as follows:
 * 0x31323334353637383900</li>
 * <li>
 * A Hexadecimal C-Octet String “A2F5ED278FC” would be encoded as follows:
 * 0x413246354544323738464300</li>
 * <ul>
 * <p>
 * A NULL string “” is encoded as 0x00
 * </p>
 * 
 * @author Paul Whelan
 */
public class C_OctetString implements Parameter {

	private String value;
	private byte[] valueBytes;

	public C_OctetString(String string) {
		ByteBuffer encodedValue = ByteBuffer.allocate(string.length()+1);
		byte[] chars = string.getBytes(Charset.forName("ASCII"));
		encodedValue.put(chars);
		encodedValue.put((byte)0x00);
		this.valueBytes = encodedValue.array();
		this.value = string;
	}

	@Override
	public byte[] write() {
		return valueBytes;
	}

	@Override
	public void read(byte[] bytes) {
		
		String value = new String(bytes,Charset.forName("ASCII"));
		//strip off the null
		value = value.substring(0, value.length()-1);
		this.value = value;
		this.valueBytes = bytes;
	}

	public String getValue() {
		return value;
	}
}