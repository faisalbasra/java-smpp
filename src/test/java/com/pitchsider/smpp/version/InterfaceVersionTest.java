package com.pitchsider.smpp.version;


import org.junit.Assert;
import org.junit.Test;

/**
 * @author Paul Whelan
 */
public class InterfaceVersionTest {

	@Test
	public void testVersion33() {
		InterfaceVersion interfaceVersion = InterfaceVersion.VERSION_33;
		Assert.assertEquals(0x33, interfaceVersion.getVersion());
	}

	@Test
	public void testVersion34() {
		InterfaceVersion interfaceVersion = InterfaceVersion.VERSION_34;
		Assert.assertEquals(0x34, interfaceVersion.getVersion());
	}

	@Test
	public void testVersion50() {
		InterfaceVersion interfaceVersion = InterfaceVersion.VERSION_50;
		Assert.assertEquals(0x50, interfaceVersion.getVersion());
	}
}