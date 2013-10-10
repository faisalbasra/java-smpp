package com.pitchsider.smpp.parameter;


/**
 * An Octet String is a sequence of octets not necessarily terminated with a NULL octet. 
 * Such fields using Octet String encoding, typically represent fields that can be used to 
 * encode raw binary data. In all circumstances, the field will be either a fixed length 
 * field or explicit length field where another field indicates the length of the Octet 
 * String field. An example of this is the short_message field of the submit_sm PDU that 
 * is Octet String encoded and the previous message_length field specifies its length.
 * <p>
 * A NULL Octet-String is not encoded. The explicit length field that indicates its 
 * length should be set to zero.
 * </p>
 * 
 * @author Paul Whelan
 */
public class OctetString implements Parameter {

	@Override
	public byte[] write() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void read(byte [] bytes) {
		// TODO Auto-generated method stub
		
	}

}
