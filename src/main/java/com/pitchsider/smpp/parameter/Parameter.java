package com.pitchsider.smpp.parameter;


/**
 * Defines the methods required by {@link Parameter}s. A parameter is the building block
 * for PDUs in the SMPP protocol.
 * 
 * @author Paul Whelan
 */
public interface Parameter {

	/**
	 * write the representation of the {@link Parameter} to the byte array.
	 * @return The byte array representing the bytes representing the parameter.
	 */
	public byte[] write();
	
	/**
	 * Read the Parameter from the byte array provided.
	 * @param parameterBytes The byte array containing the bytes that represent the parameter.
	 * We construct the parameter from reading from this value.
	 */
	public void read(byte[] parameterBytes);
}
