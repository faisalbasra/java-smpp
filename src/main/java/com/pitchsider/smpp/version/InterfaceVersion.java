package com.pitchsider.smpp.version;

/**
 * SMPP is an evolving protocol and V5.0 represents another version of the protocol. The
 * previous versions that are commonly used are V3.3 and V3.4.
 * Version 3.4 introduced many new features that enhanced existing PDUs to support TLVs. To
 * preserve backwards compatibility for older V3.3 compliant applications, V3.4 required the
 * bind operations to set the interface_version to 0x34. V5.0 continues this approach and
 * requires the interface_version to be set to 0x50. 
 * 
 * @author Paul Whelan
 */
public enum InterfaceVersion {

	/**
	 * Represents version 3.3, usage in sharp decline. ESME supporting SMPP V3.3 
	 * or earlier will set the interface_version parameter in the bind operation 
	 * to a value less than 0x34 or equal to 0x00. 
	 */
	VERSION_33(0x33),
	
	/**
	 * Represents version 3.4, the most common SMPP
	 * version. Adds TLV support.
	 */
	VERSION_34(0x34),
	/**
	 * Represents version 5.0 of the protocol, currently the latest
	 * version of the protocol.
	 */
	VERSION_50(0x50);
	
	int version;
	
	private InterfaceVersion(int version) {
		this.version=version;
	}
	
	/**
	 * Gets the interface_version associated with this version.
	 * @return The interface_version int number associated with this version.
	 */
	public int getVersion() {
		return this.version;
	}
}