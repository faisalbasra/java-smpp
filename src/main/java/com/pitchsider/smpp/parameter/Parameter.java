package com.pitchsider.smpp.parameter;

import java.nio.ByteBuffer;

/**
 * Defines the methods required by {@link Parameter}s. A parameter is the building block
 * for PDUs in the SMPP protocol.
 * 
 * @author Paul Whelan
 */
public interface Parameter {

	/**
	 * write the representation of the {@link Parameter} to the byte array.
	 * @param byteBuffer The byte buffer to write the bytes representing the parameter to.
	 */
	public void write(ByteBuffer byteBuffer);
	
	/**
	 * Read the Parameter from the {@link ByteBuffer} provided.
	 * @param byteBuffer The {@link ByteBuffer} containing the bytes that represent the parameter.
	 * We construct the parameter from reading from this {@link ByteBuffer}.
	 */
	public void read(ByteBuffer byteBuffer);
}
